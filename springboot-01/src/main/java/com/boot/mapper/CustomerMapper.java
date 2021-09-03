package com.boot.mapper;

import com.boot.pojo.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface CustomerMapper {


    List<Customer> queryCusList();

    Customer queryCusById(Integer id);

    int addCus(Customer customer);

    int updateCus(Customer customer);

    int deleteCus(int id);
}