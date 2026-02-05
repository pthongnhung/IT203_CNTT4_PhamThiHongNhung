package demo;

import java.util.Scanner;

public class Bird extends Animal {
    private Boolean isFly;
    private String birdSound;

    public Bird() {

    }

    public Bird(String animalName, int numberOfLegs, String furColor, int averageLifeExpectancy, Boolean isFly, String birdSound) {
        super(animalName, numberOfLegs, furColor, averageLifeExpectancy);
        this.isFly = isFly;
        this.birdSound = birdSound;
    }

    public Boolean getFly() {
        return isFly;
    }

    public void setFly(Boolean fly) {
        isFly = fly;
    }

    public String getBirdSound() {
        return birdSound;
    }

    public void setBirdSound(String birdSound) {
        this.birdSound = birdSound;
    }

    @Override
    public void input() {
        super.input();

        Scanner sc = new Scanner(System.in);
        System.out.println("Co bay duoc khong(true/false): ");
        isFly = Boolean.parseBoolean(sc.nextLine());

        System.out.println("Tieng hot: ");
        birdSound = sc.nextLine();
    }
    @Override
    public void display(){
        super.display();

        System.out.println("Co bay duoc: "+isFly);
        System.out.println("Tieng hot: "+birdSound);
    }
}


