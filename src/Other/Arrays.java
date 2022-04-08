package Other;

class Arrays {
    int[] array;

    public Arrays(int[] array) {
        this.array = array;
    }

    public static void sort(String[] array) {
    }

    int[] even() {
        int[] nums = new int[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) ;array[i]=nums[i];
        }
        return nums;
    }

    int[] odd() {
        int[] nums1 = new int[0];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 > 0) ;nums1[i] = array[i];
        }
        return nums1;
    }

}