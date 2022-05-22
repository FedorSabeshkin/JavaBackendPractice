package main.dao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.context.event.annotation.BeforeTestExecution;
import org.springframework.test.context.event.annotation.BeforeTestMethod;

import static org.junit.Assert.*;

public class UserDaoTest {
    Dao<User> dao;
    User student = new User("Max", 23);
    User teacher = new User("Victor", 30);

    @Before
    public void beforeEach(){
        dao = new UserDao<>();
    }

    @Test
    public void save() {
        dao.save(student);
        assertEquals(student, dao.get(0));
    }

    @Test
    public void empty() {
        assertEquals(0, dao.getAll().size());
    }

    @Test
    public void delete() {
        dao.save(student);
        dao.save(teacher);
        dao.delete(teacher);
        assertEquals(1, dao.getAll().size());
    }

    @Test
    public void getAll() {
        dao.save(student);
        dao.save(teacher);
        assertEquals(2, dao.getAll().size());
    }


}