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
        System.out.println(decToHex(31));

        // Task 5
        int[] array = new int[]{1, 0, 5, 3, 0, 6, 2, 9, 4};
        int[] arraySorted = sort(array);
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i]);
        System.out.println();
        for (int i = 0; i < arraySorted.length; i++)
            System.out.print(arraySorted[i]);
        System.out.println();

    }

    public static String getMonth(int month) {
        String monthString = "";
        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            case 5:
                monthString = "May";
                break;
            case 6:
                monthString = "June";
                break;
            case 7:
                monthString = "July";
                break;
            case 8:
                monthString = "August";
                break;
            case 9:
                monthString = "September";
                break;
            case 10:
                monthString = "October";
                break;
            case 11:
                monthString = "November";
                break;
            case 12:
                monthString = "December";
                break;
        }
        return monthString;
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
        String revString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revString += chars[i];
        }
        return revString;
    }

    public static String decToHex(int num) {
        int rest;
        String res = "";
        while (num > 16) {
            rest = num % 16;
            switch (rest) {
                case 10:
                    res += 'A';
                    break;
                case 11:
                    res += 'B';
                    break;
                case 12:
                    res += 'C';
                    break;
                case 13:
                    res += 'D';
                    break;
                case 14:
                    res += 'E';
                    break;
                case 15:
                    res += 'F';
                    break;
                default:
                    res += rest;
                    break;
            }
            num = num / 16;
        }
        res = res + num;

        return reverseString(res);
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