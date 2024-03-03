package kz.learn.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PopMusic implements Music {
    List<String> songs = new ArrayList<>();

    {
        songs.add("Take On Me");
        songs.add("Billie Jean");
        songs.add("I Want to Break Free");
    }

    @Override
    public List<String> getSongs() {
        return songs;
    }
}
