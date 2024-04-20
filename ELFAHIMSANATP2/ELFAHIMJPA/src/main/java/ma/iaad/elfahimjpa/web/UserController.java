package ma.iaad.elfahimjpa.web;

import ma.iaad.elfahimjpa.Service.UserService;
import ma.iaad.elfahimjpa.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/users/{username}")
    public User user(@PathVariable String userName){
        User user= userService.findUserByUserName(userName);
        return user;

    }
}
