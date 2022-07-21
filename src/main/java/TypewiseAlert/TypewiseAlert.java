package TypewiseAlert;

public class TypewiseAlert {

	public static BreachType inferBreach(RangeInputPOJO inputPOJO) {
		return RangeValidator.checkWarnings(inputPOJO);
	}

	public static BreachType classifyTemperatureBreach(CoolingType coolingType, double temperatureInC) {
		return inferBreach(new RangeInputPOJO(temperatureInC, coolingType.getlLimit(), coolingType.getuLimit()));
	}

	public static void checkAndAlert(AlertTarget alertTarget, CoolingType coolingType, double temperatureInC) {
		BreachType breachType = classifyTemperatureBreach(coolingType, temperatureInC);
		alertTarget.triggerAlert(breachType);
	}

}
