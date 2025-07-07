package strings;

public class StringExample {

	public static void main(String[] args) {
		String name = "Dibbu";
		String reverse = "";
		/*----------------------------------------------------*/
		System.out.println("The String is: "+name);
		System.out.println("-------------------------");
		System.out.println("Accessing String using it's index: ");
		System.out.println("At first index : "+name.charAt(0));
		System.out.println("-------------------------");
		/*----------------------------------------------------*/
		for(int i=0; i<name.length();i++) {
			System.out.println("The element at "+i+" index is : " +name.charAt(i));
		}
		/*----------------------------------------------------*/
		for(int i=name.length()-1; i>=0;i--) {
			reverse += name.charAt(i);  //reverse = reverse + name.charAt(i);
		}
		System.out.println("-------------------------");
		System.out.println("Reversed String is: "+reverse);
	}

}
