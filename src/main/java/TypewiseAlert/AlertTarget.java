package TypewiseAlert;

public enum AlertTarget implements AlertInterface {

	TO_CONTROLLER {
		@Override
		public void triggerAlert(BreachType breachType) {
			int header = 0xfeed;
			System.out.printf("%d : %s\n", header, breachType.getType());
		}
	},
	TO_EMAIL {
		@Override
		public void triggerAlert(BreachType breachType) {
			String recepient = "a.b@c.com";
			System.out.printf("To: %s\n", recepient);
			System.out.println("Hi, the temperature is " + breachType.getType());
		}
	}
}
