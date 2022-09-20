package com.example.demo.Services;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User saveUser(User model) {
        return userRepository.save(model);
    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }
    public User getUserById(int id){
        return userRepository.findById(id).orElse(null);
    }

    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

    public User updateUser(User newUser){
        if(userRepository.findById(newUser.getId()).isPresent()){
            User current = userRepository.findById(newUser.getId()).get();
            current.setFirstName(newUser.getFirstName());
            current.setLastName(newUser.getLastName());
            current.setEmail(newUser.getEmail());
            current.setPhoneNumber(newUser.getPhoneNumber());
            current.setDepartment(newUser.getDepartment());
            current.setDistrict(newUser.getDistrict());
            return userRepository.save(current);
        } else{
            return null;
        }
    }
}
