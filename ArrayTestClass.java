package chapter4;

public class ArrayTestClass {
    public static void main(String [] args) {
        Object [] iaa [] = {{"string is also an object"}, {null}, {new Object(), new Integer(10)}};

        Integer [] [] iaa1 [] = { {{new Integer(20)}}, {{new Integer(30)}, {new Integer(40)}}, {{new Integer(50)}, {new Integer(60)}, {new Integer(70)}} };
/** 
        for (int i = 0; i < iaa.length; i++) {
            System.out.println("Element[" + i + "] contains an array of length " + iaa[i].length);

            for (int j = 0; j < iaa[i].length; j++) {
                System.out.println("     Element[" + i + "][" + j + "] contains " + iaa[i][j]);
            }
        }
*/        
        for (int i = 0; i < iaa1.length; i++) {
            System.out.println("Element[" + i + "] contains an array of length " + iaa1[i].length);

            for (int j = 0; j < iaa1[i].length; j++) {
                System.out.println("     Element[" + i + "][" + j + "] contains " + iaa1[i][j]);

                for (int k = 0; k < iaa1[i][j].length; k++) {
                    System.out.println("     Element[" + i + "][" + j + "][" + k + "] contains " + iaa1[i][j][k]);
                }
            }
        }
    }
}
