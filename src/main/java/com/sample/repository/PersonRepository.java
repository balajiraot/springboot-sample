package com.sample.repository;

import com.sample.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by bthum on 3/18/17.
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{
}
