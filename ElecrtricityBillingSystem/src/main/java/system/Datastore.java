package system;

import java.util.*;

public class Datastore {

    public static ArrayList<User> users = new ArrayList<>();
    public static ArrayList<Bill> bills = new ArrayList<>();

    static {
        users.add(new Admin(1,"Admin","admin@mail.com","123"));
        users.add(new Operator());
        
        bills.add(new Bill(101,"Nasr-City",120,300,true));
        bills.add(new Bill(102,"Ain-Shams",200,500,false));
    }
}
