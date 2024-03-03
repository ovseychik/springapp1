package kz.learn.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class PopMusic implements Music {
    @Override
    public String getSong() {
        return "I Want to Break Free";
    }
}
