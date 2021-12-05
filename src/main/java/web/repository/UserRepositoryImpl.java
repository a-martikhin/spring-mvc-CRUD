package web.repository;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("FROM User", User.class).getResultList();
    }

    @Override
    public User getUserByID(long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void addNewUser(User user) {
        entityManager.persist(user);
        entityManager.flush();
    }

    @Override
    public void updateUser(User updatedUser) {
        entityManager.merge(updatedUser);
        entityManager.flush();
    }

    @Override
    public User deleteUser(long id) throws NullPointerException {
        User user = getUserByID(id);
        if (null == user) {
            throw new NullPointerException("Такого пользователя нет!");
        }
        entityManager.remove(user);
        entityManager.flush();
        return user;
    }

}
