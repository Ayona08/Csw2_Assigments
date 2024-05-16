
public class q8 {

	public static void main(String[] args) {
		int x=10;
		int y =0;
		try {
			System.out.println(x/y);
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException:"+e.getMessage());
		}

	}

}
