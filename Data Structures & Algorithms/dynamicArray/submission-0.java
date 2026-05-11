class DynamicArray {

    private int[] array;
    private int size;

    public DynamicArray(int capacity) {
        if (capacity > 0) {
            this.array = new int[capacity];
        }
        this.size = 0;
    }

    public int get(int i) {
        return this.array[i];
    }

    public void set(int i, int n) {
        this.array[i] = n;
    }

    public void pushback(int n) {
        if (size == array.length) {
            resize();
        }
        array[size] = n;
        this.size++;
    }

    public int popback() {
        this.size--;
        return this.array[this.size];
    }

    public void resize() {
        int newCapacity = this.array.length * 2;
        int[] resizedArray = new int[newCapacity];
        for(int i = 0; i < this.size; i++) {
            resizedArray[i] = this.array[i];
        }
        this.array = resizedArray;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.array.length;
    }
}