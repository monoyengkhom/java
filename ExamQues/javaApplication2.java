public class javaApplication2{
	public static void main(String[] args)
	{
		int a=0, b=1, c=1;
		while(c<50){
			System.out.println(c);
			a = b;
			b = c;
			a = a + b;
		}
	}
}
