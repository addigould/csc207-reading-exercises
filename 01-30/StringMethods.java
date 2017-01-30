public class StringMethods {
	
	public static boolean endsWithRep(String s1, String s2, int n) {
		
		String suffix = s2;
		int s2len = s2.length();
		int s1len = s1.length();
		
		for (int i = 0; i < n - 1; i++) {
			suffix = suffix + s2;
		}
		
		
		return s1.endsWith(suffix);
	}
	

	public static void main(String[] args) {
		System.out.println(endsWithRep("foobarbar", "bar", 2));

	}

}
