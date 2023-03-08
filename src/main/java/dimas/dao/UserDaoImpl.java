package dimas.dao;

import dimas.model.User;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
@Transactional
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("select a from User a", User.class).getResultList();
    }

    @Override
    public void create(User user) {
        entityManager.persist(user);

    }
    @Override
    public void update(int id) {
        entityManager.merge(id);

    }
    @Override
    public void delete(int id) {
        User user = entityManager.find(User.class,id);
        entityManager.remove(user);

    }

    @Override
    public User show(long id) {
         return entityManager.find(User.class,id);

    }
}
