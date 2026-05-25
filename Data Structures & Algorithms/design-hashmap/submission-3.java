class MyHashMap {

    private int[] map;

    public MyHashMap() {
        map = new int[1000000];
        Arrays.fill(map, -1);
    }
    
    public void put(int key, int value) {
        if (key < this.map.length) this.map[key] = value;
    }
    
    public int get(int key) {
        if (key < this.map.length) this.map[key];
    }
    
    public void remove(int key) {
        this.map[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */