package task2;

public class Parcons {
	 String name;
	    int id;
	public Parcons(String name, int id) {
		 this.name = name;
	        this.id = id;
	    }

    public static void main(String[] args)
    {
        // This would invoke the parameterized constructor.
        Parcons cons= new Parcons("Sofiya", 77);
        System.out.println("Name :" + cons.name );
        System.out.println("Id :" + cons.id);
    }
}