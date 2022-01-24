package web.dao;

import web.models.User;
import java.util.ArrayList;
import java.util.List;

public class UserDAO implements DAO{

    private List<User> userList;

    {
        userList = new ArrayList<>();

        userList.add(new User("Michael", 24, "michael@gmail.com"));
        userList.add(new User("Sarah", 21, "sarah@gmail.com"));
        userList.add(new User("Ann", 18, "ann@gmail.com"));
        userList.add(new User("Ivan", 22, "ivan@gmail.com"));
        userList.add(new User("Mary", 25, "mary@gmail.com"));
    }

    public List<User> showAll() {
        return userList;
    }

    public User show(int id) {
        return userList.stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }

    public void save(User user) {
        user.setId(1);
        userList.add(user);
    }

    public void update(int id, User updatedUser) {
        User userToBeUpdated = show(id);
        userToBeUpdated.setName(updatedUser.getName());
        userToBeUpdated.setEmail(updatedUser.getEmail());
        userToBeUpdated.setAge(updatedUser.getAge());
    }

    public void delete(int id) {
        userList.removeIf(p -> p.getId() == id);
    }

}