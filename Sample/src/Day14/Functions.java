package Day14;

public class Functions {
	static String res;
	public static void main(String[] args)
	{
		
		Start();
		
		res=f1();
		System.out.println(res);
		
		Functions fn=new Functions();
		
		fn.f2();
		
		res=fn.f3();
		System.out.println(res);

	}
	//static functions without returning anyvalue
	
	public static void Start()
	{
		res="";
		System.out.println("This is start function");
	}
	//static functions with returning value
	
	public static String f1()
	{
		res="";
		System.out.println("This is function1");
		return "pass";
	}
	//non static function without returning any value
	
	public void f2()
	{
		res="";
		System.out.println("This is Funcion2");
	}
	//non static function with return value
	
	public String f3()
	{
		res="";
		System.out.println("This is function3");
		return "Fail";
	}

}
