package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void save(User user) throws Exception;

    void delete(int id);

    void edit(User user) throws Exception;

    User getById(int id);

}

