package az.taskify.service;

import az.taskify.entity.User;
import az.taskify.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    //Userin Admin terefinden create olunmasi
    public User addUser(User user) {
    return userRepository.save(user);
    }

}
