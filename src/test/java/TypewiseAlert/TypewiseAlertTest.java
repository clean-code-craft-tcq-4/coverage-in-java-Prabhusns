package TypewiseAlert;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TypewiseAlertTest {

	@Test
	public void infersBreachAsPerLimits() {
		assertTrue(TypewiseAlert.inferBreach(new RangeInputPOJO(12, 20, 30)) == BreachType.TOO_LOW);
		assertTrue(TypewiseAlert.inferBreach(new RangeInputPOJO(22, 20, 30)) == BreachType.NORMAL);
		assertTrue(TypewiseAlert.inferBreach(new RangeInputPOJO(32, 23, 30)) == BreachType.TOO_HIGH);
	}

	@Test
	public void testCheckAndAlert() {
		TypewiseAlert.checkAndAlert(AlertTarget.TO_EMAIL, CoolingType.PASSIVE_COOLING, 36.0);
		TypewiseAlert.checkAndAlert(AlertTarget.TO_EMAIL, CoolingType.HI_ACTIVE_COOLING, 36.0);
		TypewiseAlert.checkAndAlert(AlertTarget.TO_CONTROLLER, CoolingType.MED_ACTIVE_COOLING, -1.0);
		TypewiseAlert.checkAndAlert(AlertTarget.TO_CONTROLLER, CoolingType.PASSIVE_COOLING, 36.0);
	}

	@Test
	public void testClassifyTemperatureBreach() {

		assertTrue(TypewiseAlert.classifyTemperatureBreach(CoolingType.PASSIVE_COOLING, 36.0) == BreachType.TOO_HIGH);
		assertTrue(TypewiseAlert.classifyTemperatureBreach(CoolingType.PASSIVE_COOLING, 0.0) == BreachType.NORMAL);
		assertTrue(TypewiseAlert.classifyTemperatureBreach(CoolingType.PASSIVE_COOLING, -2.0) == BreachType.TOO_LOW);

		assertTrue(TypewiseAlert.classifyTemperatureBreach(CoolingType.HI_ACTIVE_COOLING, 46.0) == BreachType.TOO_HIGH);
		assertTrue(TypewiseAlert.classifyTemperatureBreach(CoolingType.HI_ACTIVE_COOLING, 36.0) == BreachType.NORMAL);
		assertTrue(TypewiseAlert.classifyTemperatureBreach(CoolingType.HI_ACTIVE_COOLING, -1.0) == BreachType.TOO_LOW);

		assertTrue(
				TypewiseAlert.classifyTemperatureBreach(CoolingType.MED_ACTIVE_COOLING, 41.0) == BreachType.TOO_HIGH);
		assertTrue(TypewiseAlert.classifyTemperatureBreach(CoolingType.MED_ACTIVE_COOLING, 36.0) == BreachType.NORMAL);
		assertTrue(TypewiseAlert.classifyTemperatureBreach(CoolingType.MED_ACTIVE_COOLING, -1.0) == BreachType.TOO_LOW);
	}

}
