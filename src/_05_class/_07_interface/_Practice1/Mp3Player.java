package _05_class._07_interface._Practice1;

public class Mp3Player implements Music{
    @Override
    public void play() {
        System.out.println("Mp3 플레이어에서 '아이유 블루밍' 음악을 재생합니다.");
    }
    @Override
    public void stop() {
        System.out.println("Mp3 플레이어에서 '아이유 블루밍' 음악을 정지합니다.");
    }
}
