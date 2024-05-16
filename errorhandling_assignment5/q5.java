public class q5 {
	public static void main(String[] args) {
		try {
		 int result = performComplexMathematicalComputation();
		  System.out.println("Result of complex mathematical computation: " + result);
		    } 
		catch (NullPointerException e) {
			e.printStackTrace();
		        }
		    }
 public static int performComplexMathematicalComputation() {
 int num = (Integer) null; 
 return (int) Math.log(num);
	}
}
