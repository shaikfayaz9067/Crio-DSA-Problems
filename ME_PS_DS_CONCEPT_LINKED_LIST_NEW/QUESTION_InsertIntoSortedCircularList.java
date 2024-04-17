import java.util.*;
import crio.ds.List.ListNode;

/*
public class ListNode {
   public int val; 
   public ListNode next;
   public ListNode(int x) { val = x; next = null; }
}
*/

class Solution{
	// Implement your solution here
public ListNode insertIntoSortedCircularList(ListNode head, int insertVal) {
        ListNode newNode = new ListNode(insertVal);

        if (head == null) {
            newNode.next = newNode;
            return newNode;
        }

        ListNode current = head;

        do {
            // Check if insertVal should be inserted between current and next nodes
            if ((current.val <= insertVal && insertVal <= current.next.val) || // Check if insertVal falls between current and next
                (current.val > current.next.val && (insertVal >= current.val || insertVal <= current.next.val)) // Check if insertVal is greater than current or less than next when current's value is greater than next
               ) {
                newNode.next = current.next;
                current.next = newNode;
                return head;
            }

            // Move to the next node
            current = current.next;

        } while (current != head); // Continue until we loop back to the head

        // All nodes have the same value or insertVal is greater than all values, insert the node after current
        newNode.next = current.next;
        current.next = newNode;
        return head;
    }
}

/* 
Crio Methodology

Milestone 1: Understand the problem clearly
1. Ask questions & clarify the problem statement clearly.
2. Take an example or two to confirm your understanding of the input/output

Milestone 2: Finalize approach & execution plan
1. Understand what type of problem you are solving and see if you can recollect solving similar problems in the past
      a. Obvious logic (this would only test ability to convert logic to code)
      b. Figuring out logic
      c. Knowledge of specific algorithm, data structure or pattern
      d. Knowledge of specific domain or concepts
      e. Mapping real world into abstract concepts/data structures
2. Brainstorm multiple ways to solve the problem and pick one based on the TC/SC requirements
3. Get to a point where you can explain your approach to a 10 year old

Milestone 3 : Come up with an Instruction Manual for a 10 year old
1. Take a stab at the high-level logic & write it down like a detailed Instruction Manual for a 10 Year old where each line of the manual can be expanded into a logical line(s) of code.
2. Try to offload logic out of the main section as much as possible by delegating to functions.

Milestone 4: Code by expanding your 10 Year Olds "Instruction Manual
1. Run your code snippets at every logical step to test correctness (Helps avoid debugging larger pieces of code later)
2. Make sure you name the variables, functions clearly.
3. Use libraries as much as possible

Milestone 5: Prove that your code works using custom test cases
1. Make sure you check boundary conditions and other test cases you noted in Milestone 1
      a. If compiler is not available, dry run your code on a whiteboard or paper
2. Suggest optimizations if applicable during interviews
*/