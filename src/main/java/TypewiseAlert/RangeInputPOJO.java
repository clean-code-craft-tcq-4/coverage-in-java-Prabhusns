package TypewiseAlert;

public class RangeInputPOJO {
	double inputValue;
	int lLimit = 0;
	int uLimit;

	public RangeInputPOJO(double inputValue, int lLimit, int uLimit) {
		super();
		this.inputValue = inputValue;
		this.lLimit = lLimit;
		this.uLimit = uLimit;
	}

	public double getInputValue() {
		return this.inputValue;
	}

	public void setInputValue(double inputValue) {
		this.inputValue = inputValue;
	}

	public int getlLimit() {
		return lLimit;
	}

	public void setlLimit(int lLimit) {
		this.lLimit = lLimit;
	}

	public int getuLimit() {
		return uLimit;
	}

	public void setuLimit(int uLimit) {
		this.uLimit = uLimit;
	}

}
