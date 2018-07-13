package com.liftoff.application.twitter.controller;

import com.liftoff.application.twitter.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/getfriends", method = RequestMethod.POST)
    public String getFriends(@RequestBody String email) throws Exception {
        StringBuilder sb = new StringBuilder();
        String[] emaillist = email.split(",");
        if (emaillist != null && emaillist.length == 2) {
            String email1 = emaillist[0];
            String email2 = emaillist[1];


            String[] list1 = userRepository.findByUserEmail(email1).getFriendsid();
            String[] list2 = userRepository.findByUserEmail(email2).getFriendsid();

            HashSet<String> friendset1 = new HashSet<>(Arrays.asList(list1));
            HashSet<String> friendset2 = new HashSet<>(Arrays.asList(list2));

            friendset1.retainAll(friendset2);
            int i=1;
            for (String s : friendset1) {
                sb.append("friend"+i+":");
                sb.append(userRepository.findByUserId(Integer.parseInt(s)).getUserName());
                i++;
            }
            return sb.toString();
        } else {
            throw new Exception("User not present");
        }


//        HashSet<Integer> set1 = new HashSet<Integer>(userRepository.findbyLastName(email1));
//        HashSet<Integer> set2 = userRepository.findbyLastName(email2);
//        set1.retainAll(set2);
    }


}
