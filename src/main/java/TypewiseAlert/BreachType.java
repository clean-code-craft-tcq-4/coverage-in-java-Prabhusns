package TypewiseAlert;

public enum BreachType {

	NORMAL("normal"), TOO_LOW("too low"), TOO_HIGH("too high");

	private final String type;

	private BreachType(final String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}
}
