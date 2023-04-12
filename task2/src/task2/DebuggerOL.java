/**
 * 
 */
package task2;

public class DebuggerOL {

	public int add(int a, int b) {
		return a+b;
		
	}
	public float add(float a, float b,float c) {
		return a*b*c;
		
	}
	public static void main(String[] args) {
		DebuggerOL deg = new DebuggerOL();
		System.out.println(deg.add(7,7));
		System.out.println(deg.add(7, 7, 7));
	}

}
