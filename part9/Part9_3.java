public class Part9_3 {
    public static void main(String[] args) {
        Player player = new Player();
        player.play(1);

        AdvanceLevel advanceLevel = new AdvanceLevel();
        player.upgradeLevel(advanceLevel);
        player.play(2);

        SuperLevel superLevel = new SuperLevel();
        player.upgradeLevel(superLevel);
        player.play(3);
    }
}

class Player {
    private PlayerLevel level;

    public Player() {
        level = new BeginnerLevel();
        level.showLevelMessage();
    }

    public PlayerLevel gerLevel() {
        return level;
    }

    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
        level.showLevelMessage();
    }

    public void play(int count) {
        level.go(count);
    }
}

abstract class PlayerLevel {
    abstract void run();

    abstract void jump();

    abstract void turn();

    abstract void showLevelMessage();

    final public void go(int count) {
        run();
        for (int i = 0; i < count; i++) {
            jump();
        }

        turn();
    }
}

class BeginnerLevel extends PlayerLevel {

    @Override
    void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    void jump() {
        System.out.println("Jump할 줄 모르지롱.");
    }

    @Override
    void turn() {
        System.out.println("Turn할 줄 모르지롱.");
    }

    @Override
    void showLevelMessage() {
        System.out.println("***** 초보자 레벨입니다. *****");
    }
}

class AdvanceLevel extends PlayerLevel {

    @Override
    void run() {
        System.out.println("빨리 달립니다.");
    }

    @Override
    void jump() {
        System.out.println("높이 Jump합니다.");
    }

    @Override
    void turn() {
        System.out.println("Turn할 줄 모르지롱.");
    }

    @Override
    void showLevelMessage() {
        System.out.println("***** 중급자 레벨입니다. *****");
    }
}

class SuperLevel extends PlayerLevel {

    @Override
    void run() {
        System.out.println("엄청 빨리 달립니다.");
    }

    @Override
    void jump() {
        System.out.println("아주 높이 Jump합니다.");
    }

    @Override
    void turn() {
        System.out.println("한 바퀴 돕니다.");
    }

    @Override
    void showLevelMessage() {
        System.out.println("***** 고급자 레벨입니다. *****");
    }
}
