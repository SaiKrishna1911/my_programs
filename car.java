class car{
int modelyear;
String modelname;

car(int year ,String name){
modelyear=year;
modelname=name;
}


public static void main(String[] args)
{
 car a = new car(1969,"Swift");
 System.out.println(a.modelname+"    "+a.modelyear);
}

}
 