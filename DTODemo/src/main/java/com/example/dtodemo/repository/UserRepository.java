package com.example.dtodemo.repository;

import com.example.dtodemo.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by shivam.si on 27/04/22 9:29 am
 */

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
