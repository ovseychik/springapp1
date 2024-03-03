package kz.learn.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private PopMusic popMusic;

    private MusicGenres musicGenres;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, PopMusic popMusic) {
        this.classicalMusic = classicalMusic;
        this.popMusic = popMusic;
    }

    public void playMusic(MusicGenres genre) {
        switch (genre) {
            case CLASSICAL:
                System.out.println("Playing: " + classicalMusic.getSongs().get((int) (Math.random() * 3)));
                break;
            case ROCK:
                System.out.println("Playing: " + popMusic.getSongs().get((int) (Math.random() * 3)));
                break;
        }
    }

}
