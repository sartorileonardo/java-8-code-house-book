package chapter05_ordenation;

import chapter02_hello_lambda.User;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.ToIntFunction;

public class Main {

    public static void main(String[] args) {
        User user1 = new User("Joao da Silva", 120, false);
        User user2 = new User("Maria da Silva", 130, false);
        User user3 = new User("Jose da Silva", 100, false);

        List<User> users = Arrays.asList(user1, user2, user3);

        //User comparable function anonimous
        Collections.sort(users, (u1, u2) -> u1.getName().compareTo(u2.getName()));

        //Order by users to name with comparable
        users.sort((u1, u2) -> u1.getName().compareTo(u2.getName()));

        //Resume order by with comparator
        users.sort(Comparator.comparing(u -> u.getName()));

        //Order by name with native method
        List<String> fruits = Arrays.asList("orange", "apple", "banana");
        fruits.sort(Comparator.naturalOrder());

        //Order by with int numbers
        users.sort(Comparator.comparingInt(u -> u.getPoints()));
    }

}
