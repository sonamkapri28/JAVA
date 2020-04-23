
class Demo
{
	void conc()
	{
		StringBuffer str1=new StringBuffer("Hello");
		StringBuffer str2=new StringBuffer("Students");
		str1.append(str2);
		System.out.println("1. String after Concatenation = "+str1);
	}
	void insrtatpos()
	{
		StringBuffer str=new StringBuffer("BCIIT Students");
		str.insert(6,"Java ");
		System.out.println("2. String after Insertion = "+str);
	}
	void rplce()
	{
		StringBuffer str=new StringBuffer("BCIIT Students");
		str.replace(6,9,"apj");
		System.out.println("3. String after Replacement = "+str);
	}
	void del()
	{
		StringBuffer str=new StringBuffer("BCIIT Java Students");
		str.delete(6,10);
		System.out.println("4. String after deletion = "+str);
	}
	void rev()
	{
		StringBuffer str1=new StringBuffer("Hello");
		str1.reverse();
		System.out.println("5. String after Reverse = "+str1);
	}
	void capac()
	{
		StringBuffer str1=new StringBuffer("Hello");
		int i=str1.capacity();
		System.out.println("6. Capacity of string = "+i);
	}
}
class StringBufferClass
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
