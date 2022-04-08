package Other;

public class Separator {
    int[] array;
    int[] array1;
    int[] array2;

    public Separator(int[] array) {
        this.array = array;
    }

    public int[] even(int[]array) {
        for (int i = 0;i< array.length;i++){
            if(array[i]%2==0){
                array1[i] = array[i];
            }
        }
        return array1;
    }

    public int[] odd(int[]array){
        for (int i = 0;i<array.length;i++){
            if(array[i]%2>0){
                array2[i] = array[i];
            }
        }
        return array2;
    }
}
