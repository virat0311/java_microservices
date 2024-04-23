package com.pandey.department_service.controller;

import com.pandey.department_service.dto.DepartmentDto;
import com.pandey.department_service.services.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/department")
@AllArgsConstructor
public class departmentController {
    private DepartmentService departmentService;
//    public departmentController(DepartmentService departmentService){ //instead using this use @allargscons from lombok
//        this.departmentService=departmentService;
//    }
    @PostMapping("/saveDept")
    public ResponseEntity<DepartmentDto> SaveDepartment(@RequestBody DepartmentDto departmentDto){
        DepartmentDto savedd=departmentService.saveDepartment(departmentDto);
        return new ResponseEntity<>(savedd, HttpStatus.CREATED);

    }
    @GetMapping("/{dept-code}")
    public ResponseEntity<DepartmentDto> getByCode(@PathVariable("dept-code") String code){
        DepartmentDto d=departmentService.getDepartmentByCode(code);
        return new ResponseEntity<>(d,HttpStatus.OK);
    }


}
