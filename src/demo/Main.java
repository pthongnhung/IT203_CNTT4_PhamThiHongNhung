package demo;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.input();

        MamalAnimal mamalAnimal = new MamalAnimal();
        mamalAnimal.input();

        bird.display();
        mamalAnimal.display();
    }
}
