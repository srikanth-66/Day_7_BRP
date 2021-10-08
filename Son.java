package com.home;

class  GrandFather
{
	int age=65;
	public void ageGrandFather()
	{
		System.out.println("GrandFather age is"+age);
	}
}
class Father extends GrandFather
{
	int age=45;
	public void ageFather()
	{
		System.out.println("Father age is"+age);
	}
}
public class Son extends Father
{
	int age=25;
	public void ageSon()
	{
		System.out.println("Son age is"+age);
	}
	
	public static void main(String[] args)
	{
		Son son=new Son();
		son.ageSon();
		son.ageFather();
		son.ageGrandFather();
		
	}
}