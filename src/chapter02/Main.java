package chapter02;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {


    public static void main(String[] args) {
        User user1 = new User("Joao da Silva", 120, true);
        User user2 = new User("Maria da Silva", 110, false);
        User user3 = new User("Jose da Silva", 105, false);

        List<User> users = Arrays.asList(user1, user2, user3);

        //Traditional Loop FOR
        /*
        for (User user : users) {
            System.out.println(user.getName());
        }
        */

        //Lambda Loop FOR
        users.forEach(u -> u.toModerator());

        //Print all moderators
        users.forEach(u -> System.out.println(u.getName() + " - " +u.getModerator()));
    }
}
