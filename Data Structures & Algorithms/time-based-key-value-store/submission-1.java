class TimeMap {

    Map<String, TreeMap<Integer, String>> mp;

    public TimeMap() {
        mp = new HashMap<>();

    }
    
    public void set(String key, String value, int timestamp) {
        mp.putIfAbsent(key, new TreeMap<>());
        mp.get(key).put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
        TreeMap<Integer, String> tm = mp.get(key);
        Map.Entry<Integer, String> entry = tm.floorEntry(timestamp);
        return entry == null ? "" : entry.getValue();
    }
}
