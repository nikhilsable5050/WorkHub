package nikhilsable.WorkHub.service.impl;

import lombok.RequiredArgsConstructor;
import nikhilsable.WorkHub.dto.request.DepartmentRequest;
import nikhilsable.WorkHub.dto.response.DepartmentResponse;
import nikhilsable.WorkHub.repository.DepartmentRepository;
import nikhilsable.WorkHub.service.DepartmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    @Override
    public DepartmentResponse createDepartment(DepartmentRequest request) {
        return null;
    }

    @Override
    public DepartmentResponse getDepartmentById(Long departmentId) {
        return null;
    }

    @Override
    public List<DepartmentResponse> getAllDepartments() {
        return null;
    }

    @Override
    public DepartmentResponse updateDepartment(
            Long departmentId,
            DepartmentRequest request) {
        return null;
    }

    @Override
    public void deleteDepartment(Long departmentId) {

    }
}