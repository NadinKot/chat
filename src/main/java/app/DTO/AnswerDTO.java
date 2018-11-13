package app.DTO;

public class AnswerDTO {
	private Short code = (short) 200;
	private Object data;
	private String errorText;

	public AnswerDTO(Object data) {
		this.data = data;
	}

	public AnswerDTO() {
	}

	public Short getCode() {
		return code;
	}

	public void setCode(Short code) {
		this.code = code;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getErrorText() {
		return errorText;
	}

	public void setErrorText(String errorText) {
		this.errorText = errorText;
	}
}
