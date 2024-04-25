import java.util.ArrayList;

public class Friends {
    public static void printFriends(ArrayList<String> friends){
        System.out.print("My friends are ");
        for(String s:friends){
            System.out.print(s+", ");
        }
        System.out.println("Me");
    }
}
