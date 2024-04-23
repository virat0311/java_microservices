package com.pandey.department_service.services.impl;

import com.pandey.department_service.dto.DepartmentDto;
import com.pandey.department_service.entity.Department;
import com.pandey.department_service.respository.DepartmentRepository;
import com.pandey.department_service.services.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class departmentServiceimpl implements DepartmentService {
    private DepartmentRepository departmentRepository;
    // @Autowired no need here because we are using single parameter for constructor it use to inject of dependy of department repository
//    public departmentServiceimpl(DepartmentRepository departmentRepository){   instead of using this we canuse directly @Allargscouns from lombok
//        this.departmentRepository=departmentRepository;
//    }

    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {
        //convert dto to entity
        Department d=new Department(
                departmentDto.getId(),
                departmentDto.getDepartmentName(),
                departmentDto.getDepartmentDescription(),
                departmentDto.getDepartmentCode());
        Department savedDept=departmentRepository.save(d);
        DepartmentDto resDto=new DepartmentDto(savedDept.getId(),
                savedDept.getDepartmentName(),
                savedDept.getDepartmentDescription(),
                savedDept.getDepartmentCode());

        return resDto;
    }

    @Override
    public DepartmentDto getDepartmentByCode(String code) {
        Department d=departmentRepository.findByDepartmentCode(code);
        DepartmentDto departmentDto=new DepartmentDto(d.getId(),d.getDepartmentName(),d.getDepartmentDescription(),d.getDepartmentCode());


        return departmentDto;
    }
}
