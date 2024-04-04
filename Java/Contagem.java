public class QuickSort {

    public void chamarQuicksort() {
        int[] array = promptArray();
        System.out.print("Array original: ");
        printArray(array);

        quicksort(array, 0, array.length - 1);

        System.out.print("Array ordenado: ");
        printArray(array);
    }

    private int[] promptArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os números do array separados por vírgula:");
        String input = scanner.nextLine();
        String[] numbers = input.split(",");
        int[] array = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            array[i] = Integer.parseInt(numbers[i]);
        }

        return array;
    }

    private void quicksort(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            int pivotIndex = partition(array, inicio, fim);
            quicksort(array, inicio, pivotIndex - 1);
            quicksort(array, pivotIndex + 1, fim);
        }
    }

    private int partition(int[] array, int inicio, int fim) {
        int pivot = array[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[fim];
        array[fim] = temp;

        return i + 1;
    }

    private void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}