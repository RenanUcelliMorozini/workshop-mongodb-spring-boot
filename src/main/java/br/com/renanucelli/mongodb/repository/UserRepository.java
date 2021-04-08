package br.com.renanucelli.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.renanucelli.mongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

	
}
