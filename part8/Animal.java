import java.util.ArrayList;

public class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal {
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void readBook() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {
    public void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }

    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Eagle extends Animal {
    public void move() {
        System.out.println("독수리가 하늘을 납니다.");
    }

    public void flying() {
        System.out.println("독수리가 날아다닙니다.");
    }
}

class AnimalTest {
    ArrayList<Animal> animalList = new ArrayList<>();

    public static void main(String[] args) {
        AnimalTest animalTest = new AnimalTest();
        animalTest.addAnimal();
        System.out.println("원래 형으로 다운 캐스팅");
        animalTest.testCasting();
    }

    public void addAnimal() {
        animalList.add(new Human());
        animalList.add(new Tiger());
        animalList.add(new Eagle());

        for (Animal animal : animalList) {
            animal.move();
        }
    }

    public void testCasting() {
        for (int i = 0; i < animalList.size(); i++) {
            Animal animal = animalList.get(i);
            if (animal instanceof Human) {
                Human h = (Human) animal;
                h.readBook();
            }
            else if (animal instanceof Tiger) {
                Tiger t = (Tiger) animal;
                t.hunting();
            }
            else if (animal instanceof Eagle) {
                Eagle e = (Eagle) animal;
                e.flying();
            }
            else {
                System.out.println("지원되지 않는 형입니다.");
            }
        }
    }

}
