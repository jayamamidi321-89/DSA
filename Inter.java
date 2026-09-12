package Demo;

public class Inter {

    static int interpolationSearch(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        while (
            low <= high &&
            target >= arr[low] &&
            target <= arr[high]
        ) {

            if (arr[low] == arr[high]) {
                if (arr[low] == target)
                    return low;
                else
                    return -1;
            }

            int pos = low + ((target - arr[low]) * (high - low))
                    / (arr[high] - arr[low]);

            if (arr[pos] == target) {
                return pos;
            }

            if (arr[pos] < target) {
                low = pos + 1;
            } else {
                high = pos - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70};

        int target = 50;

        int result = interpolationSearch(arr, target);

        System.out.println("Element found at index: " + result);
    }
}
