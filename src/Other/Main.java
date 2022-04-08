package Other;

public class Main {
    public static void main(String[] args) {
//        int[] array = {27, 97, 86, 88, 31, 46, 59, 48, 16, 4};
//        int a = array.length;
//        int[] arrays = new int[a];
//        int max;
//        for (int i = 0; i <= a - 1; i++) {
//            arrays[i] = array[a - 1 - i];
//        }
//        for (int item : arrays) {
//            System.out.print(item + " ");
//        }
//        System.out.println(" ");
//
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j < a - 1; j++) {
//                if (arrays[j] < arrays[j + 1]) {
//                    max = arrays[j];
//                    arrays[j] = arrays[j + 1];
//                    arrays[j + 1] = max;
//                }
//            }
//        }
//        Arrays.sort(arrays);
//        for (int item : arrays) {
//            System.out.print(item + " ");
//        }
//        ToTable a = new ToTable(new int[] {1, 2, 3, 4, 5, 6}, 3, 2);
        ToLine a = new ToLine(new int[][] {{1, 2}, {3, 4}, {5, 6}});
//        int[] arr = a.resize();
        int[] arr = a.resize();
        for (int ints : arr) {
                System.out.print(ints + " ");

        }
    }
}


