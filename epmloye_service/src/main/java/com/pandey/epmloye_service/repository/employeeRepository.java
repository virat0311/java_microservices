package com.pandey.epmloye_service.repository;

import com.pandey.epmloye_service.entity.employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface employeeRepository extends JpaRepository<employee,Long> {
}
