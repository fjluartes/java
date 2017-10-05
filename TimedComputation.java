//11/7/2016
// This program performs some mathematical computations and display the results. It then reports the number of seconds the computer spent on the task.
public class TimedComputation {
    public static void main(String[] args) {
	long startTime;
	long endTime;
	double time;
	startTime = System.currentTimeMillis();
	double width, height, hypotenuse;
	width = 42.0;
	height = 17.0;
	hypotenuse = Math.sqrt(width*width + height*height);
	System.out.println("A triangle with two sides 42 and 17 has hypotenuse " + hypotenuse);
	System.out.println("\nMathematically, sin(x)*sin(x) + " + "cos(x)*cos(x) - 1 should be 0.");
	System.out.println("Let's check this for x = 1: ");
	System.out.print("     sin(1)*sin(1) + cos(1)*cos(1) - 1 is ");
	System.out.println(Math.sin(1)*Math.sin(1) + Math.cos(1)*Math.cos(1) - 1);
	System.out.println("(There can be round-off errors when " + "computing with real numbers!)");
	System.out.print("\nHere is a random number: ");
	System.out.println(Math.random());
	System.out.print("The value of Math.PI is ");
	System.out.println(Math.PI);
	endTime = System.currentTimeMillis();
	time = (endTime - startTime) / 1000.0;
	System.out.println("Run time in seconds was: " + time);
    }
}
