
public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String text="changeme";
		char[] ch=text.toCharArray();
		int length=ch.length;
	for(int i=0;i<length;i=i+2)
		{
			ch[i]=Character.toUpperCase(ch[i]);		}

	}

}
