package TypewiseAlert;

public class BreachLimit {

	int lowerLimit = 0;
	int upperLimit = 0;

	public int getLowerLimit() {
		return lowerLimit;
	}

	public void setLowerLimit(int lowerLimit) {
		this.lowerLimit = lowerLimit;
	}

	public int getUpperLimit() {
		return upperLimit;
	}

	public void setUpperLimit(int upperLimit) {
		this.upperLimit = upperLimit;
	}

	public BreachLimit(int lowerLimit, int upperLimit) {
		super();
		this.lowerLimit = lowerLimit;
		this.upperLimit = upperLimit;
	}

}
