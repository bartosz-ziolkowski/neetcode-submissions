class MyHashMap {

    private int[] mp;

    public MyHashMap() {
        mp = new int[1000001];
        Arrays.fill(mp, -1);     
    }
    
    public void put(int key, int value) {
        this.mp[key] = value;
    }
    
    public int get(int key) {
        return this.mp[key];
    }
    
    public void remove(int key) {
        this.mp[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */