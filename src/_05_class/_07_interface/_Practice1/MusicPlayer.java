package _05_class._07_interface._Practice1;

public class MusicPlayer {
    public static void main(String[] args) {
        Music ms = new Mp3Player();
        System.out.println("===== MP3 Player =====");
        ms.play();
        ms.stop();

        System.out.println("===== CD Player =====");
        ms = new CDPlayer();
        ms.play();
        ms.stop();


    }
}
