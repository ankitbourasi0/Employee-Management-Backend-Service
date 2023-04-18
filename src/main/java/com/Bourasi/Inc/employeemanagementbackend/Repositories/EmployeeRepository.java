package com.Bourasi.Inc.employeemanagementbackend.Repositories;

import com.Bourasi.Inc.employeemanagementbackend.Entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {

}
