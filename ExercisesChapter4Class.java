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

    public static void exercise5Secc44() {
        String[][] names = new String[2][3];

        // Filling the array of String arrays
        names[0][0] = "Item0ForArrayInIndex0";  
        names[1][0] = "Item1ForArrayInIndex0"; 
        System.out.println("Array content in the index 0: ");
        System.out.println(names[0][0]);
        System.out.println(names[1][0]);
        System.out.println();

        names[0][1] = "Item0ForArrayInIndex1";  
        names[1][1] = "Item1ForArrayInIndex1"; 
        System.out.println("Array content in the index 1: ");
        System.out.println(names[0][1]);
        System.out.println(names[1][1]);
        System.out.println();        

        names[0][2] = "Item0ForArrayInIndex2";  
        names[1][2] = "Item1ForArrayInIndex2"; 
        System.out.println("Array content in the index 2: ");
        System.out.println(names[0][2]);
        System.out.println(names[1][2]);
        System.out.println();        
    }



    public static void main(String[] args) {
        // exercise3Secc44();
        exercise5Secc44();
    }
}