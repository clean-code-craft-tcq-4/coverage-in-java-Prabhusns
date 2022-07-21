package TypewiseAlert;

public class RangeValidator {

	public static boolean lowRangeCheck(RangeInputPOJO inputPOJO) {
		if (inputPOJO.getInputValue() < inputPOJO.getlLimit()) {
			return true;
		}
		return false;
	}

	public static boolean highRangeCheck(RangeInputPOJO inputPOJO) {
		if (inputPOJO.getInputValue() > inputPOJO.getuLimit()) {
			return true;
		}
		return false;
	}

	public static BreachType checkWarnings(RangeInputPOJO inputPOJO) {
		if (lowRangeCheck(inputPOJO)) {
			return BreachType.TOO_LOW;
		} else if (highRangeCheck(inputPOJO)) {
			return BreachType.TOO_HIGH;
		}
		return BreachType.NORMAL;
	}

}
