package logical;

public class Singleton {
	private static Singleton s1;
	
	
private Singleton() {
		
	}



public static Singleton  mudassir()
{
   
	if(s1==null)
	{
		s1=new Singleton();
	}
	
	return s1;
	
}



public static void main(String[] args) {
	Singleton s2=Singleton.mudassir();
	Singleton s3=Singleton.mudassir();
	Singleton s4=Singleton.mudassir();
	System.out.println(s1.hashCode());
	System.out.println(s3.hashCode());
	System.out.println(s2.hashCode());
}	
}
