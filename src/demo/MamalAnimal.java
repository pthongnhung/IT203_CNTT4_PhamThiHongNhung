package demo;

public class MamalAnimal extends Animal {
    private String foodType;
    private boolean isLiveWithHuman;
    private String mamalSound;

    public MamalAnimal() {
    }

    public MamalAnimal(String animalName, int numberOfLegs, String furColor, int averageLifeExpectancy, boolean isLiveWithHuman, String foodType, String mamalSound) {
        super(animalName, numberOfLegs, furColor, averageLifeExpectancy);
        this.isLiveWithHuman = isLiveWithHuman;
        this.foodType = foodType;
        this.mamalSound = mamalSound;
    }

    public String getMamalSound() {
        return mamalSound;
    }

    public void setMamalSound(String mamalSound) {
        this.mamalSound = mamalSound;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public boolean isLiveWithHuman() {
        return isLiveWithHuman;
    }

    public void setLiveWithHuman(boolean liveWithHuman) {
        isLiveWithHuman = liveWithHuman;
    }
}
