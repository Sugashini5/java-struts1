
public class Wrapper{   

public static void main(String args[]){   

int i=30;   

long l=40;   

  //Autoboxing: Converting primitives into objects   

 	Integer intobj=i;   

Long longobj=l;     

System.out.println("Integer object: "+intobj);   

System.out.println("Long object: "+longobj);   

   

//Unboxing: Converting Objects to Primitives   

int intvalue=intobj;   

long longvalue=longobj;   

   

System.out.println("int value: "+intvalue);   

System.out.println("long value: "+longvalue);   

  } 

} 