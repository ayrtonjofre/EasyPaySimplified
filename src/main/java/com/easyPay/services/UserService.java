package com.easyPay.services;

import com.easyPay.dataTransferObjects.UserDTO;
import com.easyPay.domain.user.User;
import com.easyPay.domain.user.UserType;
import com.easyPay.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public void validateTransaction(User sender, BigDecimal amount) throws Exception {
        if (UserType.MERCHANT.equals(sender.getUserType())) {
            throw new Exception("Merchant users cannot transfer.");
        }

        if (sender.getBalance().compareTo(amount) < 0){
            throw new Exception("Amount not enough.");
        }
    }

    public User findUserById(Long id) throws Exception{
        return this.repository.findUserById(id).orElseThrow(() -> new Exception("User not found!"));
    }

    public User createUser(UserDTO data){
        User newUser = new User(data);
        this.saveUser(newUser);
        return newUser;
    }

    public List<User> getAllUsers(){
        return this.repository.findAll();
    }

    public void saveUser(User user){
        this.repository.save(user);
    }

}
