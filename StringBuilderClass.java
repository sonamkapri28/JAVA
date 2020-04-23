
class Demo
{
	void conc()
	{
		StringBuilder str1=new StringBuilder("Hello");
		StringBuilder str2=new StringBuilder("Students");
		str1.append(str2);
		System.out.println("1. String after Concatenation = "+str1);
	}
	void insrtatpos()
	{
		StringBuilder str=new StringBuilder("BCIIT Students");
		str.insert(6,"Java ");
		System.out.println("2. String after Insertion = "+str);
	}
	void rplce()
	{
		StringBuilder str=new StringBuilder("BCIIT Students");
		str.replace(6,9,"apj");
		System.out.println("3. String after Replacement = "+str);
	}
	void del()
	{
		StringBuilder str=new StringBuilder("BCIIT Java Students");
		str.delete(6,10);
		System.out.println("4. String after deletion = "+str);
	}
	void rev()
	{
		StringBuilder str1=new StringBuilder("Hello");
		str1.reverse();
		System.out.println("5. String after Reverse = "+str1);
	}
	void capac()
	{
		StringBuilder str1=new StringBuilder("Hello");
		int i=str1.capacity();
		System.out.println("6. Capacity of string = "+i);
	}
}
class StringBuilderClass
{
	public static void main(String args[])
	{
		Demo ob=new Demo();
		ob.conc();
		ob.insrtatpos();
		ob.rplce();
		ob.del();
		ob.rev();
		ob.capac();
	}
}
