package kz.learn.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ClassicalMusic music = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(music.getSong());

        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playMusic();

        context.close();
    }

}
