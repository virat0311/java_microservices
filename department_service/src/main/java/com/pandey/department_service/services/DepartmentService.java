package com.pandey.department_service.services;

import com.pandey.department_service.dto.DepartmentDto;

public interface DepartmentService {
     DepartmentDto saveDepartment(DepartmentDto departmentDto);
     DepartmentDto getDepartmentByCode(String code);
}
