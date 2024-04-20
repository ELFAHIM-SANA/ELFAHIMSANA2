package ma.iaad.elfahimjpa.Service;

import ma.iaad.elfahimjpa.entities.Role;
import ma.iaad.elfahimjpa.entities.User;

public interface UserService  {
    User addNewUser(User user);
    Role addNewRole(Role role);
    User findUserByUserName(String userName);
    Role findRoleByName(String roleName);
    void  addRoleToUser(String userName, String roleName);
    User authenticate(String userName, String password );




}
