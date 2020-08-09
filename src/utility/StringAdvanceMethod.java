package utility;

// Type your code


public class StringAdvanceMethod{
	private String input1;
	private String input2;
	public String getInput1() {
		return input1;
	}
	public void setInput1(String input1) {
		this.input1 = input1;
	}
	public String getInput2() {
		return input2;
	}
	public void setInput2(String input2) {
		this.input2 = input2;
	}
	public String concat(String input12, String input22) {
		// TODO Auto-generated method stub
		
		return input12.concat(input22);
	}
	public String[] split(String input12, String input22) {
		// TODO Auto-generated method stub
		return input12.split(input22);
	}
	public String indexOf(String input12, String input22) {
		// TODO Auto-generated method stub
		int len = input12.indexOf(input22);
		String s = Integer.toString(len);
		return s;
	}

	
	
}