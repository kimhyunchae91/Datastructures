/**
 * Created by Hyun on 8/8/2017.
 */
public class ArrayBub {
    private int[] a;
    private int nElements;

    public ArrayBub(int value){
        nElements = 0;
        a = new int[value];
    }

    public void insert(int value){
        a[nElements++] = value;
    }

    public void display(){
        for(int i = 0; i < nElements; i++){
            System.out.println(a[i] + " ");
        }
    }

    public void bubbleSort(){
        int in, out;
        for(out = nElements - 1; out > 0; out--){
            for(in = 0; in < out; in++){
                if(a[in] > a[in + 1]){
                    swap(in, in+1);
                }
            }
        }
    }

    public void selectionSort(){
        int out, in, min;

        for(out = 0; out<nElements - 1; out++){
            min = out;
            for(in = out + 1; in < nElements; in++){
                if(a[in] < a[min]){
                    min = in;
                }
            }
            swap(out, min);
        }
    }

    public void swap(int b, int c){
        int tmp;
        tmp = a[b];
        a[b] = a[c];
        a[c] = tmp;

    }

}
