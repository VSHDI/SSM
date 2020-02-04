package com.bill.dao;

import com.bill.entity.TbUser;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    List<TbUser> selectAll();
}
