class TimeMap {

    private Map<String, TreeMap<Integer, String>> mp;

    public TimeMap() {
        mp = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        mp.putIfAbsent(key, new TreeMap<>());
        mp.get(key).put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
        if (!mp.containsKey(key)) return "";
        TreeMap<Integer, String> entry = mp.get(key);
        Map.Entry<Integer, String> val = entry.floorEntry(timestamp);
        return val == null ? "" : val.getValue();
    }
}
