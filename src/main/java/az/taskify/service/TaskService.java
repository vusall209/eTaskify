package az.taskify.service;

import az.taskify.entity.Task;
import az.taskify.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;

    //Admin Task yaratmagi
    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    //Istenilen Userin butun tasklari oxumasi
    public List<Task> getFullTask() {
        return taskRepository.findAll();
    }

    //User Taskin id'sine gore taski oxumagi
    public Optional<Task> getVeiwTask(long id) {
        return taskRepository.findById(id);
    }

    //Userin Task Statusunu Update etmesi
    public Task updateTask(long id, Task updateTask) {
        Task oldTaskStatus=taskRepository.findById(id)
                .orElseThrow(()->new RuntimeException
                        (" Z.O TaskId duzgun qeyd edin ID:"+id+" task yoxdur!"));
        updateTask.setStatus(oldTaskStatus.getStatus());
        return taskRepository.save(updateTask);
    }
}
