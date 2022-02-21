public class ToTable {

    int[] data;
    int x;
    int y;

    public ToTable(int[] data, int x, int y) {
        this.data = data;
        this.x = x;
        this.y = y;
    }

    public int[][] resize(){
        int[][] nums = new int[x][y];
        int k = 0;
        for (int i = 0; i < x; i++) {
            for (int j = k; j < k + y; j++) {
                nums[i][j - k] = data[j];
            }
            k += y;
        }
                return nums;
    }
}
// {1, 2, 3, 4, 5, 6}, 3, 2);
