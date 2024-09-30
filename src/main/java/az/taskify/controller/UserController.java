package az.taskify.controller;

import az.taskify.entity.Task;
import az.taskify.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final TaskService taskService;

    //Userin Butun Tasklari oxumasi
    @GetMapping("/veiwTask")
    public List<Task> getFullTask(){
        return taskService.getFullTask();
    }

    //Userin Spesifik TASK_ID'sine gore taska baxmagi
    @GetMapping("/veiwTask/{id}")
    public Optional<Task> getTaskById(@PathVariable long id) {
        return taskService.getVeiwTask(id);
    }

    //Userin Task statusunu update etmesi
    @PutMapping("updateTask/{id}")
    public Task updateTask(@PathVariable long id,Task updateTask){
        return taskService.updateTask(id,updateTask);
    }
}
