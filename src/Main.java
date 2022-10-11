public class Main {
    public static void main(String[] args) {
        task1_1();
    }
    public static void task1_1() {
        int[] array = new int[] {1, 2, 3};
        System.out.println(array[0]);
    }
    public static void task1_2() {
        float[] array = {1.57f, 7.654f, 9.986f};
        System.out.println(array[1]);
    }
    public static void task1_3() {
        boolean[] array = {true, true, false, false, true};
        System.out.println(array[2]);
    }
    public static void task2() {
        int[] array = new int[] {1, 2, 3};
        float[] array1 = {1.57f, 7.654f, 9.986f};
        boolean[] array2 = {true, true, false, false, true};
        System.out.print(array[0]);
        for(int i=1; i<array.length; i++) {
            System.out.print(", "+array[i]);
        }
        System.out.print("\n"+array1[0]);
        for(int k=1; k<array1.length; k++) {
            System.out.print(", "+array1[k]);
        }
        System.out.print("\n"+array2[0]);
        for(int j=1; j<array2.length; j++) {
            System.out.print(", "+array2[j]);
        }
    }
    public static void task3() {
        int[] array = new int[] {1, 2, 3};
        float[] array1 = {1.57f, 7.654f, 9.986f};
        boolean[] array2 = {true, true, false, false, true};
        System.out.print(array[array.length-1]);
        for(int i=array.length-2; i>=0; i--) {
            System.out.print(", "+array[i]);
        }
        System.out.print("\n"+array1[array1.length-1]);
        for(int k=array1.length-2; k>=0; k--) {
            System.out.print(", "+array1[k]);
        }
        System.out.print("\n"+array2[array2.length-1]);
        for(int j=array2.length-2; j>=0; j--) {
            System.out.print(", "+array2[j]);
        }
    }
    public static void task4() {
        int[] array = new int[] {1, 2, 3};
        for(int i=0; i<array.length; i++) {
            if(array[i]%2 != 0) {
                array[i] += 1;
            }
        }
        System.out.print(array[0]);
        for(int k=1; k< array.length; k++) {
            System.out.print(", "+array[k]);
        }
    }
}