package main.dao;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Application {


    public static void main(String[] args) {
        Dao<User> dao = new UserDao<>();
        User student = new User("Max", 23);
        User teacher = new User("Victor", 30);
        dao.save(student);
        print(dao.getAll());

        dao.save(teacher);
        dao.delete(student);
        print(dao.getAll());
    }

    static void print(Object object) {
        System.out.println(object);
    }

    static void print(List<Object> objects) {
        objects.stream().forEach(object -> System.out.println(object));
    }
}
