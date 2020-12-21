public class Sorts{
  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    for (int i = data.length; i > 1; i --) {
      boolean change = false;

      for (int k = 0; k + 1 < i; k ++) {
        if (data[k] > data[k + 1]) {
          int hold = data[k + 1];
          data[k + 1] = data[k];
          data[k] = hold;
          change = true;
        }
      }
      if (change == false) break;
    }
  }


  public static void selectionSort(int[] data){
    for (int i = 0; i < data.length - 1; i ++) {
      int min = data[i];
      int index = i;

      for (int k = i; k < data.length; k ++) {
        if (data[k] < min) {
          min = data[k];
          index = k;
        }
      }

      int hold = data[i];
      data[i] = min;
      data[index] = hold;
    }
  }


  public static void insertionSort(int[] data){
    int min = data[0];
    int indexmin = 0;
    for (int x = 0; x < data.length; x ++) {
      if (data[x] < min) {
        min = data[x];
        indexmin = x;
      }
    }
    int hold1 = data[0];
    data[0] = min;
    data[indexmin] = hold1;


    for (int i = 1; i < data.length; i ++) {

      for (int k = 1; k + 1 <= i; k ++) {
        if (data[k - 1] <= data[i] && data[k] >= data[i]) {
          int hold = data[k];
          data[k] = data[i];

          for (int a = i - 1; a > k; a --) {
            data[a + 1] = data[a];
          }

          data[k + 1] = hold;
        }
      }

    }
  }


}
