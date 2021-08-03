class sass
{  
      public static void main(String[] args) 
 {  
         MyFirst obj = new MyFirst(n);  
 }  
 static int a = 10;  
 static int n;  
 int b = 5;  
 int c;  
 public MyFirst(int m) {
       System.out.println("constructor called");  
       System.out.println(a + ", " + b + ", " + c + ", " + n + ", " + m);  

  {  
     b = 30;  
     n = 20;  
   System.out.println("Instance block called");
  }   
 
static   
{        System.out.println("Static block called");
          a = 60;  
}   
}  
