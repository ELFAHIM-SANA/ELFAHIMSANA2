package ma.iaad.elfahimjpa;

import ma.iaad.elfahimjpa.Service.UserService;
import ma.iaad.elfahimjpa.entities.Role;
import ma.iaad.elfahimjpa.entities.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class ElfahimjpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElfahimjpaApplication.class, args);
	}
	@Bean
    CommandLineRunner start(UserService userService){
		return args -> {
			User u=new User();
			u.setUserName("user1");
			u.setPasseword("123456");
			userService.addNewUser(u);

			User u2=new User();
			u2.setUserName("admin");
			u2.setPasseword("123456");
			userService.addNewUser(u2);

			Stream.of("STUDENT","USER","ADMIN").forEach(r->{
				Role role1 =new Role();
				role1.setRoleName(r);
				userService.addNewRole(role1);
			});
			userService.addRoleToUser("user1", "STUDENT");
			userService.addRoleToUser("user1", "USER");
			userService.addRoleToUser("admin", "USER");
			userService.addRoleToUser("admin", "ADMIN");

			try {
				User user=userService.authenticate("user1","123456");
				System.out.println(user.getUserId());
				System.out.println(user.getUserName());
				System.out.println("Roles=>");
				user.getRoles().forEach(r->{
					System.out.println("Roles=>"+r);
				});

			}
			catch (Exception e){
				e.printStackTrace();

			}






        };
	}
}
