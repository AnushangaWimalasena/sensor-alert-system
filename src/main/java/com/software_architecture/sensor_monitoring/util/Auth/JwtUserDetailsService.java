package com.software_architecture.sensor_monitoring.util.Auth;

import com.software_architecture.sensor_monitoring.entity.Users;
import com.software_architecture.sensor_monitoring.repository.UserRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public JwtUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        Users users;
        Optional<Users> user = Optional.ofNullable(userRepository.findByEmail(s));
        if(user.isPresent()){
            users = user.get();
            return new User(users.getEmail(),users.getPassword(),new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User not found with username: " + s);
        }
    }
}
