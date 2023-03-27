// Реализуйте алгоритм сортировки пузырьком числового массива(введён вами),
// результат после каждой итерации запишите в лог-файл.
public class z1 {
    public static void Sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }
    }

    public static void main(String args[]) {
        int[] array = { 5,6,1,4,9,8,2,7,3 };
        Sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}