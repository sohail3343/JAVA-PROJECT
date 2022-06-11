package collection;

public class evenoddbysuingtwothread extends Thread {
public void run()
{
	System.out.println("even number by usimng second threadh");
	for(int i=0;i<=10;i++)
	{
		if(i%2==0)
		{
			System.out.println(i);
		}
	}

}
public static void main(String[] args) {
	System.out.println("odd number by using 1st thraed");
	for(int i=0;i<=10;i++)
	{
		if(i%2!=0)
		{
			
			System.out.println(i);
			
		}
		
	}

	evenoddbysuingtwothread t1=new evenoddbysuingtwothread();
	t1.start();
}

}
