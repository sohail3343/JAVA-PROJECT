                                                                                                                                              package collection;

import java.util.TreeSet;

public class Employee implements Comparable {
	String name;
	int eid;
	 Employee(String name,int eid)
	 {
		 this.name=name;
		 this.eid=eid;
	 }
	 public String toString()
	 {
		 return name+" "+eid;
	 }
	 public int compareTo(Object obj)
	 {
		 int eid1=this.eid;
		 Employee e=(Employee)obj;
		 int eid2=e.eid;
		 if(eid1>eid2)
		 {
			 return +1;
		 }
		 else if(eid1<eid2)
		 {
			 return -1;
		 }
		 else
		 {
			 return 0;
		 }
	 }

}
class sameer
{
 public static void main(String[] args) {
	Employee e1=new Employee("sam",100);
	Employee e2=new Employee("mudaa",200);
	Employee e3=new Employee("sohail",50);
	Employee e4=new Employee("zendy",150);
	Employee e5=new Employee("nag",100);
	TreeSet t= new TreeSet();
	t.add(e1);
	t.add(e2);
	t.add(e3);
	t.add(e4);
	t.add(e5);
	System.out.println(t);
}	

}