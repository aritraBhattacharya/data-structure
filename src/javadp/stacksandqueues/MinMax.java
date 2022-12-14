package javadp.stacksandqueues;

public class MinMax {
    /*
    * either keep a variable along with value in each node
    * Or 2x- min and 2min -y --> use this formula
    * Push(x) : Inserts x at the top of stack.

If the stack is empty, insert x into the stack and make minEle equal to x.
If the stack is not empty, compare x with minEle. Two cases arise:
If x is greater than or equal to minEle, simply insert x.
If x is less than minEle, insert (2*x – minEle) into the stack and make minEle equal to x. For example,
* let previous minEle was 3. Now we want to insert 2. We update minEle as 2 and insert 2*2 – 3 = 1 into the stack.
Pop() : Removes an element from top of stack.

Remove element from top. Let the removed element be y. Two cases arise:
If y is greater than or equal to minEle, the minimum element in the stack is still minEle.
If y is less than minEle, the minimum element now becomes (2*minEle – y), so update (minEle = 2*minEle – y).
*  This is where we retrieve previous minimum from current minimum and its value in stack. For example,
* let the element to be removed be 1 and minEle be 2. We remove 1 and update minEle as 2*2 – 1 = 3.
    * */
}
