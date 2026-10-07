/**
Fractional Knapsack — Greedy
Problem Statement
You are given n items, where each item has a weight and a value. You also have a knapsack with a given capacity.
You can take a fraction of an item, unlike the 0/1 Knapsack problem.
Your task is to maximize the total value of the items placed in the knapsack.
Example
Weight = [10, 20, 30]
Value  = [60, 100, 120]
Capacity = 50

Output = 240.0

Approach — Greedy
1. Calculate the value/weight ratio for every item.
2. Sort the items in descending order of value/weight ratio.
3. Start taking items from the highest ratio.
4. If the complete item fits, take it completely.
5. If it does not fit, take only the fraction that can fit and stop.
For example:
Item       Weight    Value    Value/Weight
1            10       60          6
2            20      100          5
3            30      120          4

Capacity = 50
- Take item 1 → 60
- Take item 2 → 100
- Take 20/30 of item 3 → 80
Maximum value = 240
Why Greedy Works
The item with the highest value per unit of weight gives us the maximum value for every unit of available capacity, so we always choose it first.
Complexity
For the code using nested loops for sorting:
Time Complexity: O(n²)
- Sorting using nested loops → O(n²)
- Traversing items → O(n)
Overall → O(n²)
Space Complexity: O(1)
No extra data structure is used.
**/

class Solution {

    public double fractionalKnapsack(int[] weight, int[] value, int capacity) {

        int n = weight.length;

        // Sort items by value/weight ratio in descending order
        for (int i = 0; i < n - 1; i++) {

            for (int j = i + 1; j < n; j++) {

                double ratio1 = (double) value[i] / weight[i];
                double ratio2 = (double) value[j] / weight[j];

                if (ratio1 < ratio2) {

                    // Swap weight
                    int temp = weight[i];
                    weight[i] = weight[j];
                    weight[j] = temp;

                    // Swap value
                    temp = value[i];
                    value[i] = value[j];
                    value[j] = temp;
                }
            }
        }

        double totalValue = 0;

        for (int i = 0; i < n; i++) {

            if (weight[i] <= capacity) {

                // Take the complete item
                totalValue = totalValue + value[i];

                capacity = capacity - weight[i];
            }

            else {

                // Take only the required fraction
                totalValue = totalValue +
                        ((double) value[i] / weight[i]) * capacity;

                break;
            }
        }

        return totalValue;
    }
}

