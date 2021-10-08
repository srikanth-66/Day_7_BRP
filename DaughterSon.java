package com.home;

class FamilyFather
{
	public  FamilyFather ()
	{
		System.out.print("My family name is Programmer and I am from Delhi\r\n");

	}
}
class SonDaughter extends FamilyFather
{
	public SonDaughter(String name)
	{
		super();
		System.out.println("iam the son"+"\t"+name);
	}
}
public class DaughterSon extends FamilyFather
{
	public DaughterSon( String name)
	{
		super();
		System.out.println("iam the daughter"+"\t"+name);
	}
	public static void main(String[] args) 
	{
		DaughterSon ds=new DaughterSon("Jos");
		System.out.println("_____________________________________________________________");
		SonDaughter sd=new SonDaughter("Sri");
	}
}
