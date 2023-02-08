import java.util.ArrayList;
public class CafeUtil {
  public int getStreakGoal() {
    int sum = 0;
    for (int i = 1; i <= 10;i++) {
      
      sum += i;
      
    }
    return sum;
  }

  public double getOrderTotal(double[]prices) {
    double sum =0;
    for (double price:prices) { // enhanced for loop // creating var then accessing arrays
      sum += price;
    }
    return sum;
      
  }

  public void displayMenu(ArrayList<String>menuItems) {
    for (int i = 0; i < menuItems.size();i++) {
      
        String name = menuItems.get(i);
        System.out.println(name);
      // for arrayslist it is not length it is size 
      // ArrayList needs to be imported
    
  }
  }

  public void addCustomer(ArrayList<String>constumers) {
    System.out.println("please enter your name :");
    String userName = System.console().readLine();
    constumers.add(userName);
    System.out.println("hello" + " " + userName);
    System.out.println("There are " + constumers.size() + " people infront of you.");
    System.out.println(constumers);
  }
  

  }