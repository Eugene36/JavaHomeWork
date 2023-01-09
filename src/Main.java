public class Main {
    public static void main(String[] args) {

        // Task 1
        System.out.println(getMonth(7));

        // Task 2
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(getIndex(arr, 4));

        // Task 3
        System.out.println(reverseString("hello"));

        // Task 4
        System.out.println(decToHex(255));

        // Task 5
        int[] array = new int[]{1, 0, 5, 3, 0, 6, 2, 9, 4};
        int[] arraySorted = sort(array);
        for (int j : array) System.out.print(j);
        System.out.println();
        for (int j : arraySorted) System.out.print(j);
        System.out.println();
    }

    public static String getMonth(int month) {
        return switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "";
        };
    }

    public static int getIndex(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value)
                return i;
        }
        return -1;
    }

    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        StringBuilder revString = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            revString.append(chars[i]);
        }
        return revString.toString();
    }

    public static String decToHex(int num) {
        int rest;
        StringBuilder res = new StringBuilder();
        while (num > 0) {
            rest = num % 16;
            switch (rest) {
                case 10 -> res.append('A');
                case 11 -> res.append('B');
                case 12 -> res.append('C');
                case 13 -> res.append('D');
                case 14 -> res.append('E');
                case 15 -> res.append('F');
                default -> res.append(rest);
            }
            num = num / 16;
        }
        return reverseString(res.toString());
    }

    public static int[] sort(int[] arr) {
        int[] brr = arr.clone();
        for (int i = 0; i < brr.length; i++)
            for (int j = 0; j < i; j++) {
                if (brr[j] > brr[i])
                    swap(brr, i, j);
            }
        return brr;
    }

    public static void swap(int[] array, int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t;
    }
}