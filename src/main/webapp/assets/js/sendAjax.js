function sendAjax(obj) {
    var request = $.ajax({
        type: obj.type,
        contentType: "application/json;charset=UTF-8",
        url: obj.url,
        data: (obj.type === "POST") ? JSON.stringify(obj.data) : obj.data,
        dataType: obj.dataType,
        beforeSend: function (xhr) {
            if (obj.selector !== undefined) {
                disabledController(obj.selector, true);
            }
        }
    });
    request.done(function (result) {
        if (result.code === 200 || result.code === undefined) {
            obj.successFunction(result.data);
        } else {
            if (obj.errorFunction !== undefined) {
                obj.errorFunction(result);
            } else {
                console.log(result.errorText);
            }
        }
    });
    request.fail(function (jqXHR, textStatus) {
        console.log(jqXHR.statusText);
    });
    request.always(function () {
        if (obj.selector !== undefined) {
            disabledController(obj.selector, false);
        }
    });
}

function disabledController(selector, flag) {
    if (Array.isArray(selector)) {
        $.each(selector, function () {
            setSelectorDisabled($(this), flag);
        });
    } else setSelectorDisabled(selector, flag);
}

function setSelectorDisabled(selector, flag) {
    if (flag) {
        selector.attr('disabled', 'disabled');
        selector.addClass('disabled');
    } else {
        selector.removeAttr('disabled');
        selector.removeClass('disabled');
    }
}