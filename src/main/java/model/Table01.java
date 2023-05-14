package model;

public class Table01 {

	private int campo01;
	private String campo02;
	private String campo03;
	private String radioButton;
	private String comboBox;
	private String checkBox;
	private String textArea;
	
	public Table01() {
		super();

	}

	public Table01(int campo01, String campo02, String campo03, String radioButton, String comboBox, String checkBox,
			String textArea) {
		super();
		this.campo01 = campo01;
		this.campo02 = campo02;
		this.campo03 = campo03;
		this.radioButton = radioButton;
		this.comboBox = comboBox;
		this.checkBox = checkBox;
		this.textArea = textArea;
	}

	public int getCampo01() {
		return campo01;
	}
	
	public void setCampo01(int campo01) {
		this.campo01 = campo01;
	}

	public String getCampo02() {
		return campo02;
	}

	public void setCampo02(String campo02) {
		this.campo02 = campo02;
	}

	public String getCampo03() {
		return campo03;
	}

	public void setCampo03(String campo03) {
		this.campo03 = campo03;
	}

	public String getRadioButton() {
		return radioButton;
	}

	public void setRadioButton(String radioButton) {
		this.radioButton = radioButton;
	}

	public String getComboBox() {
		return comboBox;
	}

	public void setComboBox(String comboBox) {
		this.comboBox = comboBox;
	}

	public String getCheckBox() {
		return checkBox;
	}

	public void setCheckBox(String checkBox) {
		this.checkBox = checkBox;
	}

	public String getTextArea() {
		return textArea;
	}

	public void setTextArea(String textArea) {
		this.textArea = textArea;
	}
	
	
	
}
