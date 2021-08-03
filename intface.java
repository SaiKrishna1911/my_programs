class A
{
    void show()
    {
        System.out.println("This is class A");
    }
}
interface B
{
    final int a=12;
    public void view();
}

class C extends A implements B
{
    public void view() {
        System.out.println("Value of a in Interface B = "+a);
    }
    void disp() {
        System.out.println("This is class C");
    }
}
class intface
{
    public static void main(String args[])
    {
        C c1 = new C();
        c1.show();
        c1.view();
        c1.disp();
        System.out.println("---------------------------------------------------");
    }
    
}
