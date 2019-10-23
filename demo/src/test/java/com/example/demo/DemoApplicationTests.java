package com.example.demo;

import com.example.demo.entity.User;
import com.example.demo.resp.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private UserRepository UserRepository;

    @Test
    public void contextLoads() {
        System.out.println(UserRepository.findByUserNameContains("CW").size());
        ;
    }
    @Test
    public void testSave(){
        User build = User.builder().age(19).build();
        UserRepository.save(build);
        System.out.println(build.getId());
    }

}
