public enum ThreadStates{

	START("start"),
	RUNNING("running"),
	WAITING("waiting"),
	DEAD("dead");

	String value;

	ThreadStates(String value)
	{
		this.value=value;
	}
}