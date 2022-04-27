package com.example.dtodemo.repository;

import com.example.dtodemo.models.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by shivam.si on 27/04/22 9:30 am
 */

@Repository
public interface LocationRepository extends CrudRepository<Location, Long> {
}
