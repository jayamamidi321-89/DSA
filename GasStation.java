
package Demo;

public class GasStation {

    static int canCompleteCircuit(
            int[] gas,
            int[] cost) {

        int totalGas = 0;
        int currentGas = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {

            totalGas += gas[i] - cost[i];

            currentGas += gas[i] - cost[i];

            // If current gas becomes negative,
            // start from the next station
            if (currentGas < 0) {
                start = i + 1;
                currentGas = 0;
            }
        }

        // If total gas is less than total cost,
        // completing the circuit is impossible
        if (totalGas < 0) {
            return -1;
        }

        return start;
    }

    public static void main(String[] args) {

        int[] gas = {1, 2, 3, 4, 5};

        int[] cost = {3, 4, 5, 1, 2};

        int result = canCompleteCircuit(gas, cost);

        System.out.println(
            "Starting Gas Station: " + result
        );
    }
}
  

