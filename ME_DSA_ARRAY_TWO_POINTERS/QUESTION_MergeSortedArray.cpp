#include "../crio/cpp/io/FastIO.hpp"
#include <bits/stdc++.h>
#include "../crio/cpp/io/ReadMatrix.hpp"
#include "../crio/cpp/io/PrintMatrix.hpp"

using namespace std;


vector<int> mergeSortedArray(vector<int>& nums1, int m, vector<int>& nums2, int n) {
    int k=0,i=0,j=0;
    vector<int> v;
    while(i<m && j< n){
        if(nums1[i]<=nums2[j]){
            v.push_back(nums1[i]);
            // k++;
            i++;
        }
         else{
            v.push_back(nums2[j]);
            // k++;
            j++;
        }
    }
    while(i<m){
        v.push_back(nums1[i]);
        i++;
        // k++;
    }
     while(j<n){
        v.push_back(nums2[j]);
        j++;
        // k++;
    }

    return v;


}

int main() {
    FastIO();
    int m, n;
    cin >> m >> n;
    vector<int> nums1, nums2;
    ReadMatrix<int>().OneDMatrix(m, nums1);
    ReadMatrix<int>().OneDMatrix(n, nums2);
    vector<int> result = mergeSortedArray(nums1, m, nums2, n);
    PrintMatrix<int>().OneDMatrix(result, " ");
    return 0;
}

/* 
Crio Methodology

Milestone 1: Understand the problem clearly
1. Ask questions & clarify the problem statement clearly.
2. *Type down* an example or two to confirm your understanding of the input/output & extend it to test cases

Milestone 2: Finalize approach & execution plan
1. Understand what type of problem you are solving.
     a. Obvious logic, tests ability to convert logic to code
     b. Figuring out logic
     c. Knowledge of specific domain or concepts
     d. Knowledge of specific algorithm
     e. Mapping real world into abstract concepts/data structures
2. Brainstorm multiple ways to solve the problem and pick one
3. Get to a point where you can explain your approach to a 10 year old
4. Take a stab at the high-level logic & *type it down*.
5. Try to offload processing to functions & keeping your main code small.

Milestone 3: Code by expanding your pseudocode
1. Have frequent runs of your code, dont wait for the end
2. Make sure you name the variables, functions clearly.
3. Avoid constants in your code unless necessary; go for generic functions, you can use examples for your thinking though.
4. Use libraries as much as possible

Milestone 4: Prove to the interviewer that your code works with unit tests
1. Make sure you check boundary conditions
2. Time & storage complexity
3. Suggest optimizations if applicable
*/