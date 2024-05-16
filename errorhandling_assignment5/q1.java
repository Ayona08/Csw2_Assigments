public class q1 {
    public static void main(String[] args) {
		try {
			String s=null;
			System.out.println("The Length of the String is:"+s.length());
		}
catch(NullPointerException e) {
	System.out.println("The String as no Value...");
	e.printStackTrace();
}
	}

}
