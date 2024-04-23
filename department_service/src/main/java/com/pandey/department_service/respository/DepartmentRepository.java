package com.pandey.department_service.respository;

import com.pandey.department_service.dto.DepartmentDto;
import com.pandey.department_service.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
    //public  Department getDepartmentByCode(String code);
     Department findByDepartmentCode(String code);
}
