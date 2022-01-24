package web.Service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.HibernateUserDAO;
import web.models.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private final HibernateUserDAO hibernateUserDAO;

    public UserServiceImpl(HibernateUserDAO hibernateUserDAO) {
        this.hibernateUserDAO = hibernateUserDAO;
    }

    @Override
    @Transactional
    public List<User> showAll() {
        return hibernateUserDAO.showAll();
    }

    @Override
    @Transactional
    public void save(User user) {
        hibernateUserDAO.save(user);
    }

    @Override
    @Transactional
    public User show(int id) {
        return hibernateUserDAO.show(id);
    }

    @Transactional
    @Override
    public void update(int id, User updatedUser) {
        hibernateUserDAO.update(id, updatedUser);
    }

    @Transactional
    @Override
    public void delete(int id) {
        hibernateUserDAO.delete(id);
    }
}
