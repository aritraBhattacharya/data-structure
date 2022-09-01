package stacksandqueues;

public class NextGreaterElement {


    /* Array [4, 5, 2, 25],
    * Element
   4      -->   5
   5      -->   25
   2      -->   25
   25     -->   -1* ==> because its the last element/

   * push each given element
   * count=-1 **
   * take an array of size of given element list arr[n]
   *
   * push(e){
   *
   * peek() --> if > e or stack is empty then just push, count++
   * else
   *    temp = count;
   *    while(stack.peek()<e){
   *        arr[temp] = e
   *        stack.pop()
   *        temp--
   *    }
   *    add element e
   *    count++
   *
   *
   *
   * }
     */
}
