package kz.learn.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PopMusic implements Music {
    @Override
    public String getSong() {
        return "I Want to Break Free";
    }
}
