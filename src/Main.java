import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        PrintName.print("Meera");
        Family.printFamily();
        Address.printAddress();
        Day.printDay();
        ArrayList<String> people=new ArrayList<>(List.of("Sasi","Giri","Indhu"));
        Friends.printFriends(people);
    }
}