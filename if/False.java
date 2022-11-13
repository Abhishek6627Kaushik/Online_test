class False
{
	public static void main(String[] args) 
	{

		int i = 0 ;
		if (false && i++ == 0) // (&&) ke saath agr phle value false hai to vo second value check nhi krega
		{
			System.out.println("from if"+ i++);
			i++;
		}
		System.out.println("main end : "+i);
	}
}
