package br.com.chevrand.springsecurityjwt.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.chevrand.springsecurityjwt.models.UserAuthenticated;
import br.com.chevrand.springsecurityjwt.repositories.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	private final UserRepository repository;
	
	public UserDetailsServiceImpl(UserRepository userRepository) {
		this.repository = userRepository;
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return repository.findByUsername(username)
				.map(UserAuthenticated::new)
				.orElseThrow(() -> new UsernameNotFoundException("User not found"));
	}

}
