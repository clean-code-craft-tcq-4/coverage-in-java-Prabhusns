package TypewiseAlert;

public enum CoolingType {
	PASSIVE_COOLING(0, 35), HI_ACTIVE_COOLING(0, 45), MED_ACTIVE_COOLING(0, 40);

	private final int lLimit;
	private final int uLimit;

	private CoolingType(final int lLimit, final int uLimit) {
		this.uLimit = uLimit;
		this.lLimit = lLimit;
	}

	public int getlLimit() {
		return lLimit;
	}

	public int getuLimit() {
		return uLimit;
	}

}
