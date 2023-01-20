
public class PalindromeString {

	public static void main(String[] args) {
		String str="madam";
		String revStr="";
		System.out.println("the given string is "+str);
		char[] ch=str.toCharArray();
		int length=ch.length;
		for(int i=length-1;i>=0;i--)
		{
			revStr=revStr+str.charAt(i);
		}
		if(str.equals(revStr))
		{
			System.out.println("the String is palindrome String");
		}
	}
	

}
