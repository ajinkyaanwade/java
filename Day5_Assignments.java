/*1) Create a multi-level inheritance , instantiate the child class and observe constructor invocation.Also show, if needed how will u invoke parent class constructor from child class ?*/

package pack_4;
class Base
{
	Base()
	{
		System.out.println("inside base default const");
	}
	Base(int a)
	{
		System.out.println("inside base para const");
	}
}
class Sub1 extends Base
{
	Sub1()
	{
		super();
		System.out.println("inside sub1 default");
	}
	Sub1(int k)
	{
		super(20);
		System.out.println("inside sub1 para const");
	}
}
class Sub2 extends Sub1
{
	Sub2()
	{
		super(10);
		System.out.println("inside sub2 defult");
	}
	Sub2(int k)
	{
		super(10);
		System.out.println("inside sub2 para const");
	}
}
public class Demo 
{
	public static void main(String [] args)
	{
		Sub1 s1=new Sub1();
		Sub2 s2=new Sub2();
		Sub1 s3=new Sub1(10);
		Sub2 s4=new Sub2(20);
	}
}


/* 2)create a class "Vehicle", define a method "public void start()" in it. From this class derive a class FourWheeler. How will u override "start()" method of parent class ?*/

package pack_4;
class Vehicle
{
	public void start()
	{
		System.out.println("inside vehicle start");
	}
}
class FourWheeler extends Vehicle
{
	public void start()
	{
		System.out.println("inside fourwheeler start");
	}
}
public class Demo 
{
	public static void main(String [] args)
	{
		FourWheeler f1=new FourWheeler();
		f1.start();
		Vehicle v1=new FourWheeler();
		v1.start();
		Vehicle v2=new Vehicle();
		v2.start();
	}
}


//3)Go for Hierarchical inheritance, create instances of child class and observe constructor invocation.


package pack_4;
class Parent
{
	Parent()
	{
		System.out.println("inside default Parent const");
	}
	Parent(int k)
	{
		System.out.println("inside para Parent const");
	}
}
class Child1 extends Parent
{
	Child1()
	{
		System.out.println("inside default child1 const");
	}
	Child1(int k)
	{
		super(40);
		System.out.println("inside para child1 const");
	}
}
class Child2 extends Parent
{
	Child2()
	{
		System.out.println("inside default child2 const");
	}
	Child2(int k)
	{
		super(30);
		System.out.println("inside para child2 const");
	}
}
class Child3 extends Parent
{
	Child3()
	{
		System.out.println("inside default child3 const");
	}
	Child3(int k)
	{
		super(20);
		System.out.println("inside para child3 const");
	}
}
class Child4 extends Parent
{
	Child4()
	{
		System.out.println("inside default child4 const");
	}
	Child4(int k)
	{
		super(10);
		System.out.println("inside para child4 const");
	}
}
public class Demo 
{
	public static void main(String [] args)
	{
		Child1 c1=new Child1();
		Child2 c2=new Child2();
		Child3 c3=new Child3();
		Child4 c4=new Child4();
	}
}




/* 4)Create a class "Top1" with "disp1()" method.
From this class Derive "Bottom1", "Bottom2" and "Bottom3" classes ,override the "disp1()".
Now show how will u achieve dynamic polymorphism.*/

package pack_4;
class Top1
{
	public void disp1()
	{
		System.out.println("inside disp1 of top1");
	}
}
class Bottom1 extends Top1
{
	public void disp1()
	{
		System.out.println("inside disp1 of bottom1");
	}
}
class Bottom2 extends Top1
{
	public void disp1()
	{
		System.out.println("inside disp1 of bottom2");
	}
}
class Bottom3 extends Top1
{
	public void disp1()
	{
		System.out.println("inside disp1 of bottom3");
	}
}
public class Demo 
{
	public static void main(String [] args)
	{
		Top1 b1=new Bottom1();
		b1.disp1();
		Top1 b2=new Bottom2();
		b2.disp1();
		Top1 b3=new Bottom3();
		b3.disp1();
		Top1 t1=new Top1();
		t1.disp1();
	}
}



/*5) create abstract class Shape. declare "draw()" function as abstract. From this class define "Triangle","Polygon" and "Circle" .
create an array of Shape having 3 elements.
store child objects into this array . and call
their draw function.*/


package pack_4;
abstract class Shape
{
	abstract void draw();
}
class Triangle extends Shape
{
	public void draw() 
	{
		System.out.println("draw Tringle");
	}
}
class Polygon extends Shape
{
	public void draw()
	{
		System.out.println("draw Polygon");
	}
}
class Circle extends Shape
{
	public void draw()
	{
		System.out.println("draw Circle");
	}
}
public class Demo 
{
//	static void perform(Shape ref)
//	{
//		ref.draw();
//	}
//	public static void main(String [] args)
//	{
//		perform(new Triangle());
//		perform(new Polygon());
//		perform(new Circle());
//	}
	public static void main(String[] args)
	{
		Shape arr[]=new Shape[3];
		arr[0]=new Triangle();
		arr[1]=new Polygon();
		arr[2]=new Circle();
		for(int i=0;i<arr.length;i++)
		{
			arr[i].draw();
		}
	}
}



/*6) Define interface "A" with "disp1()" method.
Derive from "A", interface "B" with "disp2" method.
Derive class "C" , from "B".
Instantiate class "C" and call its members as well as derived from parent interfaces.*/

package pack_4;
interface A
{
	int b=10;
	public void disp1();
}
interface B extends A
{
	int a=20;
	public void disp2();
}
class C implements B
{
	public void disp1()
	{
		System.out.println("inside disp1 of class c");
	}
	public void disp2()
	{
		System.out.println("inside disp2 of class c");
	}
}



/*7) Define class "Parent1" with some data.
Define interface "Parent2" with some methods.
Derive a class "Child" from "Parent1" and "Parent2", instantiate it and call the members.*/


package pack_4;
class Parent1
{
	int num1;
	Parent1()
	{
		num1=10;
		System.out.println("inside default const of parent1 num1="+num1);
	}
}
interface Parent2
{
	public void disp1();
	public void disp2();
}
class Child extends Parent1 implements Parent2
{
	Child()
	{
		System.out.println("inside default const child");
	}
	public void disp1()
	{
		System.out.println("inside disp1 child");
	}
	public void disp2()
	{
		System.out.println("inside disp2 child");
	}
}
 public class Demo
 {
	public static void main(String[] args)
	{
		Child c1=new Child();
		c1.disp1();
		c1.disp2();
	}

}
 public class Demo
 {
	public static void main(String[] args)
	{
		C c1=new C();
		c1.disp1();
		c1.disp2();
		System.out.println(c1.a);
		System.out.println(c1.b);
	}

}



/*8) Define a class "base1" with only parameterized constructor.
Derive a class "sub1" from "base1". This class should have following constructors
	a) Default
	b) one parameter
	c) two parameter
Now try to instantiate "sub1" , using any of the above mentioned constructors.*/


package pack_4;
class Base1
{
	Base1(int k)
	{
		System.out.println("inside para const of base1");
	}
}
class Sub1 extends Base1
{
	Sub1()
	{
		super(10);
		System.out.println("inside default const of sub1");
	}
	Sub1(int k)
	{
		super(20);
		System.out.println("inside one para const of sub1");
	}
	Sub1(int k,int b)
	{
		super(30);
		System.out.println("inside two para const of sub1");
	}
}
 public class Demo
 {
	public static void main(String[] args)
	{
		Sub1 s1=new Sub1();
		Sub1 s2=new Sub1(20);
		Sub1 s3=new Sub1(20,30);
	}

}



/*9) create interface "Game" , have an abstract method "play()". from this interface implements classes like "Cricket" , "FootBall" and "Tennis".
Now Define one more class 
public class Demo with main function.
In this class have a static method "perform" which will take interface reference as parameter.inside "perform()" see to it that any child object passed ,its "play()" method should be invoked. Call "perform()" method from main function.
*/


package pack_4;
interface Game
{
	void play();
}
class Cricket implements Game
{
	public void play()
	{
		System.out.println("play cricket");
	}
}
class Football implements Game
{
	public void play()
	{
		System.out.println("play football");
	}
}
class Tennis implements Game
{
	public void play()
	{
		System.out.println("play tennis");
	}
}
 public class Demo
 {
	 static void perform(Game ref)
	 {
		 ref.play();
	 }
	public static void main(String[] args)
	{
		perform(new Cricket());
		perform(new Football());
		perform(new Tennis());
	}

}