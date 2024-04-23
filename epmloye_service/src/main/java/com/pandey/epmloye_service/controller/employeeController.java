package com.pandey.epmloye_service.controller;

import com.pandey.epmloye_service.dto.employeeDto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.pandey.epmloye_service.services.employeeService;
import com.pandey.epmloye_service.dto.apiResponseDto;
@RestController
@AllArgsConstructor
@RequestMapping("api/employee")
public class employeeController {
    private employeeService employeeService;

    @PostMapping("/save-emp")
    public ResponseEntity<employeeDto>saveeEmployee(@RequestBody employeeDto employeeDto){
        employeeDto e=employeeService.saveEmployee(employeeDto);
        return new ResponseEntity<>(e, HttpStatus.CREATED);

    }
    @GetMapping("/{id}")
    public ResponseEntity<apiResponseDto> getById(@PathVariable Long id){
        apiResponseDto e=employeeService.getEmployeeById(id);
        return new ResponseEntity<>(e,HttpStatus.OK);
    }
}
