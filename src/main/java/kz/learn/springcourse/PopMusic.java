package kz.learn.springcourse;

import org.springframework.stereotype.Component;

public class PopMusic implements Music{
    @Override
    public String getSong() {
        return "Take On Me";
    }
}
