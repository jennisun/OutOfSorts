public class Sorts{
  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    for (int i = data.length; i > 1; i --) {
      for (int k = 0; k + 1 < i; k ++) {
        if (data[k] > data[k + 1]) {
          int hold = data[k + 1];
          data[k + 1] = data[k];
          data[k] = hold;
        }
      }
    }

  }


}
