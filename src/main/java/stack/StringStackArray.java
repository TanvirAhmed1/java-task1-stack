package stack;

public class StringStackArray {
	private String[] stack;
	private int size;
	private final int INIT_SIZE = 5;
	public StringStackArray() {
		stack = new String[INIT_SIZE];
		size = 0;
	}
	public void push(String value) {
		stack[size] = value;
		size++;
	}
	public String pop()  {
		if(size == 0) {
			return "Empty";
		}else {
		String result = stack[size-1];
		stack[size-1] = null;
		size--;
		return result;
		}
	}
	public String peek()  {
		if(size == 0) {
			//throw new ArrayIndexOutOfBoundsException();
			return "There is no space left";
		}
		else {
		String result = stack[size-1];
		size--;
		return result;
		}
	}
}
