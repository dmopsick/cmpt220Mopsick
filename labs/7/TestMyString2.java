public class TestMyString2 {

	public static void main(String[] args) {
		MyString2 string1 = new MyString2("SaMple");
		System.out.println(string1.getS());
		
		System.out.println();
		System.out.println(string1.compare("Apple"));
		System.out.println(string1.compare("SaMple"));
		System.out.println(string1.compare("Zebra"));
		
		System.out.println();
		System.out.println(string1.substring(2).getS());
		
		System.out.println();
		System.out.println(string1.toUpperCase().getS());
		
		System.out.println();
		char[] charArray = string1.toChars();
		for(int i = 0; i < string1.getS().length(); i ++){
			System.out.println(charArray[i]);
		}
		
		System.out.println();
		System.out.println(MyString2.valueOf(true).getS());;
		System.out.println(MyString2.valueOf(false).getS());
	}

}
