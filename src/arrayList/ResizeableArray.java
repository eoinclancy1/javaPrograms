package arrayList;

 public class ResizeableArray{
    
    private int size;
    private int[] items;
    
    public ResizeableArray(int size){
        this.size = 0;
        this.items = new int[size];
    }
    
    public int getSize(){
        //return this.size;
        return items.length;
    }
    
    public int getIndex(int index){
        if (index < 0 || index > this.size){
            throw new ArrayIndexOutOfBoundsException(index);
        }
        return items[index];
    }
    
    public void append(int x){
        ensureExtraCapacity();
        items[size] = x;
        size++;
    }
    
    public void ensureExtraCapacity(){
        if (size == items.length){
            int[] copy = new int[size*2];
            System.arraycopy(items, 0, copy, 0, size);
            items = copy;
        }
    }
 }