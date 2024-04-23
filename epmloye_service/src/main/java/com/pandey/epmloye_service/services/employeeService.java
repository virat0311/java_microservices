package com.pandey.epmloye_service.services;

import com.pandey.epmloye_service.dto.employeeDto;
import com.pandey.epmloye_service.dto.apiResponseDto;

public interface employeeService {
    employeeDto saveEmployee(employeeDto employeedto);
    apiResponseDto getEmployeeById(Long id);

}
