package com.liftoff.application.twitter.repository;
import com.liftoff.application.twitter.model.UserInfo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends CrudRepository<UserInfo,Long>  {

    UserInfo findByUserEmail(String email);

    UserInfo findByUserId(int id);
}
