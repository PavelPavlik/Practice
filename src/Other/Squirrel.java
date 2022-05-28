package Other;

public class Squirrel {
    int[] nuts; // поле nuts

    public Squirrel(int[] nuts) {
        this.nuts = nuts; // инициализируем nuts
    }

    int getNuts(int n) {return nuts[n];} // возвращаем значение элемента n

    int maxNuts() {
        if (nuts.length > 1) {
            int arr[] = nuts.clone(); // создаем дублирующий массив
            // куда лучше прыгать на первый, а потом на второй или сразу
            //на второй пенек
            arr[1] = max(arr[1], arr[0] + arr[1]);
            if (arr[1] < 0) arr[1] = 0;
            // мы поняли как лучше прыгнуть на первые 2 пенька, теперь
            //разбираемся с остальными
            for (int i = 2; i < arr.length; i++) {
                // как лучше прыгнуть перепрыгнуть предыдущий пенек или
                //нет
                arr[i] = max(arr[i] + arr[i - 1], arr[i] + arr[i - 2]);
                if (arr[i] < 0) arr[i] = 0;
            }

            // таким образом мы проходим все элементы массив, кроме
            // последних двух
            // ведь последний элемент может быть отрицательным и возможно
            // туда
            // прыгать было не нужно (наш for просто проверяет все
            // элементы, в том числе
            // и последний), поэтому осталось сравнить 2 последних
            // элемента, как мы сравнивали
            // два первых и возвратить данное значение и проверить, что
            // оно больше 0
            int a = max(arr[arr.length - 2], arr[arr.length - 1]);
            return max(0, a);
        } else return max(0, nuts[0]); // если массив длинной 1, то мы
        // проверяем, надо ли вообще
        //прыгать на пенек, если он кривой, то вернем 0 орехов, а если
        // там есть орехи, то вернем их.
    }

    private int max(int a, int b) { // метод нахождения максимума
        if (a >= b) return a;
        return b;
    }
}