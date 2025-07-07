package strings;

public class StringReverse {

	public static void main(String[] args) {
		String name = "Dibbu";
		String rev="";
		for(int i=name.length()-1; i>=0; i--) {
			rev += name.charAt(i);
		}
		System.out.println("Name : "+name);
		System.out.println("Reversed Name : "+rev);
	}

}
