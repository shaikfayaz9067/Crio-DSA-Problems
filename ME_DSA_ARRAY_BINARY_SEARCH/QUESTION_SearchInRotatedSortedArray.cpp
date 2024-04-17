#include "../crio/cpp/io/FastIO.hpp"
#include "../crio/cpp/io/PrintMatrix.hpp"
#include "../crio/cpp/io/ReadMatrix.hpp"
#include <bits/stdc++.h>
using namespace std;

class SearchInRotatedSortedArray {
  public:

  int binarySearch(vector<int> &nums,int low,int high,int target){

      if(high<low){
          return -1;
      }
      int mid=(low+high)/2;

      if(target==nums[mid]){
          return mid;
      }
      if(target >nums[mid]){
          return binarySearch(nums,mid+1,high,target);
         
      }
       return binarySearch(nums,low,mid-1,target);
        
  }



    int findPivot(vector<int> &nums,int low,int high){

        if(high<low){
            return -1;
        }
        if(high==low){
            return low;
        }
       
        int mid=(low+high)/2;

        if(mid<high && nums[mid]>nums[mid+1]){
        return mid;
        }
        if(mid>0 && nums[mid]<nums[mid-1]){
        return (mid-1);
        }
        if(nums[0]>=nums[mid]){
        return findPivot(nums,low,mid-1);
        }
        return findPivot(nums,mid+1,high);

    }

    

    int search(vector<int>& nums, int target) {
        // Your implementation goes here

       int n=nums.size();
       int pivot=findPivot(nums,0,n-1);

       if(pivot==-1){
           return binarySearch(nums,0,n-1,target);
       }
       if(nums[0]<=target){
           return binarySearch(nums,0,pivot,target);
       }
        return binarySearch(nums,pivot+1,n-1,target);
        // int ans;
    	// return ans;
    }

};

int main() {
    FastIO();
    int n;
    cin >> n;
    vector<int> nums;
    ReadMatrix<int>().OneDMatrix(n, nums);

    int queries;
    cin >> queries;
    for (int i = 0; i < queries; i++) {
        int target;
        cin >> target;
        int result = SearchInRotatedSortedArray().search(nums, target);
        cout << result << "\n";
    }

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