package Assign;

abstract class Shapes{ 
  String name;
  double area;
  double perimeter;
  
  void ShapesProcess(){}
  
  abstract public void area();
  abstract public void perimeter();

public void display() {
	// TODO Auto-generated method stub
	
}}
	  
	 class Rectangle extends Shapes{
		 
		 Rectangle(){}
		 Rectangle(String name,double area,double perimeter) {
			 this.name=name;
			 this.area=area;
			 this.perimeter=perimeter;
		 }
		 public void display() {
			 System.out.println("Name of the shape is :" +name);
			
		 }
		@Override
		public void area() {
			// TODO Auto-generated method stub
			 System.out.println("area is :"+area);
		}
		@Override
		public void perimeter() {
			// TODO Auto-generated method stub
			 System.out.println("perimeter is :" +perimeter);
		}
	 }
	  
		 class Square extends Shapes{
			 
			 Square(){}
			 Square(String name,double area,double perimeter) {
				 this.name=name;
				 this.area=area;
				 this.perimeter=perimeter;
			 }
			 public void display() {
				 System.out.println("Name of the shape is :" +name);
				
			 }
			@Override
			public void area() {
				// TODO Auto-generated method stub
				 System.out.println("area is :"+area);
			}
			@Override
			public void perimeter() {
				// TODO Auto-generated method stub
				 System.out.println("perimeter is :" +perimeter);
			}
		 }
	  
			  
			 class Triangle extends Shapes{
				 
				 Triangle(){}
				Triangle(String name,double area,double perimeter) {
					 this.name=name;
					 this.area=area;
					 this.perimeter=perimeter;
				 }
				 public void display() {
					 System.out.println("Name of the shape is :" +name);
					 
				 }
				@Override
				public void area() {
					// TODO Auto-generated method stub
					System.out.println("area is :"+area);
				}
				@Override
				public void perimeter() {
					 System.out.println("perimeter is :" +perimeter);
				}
			 }
			  
			 class Circle extends Shapes{
				 
				 Circle(){}
				Circle(String name,double area,double perimeter) {
					 this.name=name;
					 this.area=area;
					 this.perimeter=perimeter;
				 }
				 public void display() {
					 System.out.println("Name of the shape is :" +name);
					
							    
				 }

					@Override
					public void area() {
						// TODO Auto-generated method stub
						 System.out.println("area is :"+area);
					}
					@Override
					public void perimeter() {
						// TODO Auto-generated method stub

						  System.out.println("perimeter is :" +perimeter);
					}
			 }

    public class ShapesProcess {
    	public static void process(Shapes s) {
    		s.display();
    		s.area();
    		s.perimeter();
    		System.out.println("*******************************");
    	}
  
	public static void main(String[] args)
	{
		process(new Rectangle("Rectangle",34.0,564.8));
		process(new Square("Square",54.0,364.8));
		process(new Triangle("Triangle",76.0,238.8));
		process(new Circle("circle",23.0,212.8));
	}
    }
		
    
