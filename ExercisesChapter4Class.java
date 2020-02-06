package chapter4;

public class ExercisesChapter4Class {

    public static void exercise2Secc44() {
        int [] first = new int[3];
        int [] second = {};
        int [] third = null;

        System.out.println(first != null ? "first array length: " + first.length : "The array points to null");
        System.out.println(second != null ? "second array length: " + second.length : "The array points to null");
        System.out.println(third != null ? "third array length: " + third.length : "The array points to null");
        
    }
    public static void main(String[] args) {
        exercise2Secc44();
    }
}