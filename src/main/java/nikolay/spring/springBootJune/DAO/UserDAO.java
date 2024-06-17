package nikolay.spring.springBootJune.DAO;


import nikolay.spring.springBootJune.models.User;

import java.util.List;

public interface UserDAO {

    public User getById(Long id);

    public List<User> getUsers();

    public void add(User user);

    public void updateUser(long id, User updateUser);

    public void delete(long id);


}
