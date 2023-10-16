// class # 3: ArrayKnowledge

public class ArrayKnowledge {

    // Question 5: stringToArray Method
    public static char[] stringToArray(String str) {
        return str.toCharArray();
    }

    // Question 6: generateArrayWithBounds Method
    public static int[] generateArrayWithBounds(int start, int end, int step) {
        int size = (end - start) / step;
        if ((end - start) % step != 0) {
            size++;
        }

        int[] result = new int[size];
        int index = 0;
        for (int i = start; i < end; i += step) {
            result[index] = i;
            index++;
        }

        return result;
    }

    public static void main(String[] args) {
        // test of stringToArray method
        char[] arr1 = stringToArray("Ham");
        for (char ch : arr1) {
            System.out.print(ch + " ");
        }
        System.out.println();

        char[] arr2 = stringToArray("I eat cheddar");
        for (char ch : arr2) {
            System.out.print(ch + " ");
        }
        System.out.println();

        // test of generateArrayWithBounds method
        int[] res1 = generateArrayWithBounds(5, 10, 1);
        for (int num : res1) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] res2 = generateArrayWithBounds(11, 18, 3);
        for (int num : res2) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] res3 = generateArrayWithBounds(1, 2, 1000);
        for (int num : res3) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
