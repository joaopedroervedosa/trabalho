import java.util.Arrays;

public class Main {
    // Função para verificar se um número é primo
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Função para calcular o somatório de um array de números
    public static int sum(int[] numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    // Função para calcular o enésimo termo da sequência de Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib[n];
    }

    // Função para calcular o Máximo Divisor Comum (MDC)
    public static int mdc(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Função para realizar a ordenação com o algoritmo Quicksort
    public static int[] quicksort(int[] arr) {
        if (arr.length <= 1) return arr;
        int pivot = arr[arr.length - 1];
        int[] left = Arrays.stream(arr).filter(x -> x < pivot).toArray();
        int[] right = Arrays.stream(arr).filter(x -> x > pivot).toArray();
        int[] sortedLeft = quicksort(left);
        int[] sortedRight = quicksort(right);
        int[] result = new int[arr.length];
        System.arraycopy(sortedLeft, 0, result, 0, sortedLeft.length);
        result[sortedLeft.length] = pivot;
        System.arraycopy(sortedRight, 0, result, sortedLeft.length + 1, sortedRight.length);
        return result;
    }

    // Função para contar quantos números estão dentro do intervalo [primeiro valor, N]
    public static int countInRange(int[] arr, int n) {
        int count = 0;
        for (int num : arr) {
            if (num >= arr[0] && num <= n) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Testando Número Primo
        System.out.println("Número Primo:");
        System.out.println(isPrime(7));  // true
        System.out.println(isPrime(10)); // false

        // Testando Somatório
        System.out.println("\nSomatório:");
        System.out.println(sum(new int[]{1, 2, 3, 4, 5})); // 15

        // Testando Fibonacci
        System.out.println("\nFibonacci:");
        System.out.println(fibonacci(7)); // 13

        // Testando Máximo Divisor Comum (MDC)
        System.out.println("\nMDC:");
        System.out.println(mdc(56, 98)); // 14

        // Testando Quicksort
        System.out.println("\nQuicksort:");
        System.out.println(Arrays.toString(quicksort(new int[]{10, 5, 2, 3, 8})));  // [2, 3, 5, 8, 10]

        // Testando Contagem
        System.out.println("\nContagem:");
        System.out.println(countInRange(new int[]{1, 2, 3, 4, 5}, 4)); // 4
    }
}
