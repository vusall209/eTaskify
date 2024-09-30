package az.taskify.controller;

import az.taskify.entity.Admin;
import az.taskify.entity.Task;
import az.taskify.entity.User;
import az.taskify.service.AdminService;
import az.taskify.service.TaskService;
import az.taskify.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.servlet.function.ServerResponse.badRequest;

@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {
    private final AdminService adminService;

    private final UserService userService;

    private final TaskService taskService;

    //Adminin qeydiyyati
    @PostMapping("/adminSignUp")
    public Admin signUp(@RequestBody Admin admin) {
    return adminService.signUp(admin);
    }

    //Adminin Useri add elemesi
    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
        if (user.getPassword()==null || user.getPassword().length()<6){
            return (User) badRequest().body("Parola en az 6 karakter olmalıdır.");
        }
        return userService.addUser(user);
    }

    //Adminin Task yaratmasi
    @PostMapping("/createTask")
    public Task createTask(@RequestBody Task task) {
        return taskService.createTask(task);
    }

}
