package az.taskify.service;

import az.taskify.entity.Admin;
import az.taskify.entity.Task;
import az.taskify.repository.AdminRepository;
import az.taskify.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminService {
    private final AdminRepository adminRepository;

    //Adminin qeydiyyatdan kecmesi
    public Admin signUp(Admin admin) {
        return adminRepository.save(admin);
    }


}
