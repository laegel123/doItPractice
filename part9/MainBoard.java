public class MainBoard {
    public static void main(String[] args) {
        Player2 player = new Player2();
        player.play(1);

        AdvanceLevel2 advanceLevel = new AdvanceLevel2();
        player.upgradeLevel(advanceLevel);
        player.play(2);

        SuperLevel2 superLevel = new SuperLevel2();
        player.upgradeLevel(superLevel);
        player.play(3);
    }
}

abstract class PlayerLevel2 {
    abstract void run();

    abstract void jump();

    abstract void turn();

    abstract void levelInfo();

    final void play(int count) {
        levelInfo();
        run();
        for (int i = 0; i < count; i++) {
            jump();
        }
        turn();
    }
}

class BeginnerLevel2 extends PlayerLevel2 {

    @Override
    void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    void jump() {
        System.out.println("Jump 할 줄 모름.");
    }

    @Override
    void turn() {
        System.out.println("Turn 할 줄 모름.");
    }

    @Override
    void levelInfo() {
        System.out.println("***** 초보자 레벨입니다. *****");
    }
}

class AdvanceLevel2 extends PlayerLevel2 {

    @Override
    void run() {
        System.out.println("빨리 달립니다.");
    }

    @Override
    void jump() {
        System.out.println("높이 Jump 합니다.");
    }

    @Override
    void turn() {
        System.out.println("Turn 할 줄 모름.");
    }

    @Override
    void levelInfo() {
        System.out.println("***** 중급자 레벨입니다. *****");
    }
}

class SuperLevel2 extends PlayerLevel2 {

    @Override
    void run() {
        System.out.println("엄청 빨리 달립니다.");
    }

    @Override
    void jump() {
        System.out.println("아주 높이 Jump 합니다.");
    }

    @Override
    void turn() {
        System.out.println("한 바퀴 돕니다.");
    }

    @Override
    void levelInfo() {
        System.out.println("***** 고급자 레벨입니다. *****");
    }
}

class Player2 {
    private PlayerLevel2 playerLevel;

    public Player2() {
        playerLevel = new BeginnerLevel2();
    }

    public void upgradeLevel(PlayerLevel2 playerLevel) {
        this.playerLevel = playerLevel;
    }

    public void play(int count) {
        playerLevel.play(count);
    }

}
