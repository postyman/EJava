package chapter6;

public class Friend {
	private String name;
	private String last;
	private String first;
	private int age;

	public Friend()	{
		name = "";
		age  = 0;
	}
	
	public Friend(String n, int a)	{
		name = n;
		age  = a;
	}
	
	public String getName()	{
		return name;
	}
	
	public String getFirstName()	{
		first = name.substring(0, name.indexOf(' '));
		
		return first;
	}
	
	public String getLastName()	{
		last = name.substring((name.indexOf(' ')+1), name.length());
		
		return last;
	}
	
	public int getAge()	{
		return age;
	}
	
	public void setName(String n)	{
		name = n;
	}
	
	public void setAge(int a)	{
		age = a;
	}

}
