package main.dao;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDao<User> implements Dao<User> {

    // we can put there our realization of repository
    private List<User> users = new ArrayList<>();

    @Override
    public void save(User user) {
        users.add(user);
    }

    @Override
    public void delete(User user) {
        users.remove(user);
    }

    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public User get(int id) {
        return users.get(id);
    }
}
