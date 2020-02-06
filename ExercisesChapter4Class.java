package chapter4;

public class ExercisesChapter4Class {

    public static void main(String[] args) {
        boolean [] booleanArr = new boolean [3];

        System.out.println("Elements of the array without explicit initialization: ");
        
        for (int i = 0; i < booleanArr.length; i++) {
            System.out.println("Element at position [" + i + "]: " + booleanArr[i]);        
        }
    }
}