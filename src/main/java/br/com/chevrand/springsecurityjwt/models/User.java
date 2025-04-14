package br.com.chevrand.springsecurityjwt.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Getter;
import lombok.Setter;

@Table("USERS")
@Getter
@Setter
public class User {
	
	@Id
	private String username;
	private String password;
}
