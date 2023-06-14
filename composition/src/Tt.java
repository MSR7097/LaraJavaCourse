class Tt 
{
	public static void main(String[] args) 
	{
		int i;
		for(i = 1, System.out.print(i); test(i = i + 1);) {
			System.out.print(i);
		}
	}
	static boolean test(int m) {
		System.out.print(m);
		return m <= 5;
	}
}
