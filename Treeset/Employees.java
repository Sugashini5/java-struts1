package Assignment;



	import java.util.Comparator;
	import java.util.Set;
	import java.util.TreeSet;
	public class Employees {
	
	    String name;
	  
	    public Employees(String name) {
	        this.name = name;
	     
	    }
	
	public class SortSetExample {
	 
	    public void main(String...a){
	 
	        Employees emp1=new Employees("sam");
	        Employees emp2=new Employees("amy");
	        Employees emp3=new Employees("brad");
	 
	       Set<Employees> treeSet = new TreeSet<Employees>(new Comparator<Employees>() {
	                  @Override
	                  public int compare(Employees o1, Employees o2) {
	                        return o1.name.compareTo(o2.name);
	                  }
	           });
	        treeSet.add(emp1);
	        treeSet.add(emp2);
	        treeSet.add(emp3);
	 
	        System.out.println("treeSet : "+treeSet);
	 
	       
	    }
	}

}
