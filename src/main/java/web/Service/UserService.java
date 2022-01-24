package web.Service;

import web.models.User;

import java.util.List;

public interface UserService {

    List<User> showAll();

    void save(User user);

    User show(int id);

    void update(int id, User updatedUser);

    void delete(int id);
}
