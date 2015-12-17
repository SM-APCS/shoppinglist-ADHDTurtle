package shoppinglist;


import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author change to your name or loose 5 points
 */
public class ShoppingList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList shoppingList = new ArrayList();
        boolean shop = true;
        Scanner scan = new Scanner(System.in);
        
        while (shop == true){
            System.out.println("Add an item to the list or type quit to quit");
            String item = scan.nextLine();
            if (item == "quit"){
                shop = false;
            } else shoppingList.add(item);
            shoppingList.add(item);
        }
        
    }
    
}
