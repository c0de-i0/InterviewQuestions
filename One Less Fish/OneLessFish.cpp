#include <iostream>
#include <vector>

int main() {
    int n;
    std::cin >> n;
    std::vector<int> weight(n);

    for (int i = 0; i < n; i++) {
        std::cin >> weight[i];
    }

    int bowlWeight = INT_MAX;

    for (int i = 0; i < n; i++) {
        if (weight[i] < bowlWeight) {
            bowlWeight = weight[i];
        }
    }

    std::cout << "Fish Weights :-";

    for (int i = 0; i < n; i++) {
        int fishWeight = weight[i] - bowlWeight;

        if (fishWeight != 0) {
            std::cout << " " << fishWeight;
        }
    }

    std::cout << std::endl;

    return 0;
}
