import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter in the x coordinate of the first point");
    int x1 =input.nextInt();
    System.out.println("Please enter in the y coordinate of the first point");
    int y1 =input.nextInt();
    System.out.println("Please enter in the x coordinate of the second point");
    int x2 =input.nextInt();
    System.out.println("Please enter in the y coordinate of the second point");
    int y2 =input.nextInt();
//(y2 -y1)/(x2 - x1) 
int slope =(y2-y1)/(x2-x1);
System.out.println("Your slope is " + slope + ".");


  }
}
