package nikhilsable.WorkHub.service;

import nikhilsable.WorkHub.dto.request.DepartmentRequest;
import nikhilsable.WorkHub.dto.response.DepartmentResponse;

import java.util.List;

public interface DepartmentService {

    DepartmentResponse createDepartment(DepartmentRequest request);

    DepartmentResponse getDepartmentById(Long departmentId);

    List<DepartmentResponse> getAllDepartments();

    DepartmentResponse updateDepartment(
            Long departmentId,
            DepartmentRequest request
    );

    void deleteDepartment(Long departmentId);
}