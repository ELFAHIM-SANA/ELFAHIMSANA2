package ma.iaad.elfahimjpa.Service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import ma.iaad.elfahimjpa.entities.Role;
import ma.iaad.elfahimjpa.entities.User;
import ma.iaad.elfahimjpa.repositories.RoleRepository;
import ma.iaad.elfahimjpa.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Transactional
@AllArgsConstructor

public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private RoleRepository roleRepository;


    @Override
    public User addNewUser(User user) {
        user.setUserId(UUID.randomUUID().toString());
        return userRepository.save(user);
    }

    @Override
    public Role addNewRole(Role role) {

        return  roleRepository.save(role);
    }

    @Override
    public User findUserByUserName(String userName) {

        return userRepository.findByUserName(userName);
    }

    @Override
    public Role findRoleByName(String roleName) {

        return roleRepository.findByRoleName(roleName);
    }

    @Override
    public void addRoleToUser(String userName, String roleName) {
        User user= findUserByUserName(userName);
        Role role= findRoleByName(roleName);
        if(user.getRoles()!=null)
        {           user.getRoles().add(role);
            role.getUsers().add(user);
        }
        //userRepository.save(user);

}

    @Override
    public User authenticate(String userName, String password) {
        User user=userRepository.findByUserName(userName);
        if(user==null) throw  new RuntimeException("Bad credentials");
        if(user.getPasseword().equals(password)){
            return  user;
        }
        throw  new RuntimeException("Bad credentials");
    }
}
