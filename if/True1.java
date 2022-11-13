class True1
{
	public static void main(String[] args) 
	{

		int i = 0 ;
		if (true && i++ == 0) // (&&) AUR ke saath agr phle value true hai to vo second value check  krega
		{
			System.out.println("from if : "+ i++);
			i++;
		}
		System.out.println("main end : "+i);
	}
}
