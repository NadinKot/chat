function filter(selector, filter) {
    var ajax = {};
    ajax.data = {filter: filter};
    ajax.type = "GET";
    ajax.url = "/chat/user/findUsers";
    ajax.dataType = 'JSON';
    ajax.successFunction = displayList;
    ajax.errorFunction = functionOnError;
    sendAjax(ajax);
}

function displayList(result) {
    var table = $('#userTable tbody');
    table.empty();
    result.forEach(function (user) {
        var row = ['<tr>',
            '<td>', user.firstName, '</td>' +
            '<td>', user.lastName, '</td>' +
            '<td>', user.email, '</td>' +
            '<td>', user.telNumber, '</td>' +
            '</tr>'];
        table.append(row.join(""));
    });
}

function functionOnError(data) {
    console.log(data);
}

$(document).ready(function () {
    /*$.ajax({
        type : "GET",
        url: "user/list-users",
        success: function(result){
            $.each(result, function(i, user){  //<c:forEach var="tempUser" items="${users}">

                var userRow = '<tr>' +
                    '<td>' + user.firstName + '</td>' +
                    '<td>' + user.lastname + '</td>' +
                    '<td>' + user.email + '</td>' +
                    '<td>' + user.telNumber + '</td>' +
                    '</tr>';

                $('#userTable tbody').append(userRow);

            });
            $( "#userTable tbody tr" ).addClass("loaded");
        },
        error : function(e) {
            alert("ERROR: " + e.status + " " +e.statusText);
            console.log("ERROR: ", e);
        }
    });


//filter
    $("#dynamicFilter").on("keyup", function() {
        var inputValue = $(this).val().toLowerCase();
        $("#userTable tr").filter(function() {
            $(this).toggle($(this).text().toLowerCase().indexOf(inputValue) > -1)
        });
    });*/
    $(document).on('keyup', '#dynamicFilter', function () {
        filter($(this), $(this).val().trim());
    });
});