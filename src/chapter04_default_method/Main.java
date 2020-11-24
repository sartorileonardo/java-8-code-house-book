package chapter04_default_method;

import chapter02_hello_lambda.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("Joao da Silva", 120, false);
        User user2 = new User("Maria da Silva", 130, false);
        User user3 = new User("Jose da Silva", 100, false);

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);


        Consumer<User>  showMessage = u -> System.out.println("Before show names");
        Consumer<User> showName = u -> System.out.println(u.getName());

        //Run two operations
        users.forEach(showMessage.andThen(showName));

        //Remove If Predicate(condition)
        users.removeIf(u -> u.getPoints() > 100);

    }

}
