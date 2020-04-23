class MyException extends Exception 
{ 
	public MyException(String s) 
	{  
		super(s); 
	} 
} 
class CustomerziedException 
{ 
	public static void main(String args[]) 
	{ 
		try
		{ 
			throw new MyException("Exception Occurs"); 
		} 
		catch (MyException ex) 
		{ 
			System.out.println("Caught"); 
			System.out.println(ex.getMessage()); 
		} 
	} 
}
