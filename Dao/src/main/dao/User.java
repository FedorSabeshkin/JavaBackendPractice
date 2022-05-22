package main.dao;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name + "\n" + this.age + "\n";
    }

    @Override
    public boolean equals(Object object) {

        if (object == this) {
            return true;
        }

        if (!(object instanceof User)) {
            return false;
        }

        User user = (User) object;
        return user.age== this.age
                && user.name.equals(this.name);
    }

}
