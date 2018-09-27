package com.ecomdashboard.demo.repositories;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecomdashboard.demo.entity.CompanyRevenue;
import com.ecomdashboard.demo.entity.OrderRecieved;


@Repository
@Qualifier(value="orderRecievedRepository")
public interface OrderRecievedRepository extends JpaRepository<OrderRecieved, Long>{


}
