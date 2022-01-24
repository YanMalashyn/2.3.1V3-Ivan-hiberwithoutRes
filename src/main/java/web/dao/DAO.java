package web.dao;

import web.models.User;

import java.util.List;

public interface DAO {

    List<User> showAll();

    User show(int id);

    void save(User user);

    void update(int id, User updatedUser);

    void delete(int id);
}
