package Other;

public class LimitingRectangle {

    private final int[][] points;

    public LimitingRectangle(int[][] points) {
        this.points = points;
    }

    public int getWidth() {
        return Math.abs(points[0][0]) + Math.abs(points[1][0]);
    }

    public int getHeight() {
        return Math.abs(points[0][1]) + Math.abs(points[1][1]);
    }

    public int getBorders() {
        System.out.println(points[0][1] + "," + points[1][1] + "," + points[0][0] + "," + points[1][0]);
        return 0;
    }
}
