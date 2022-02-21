public class ToLine {

    int[][] data;

    public ToLine(int[][] data) {
        this.data = data;
    }

    public int[] resize() {
        int[] nums = new int[data.length * data[0].length];
        int k = 0;
        for (int[] item : data) {
            for (int j = 0; j < item.length; j++) {
                nums[k + j] = item[j];
            }
            k += item.length;
        }
        return nums;
    }
}
//new int[][]{{1, 2}, {3, 4}, {5, 6}});