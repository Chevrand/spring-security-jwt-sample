package br.com.chevrand.springsecurityjwt.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import br.com.chevrand.springsecurityjwt.models.User;

public interface UserRepository extends CrudRepository<User, String>{

	Optional<User> findByUsername(String username);
}
