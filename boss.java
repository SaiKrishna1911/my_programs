class apple
{
int a=10;
    void display()
    {
        System.out.println("parent Class--Apple");
    }
}
class boss extends apple
{
int a=100;
    void display()
    {
        System.out.println("Child Class--Boss");
    }
    void printing()
    {
        display();
        super.display();
    }
void function()
{
 boss obj=new boss();
 System.out.println("This will print value a in boss class - "+obj.a);
 System.out.println("This will print value a in apple class - "+super.a);
}
public static void main(String[] args)
{
 boss obj=new boss();
 obj.function();
 obj.printing();
}
}
