class Ap
{
Ap()
{
System.out.println("Parent Class");
}
}
class B extends Ap
{
B()
{
System.out.println("Child Class");
}
public static void main(String[] args)
{
B ob=new B();
}
}