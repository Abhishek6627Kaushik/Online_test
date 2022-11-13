class True
{
	public static void main(String[] args) 
	{

		int i = 0 ;
		if (true || i++ == 0) // (||) OR ke saath agr phle value true hai to vo second value check nhi krega
		{
			System.out.println("from if : "+ i++);
			i++;
		}
		System.out.println("main end : "+i);
	}
}
