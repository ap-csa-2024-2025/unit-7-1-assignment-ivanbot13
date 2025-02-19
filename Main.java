import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String input = "";

    ArrayList<String> list = new ArrayList<String>();
    System.out.println("Enter words, enter STOP to stop: ");  
    
    while (!input.equals("STOP"))
    {
      input = sc.nextLine();
      list.add(input);
    }

    list.remove(list.size()-1);
    System.out.println(list.size());
    System.out.println(list);

    if (list.size() > 2){
      String first = list.get(0);
      list.remove(0);
      list.remove(list.size()-1);
      list.add(first);
      System.out.println(list);
    }
  }
}
