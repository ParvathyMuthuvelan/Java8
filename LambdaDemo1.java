package com.training.java8;
@FunctionalInterface
interface FuncInter1 {
	int operation(int a, int b);
	
}
@FunctionalInterface
interface FuncInter2 {
	void sayMessage(String message);
}
@FunctionalInterface
interface FuncInter3
{
	void show();
}
class Sample implements FuncInter1
{

	@Override
	public int operation(int a, int b) {
		return a+b;
		//System.out.println(a+","+b);
	}
	}
public class LambdaDemo1 {
	public static void main(String args[])
	{
//		FuncInter1 f=new Sample();
//		System.out.println(f.operation(3,4));
		
		FuncInter1 ref1=(a,b)->  a*b;
		System.out.println(ref1.operation(3, 2));
		
		FuncInter2 ref2=(str)->System.out.println(str);
		ref2.sayMessage("hello");
		
		FuncInter3 ref3=()->System.out.println("hai");
		ref3.show();
	}

}
