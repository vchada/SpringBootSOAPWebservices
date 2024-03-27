package com.techbytesbyvenkat.spring_boot_soap_example.service;

import com.techbytesbyvenkat.spring_boot_soap_example.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    private static final Map<String, User> users = new HashMap<>();

    @PostConstruct
    public void initialize() {

        User peter = new User();
        peter.setName("John Doe");
        peter.setEmpId(1234);
        peter.setCompanyName("Apple Inc");

        User sam = new User();
        sam.setName("Peter Parker");
        sam.setEmpId(7890);
        sam.setCompanyName("Geico Insurance");

        User ryan = new User();
        ryan.setName("Ryan renolds");
        ryan.setEmpId(0007);
        ryan.setCompanyName("Marvel Studios");

        users.put(peter.getName(), peter);
        users.put(sam.getName(), sam);
        users.put(ryan.getName(), ryan);
    }


    public User getUsers(String name) {
        return users.get(name);
    }
}
