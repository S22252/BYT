public class Request {

	private int number1;
	private int number2;
	private String operation;

	public Request(int number1, int number2, String operation) {
		super();
		this.number1 = number1;
		this.number2 = number2;
		this.operation = operation;
	}

	public String getOperation() {
		return operation;
	}

	public int getNumber2() {
		return number1;
	}

	public int getNumber1() {
		return number2;
	}

}