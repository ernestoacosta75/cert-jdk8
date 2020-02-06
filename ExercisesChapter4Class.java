package chapter4;

public class ExercisesChapter4Class {

    public static void exercis32Secc44() {
        char [] charArr = {'a', 'b', 'c', 'd'};
    }

    public static void exercise2Secc44() {
        int [] first = new int[3];
        int [] second = {};
        int [] third = null;

        System.out.println(first != null ? "first array length: " + first.length : "The array points to null");
        if(first != null) {
            for (int i = 0; i < first.length; i++) {
                System.out.println("Element [" + i + "]: " + first[i]);
            }
        }

        System.out.println(second != null ? "second array length: " + second.length : "The array points to null");
        if(second != null) {
            for (int i = 0; i < second.length; i++) {
                System.out.println("Element [" + i + "]: " + second[i]);
            }
        }

        System.out.println(third != null ? "third array length: " + third.length : "The array points to null");
        if(third != null) {
            for (int i = 0; i < third.length; i++) {
                System.out.println("Element [" + i + "]: " + third[i]);
            }
        }
        
    }
    public static void main(String[] args) {
        exercise2Secc44();
    }
}