package poly.ex2;

public class AnimalPolyMain3 {

    public static void main(String[] args) {
        // Inline Variable : option + com + N
        Animal[] animalArr = {new Dog(), new Cat(), new Caw(), new Pig()};

        for (Animal animal : animalArr) {
            // Extract Method : option + com + M
            soundAnimal(animal);
        }

    }

    // 변하지 않는 부분
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
