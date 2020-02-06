package chapter4;

public class ExercisesChapter4Class {

    public static void exercise3Secc44() {
        char [] charArr = {'a', 'b', 'c', 'd'};

        System.out.println("Array content before the new assignments: ");
        for (int i = 0; i < charArr.length; i++) {
            System.out.println(charArr[i]);
        }

        charArr[0] = charArr[1];
        charArr[1] = charArr[2];
        charArr[2] = charArr[3];

        System.out.println("Array content after the new assignments: ");
        for (int i = 0; i < charArr.length; i++) {
            System.out.println(charArr[i]);
        }        
    }


    public static void main(String[] args) {
        exercise3Secc44();
    }
}