package ma.iaad.elfahimjpa.repositories;

import ma.iaad.elfahimjpa.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
    User findByUserName(String userName);

}
