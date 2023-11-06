package com.reportwork.service;

import com.reportwork.model.User;
import com.reportwork.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findOrCreateUser(Integer employeeCode) {
        User user = userRepository.findByEmployeeCode(employeeCode);
        if (user == null) {
            // Nếu không tìm thấy User với mã nhân viên, tạo mới User
            user = new User();
            user.setEmployeeCode(employeeCode);
            userRepository.save(user);
        }
        return user;
    }

}
