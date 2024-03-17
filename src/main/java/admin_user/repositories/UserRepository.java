package admin_user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import admin_user.model.User;

@Repository
//Jpa entity user
public interface UserRepository extends JpaRepository<User, Long> {
    
	User findByEmail (String email);
}
