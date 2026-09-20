class Log {
    private String timestamp;
    private int id;

    public Log(int id, String timestamp) {
        this.id = id;
        this.timestamp = timestamp;
    }
}

class LogSystem {

    private List<Log> logs;
    private Map<String, Integer> granularityIndexMap;

    public LogSystem() {
        logs = new ArrayList<>();
        granularityIndexMap = new HashMap<>();
        granularityIndexMap.put("Year", 4);     
        granularityIndexMap.put("Month", 7);   
        granularityIndexMap.put("Day", 10);     
        granularityIndexMap.put("Hour", 13);     
        granularityIndexMap.put("Minute", 16);   
        granularityIndexMap.put("Second", 19); 
    }
    
    public void put(int id, String timestamp) {
        logs.add(new Log(id, timestamp));
    }
    
    public List<Integer> retrieve(String start, String end, String granularity) {
        List<Integer> resultIds = new ArrayList<>();

        int substringLength = granularityIndexMap.get(granularity);

        String startTruncated = start.substring(0, substringLength);
        String endTruncated = end.substring(0, substringLength);

        for (Log logEntry : logs) {
            String logTimestampTruncated = logEntry.timestamp.substring(0, substringLength);

            if (startTruncated.compareTo(logTimestampTruncated) <= 0 &&
                logTimestampTruncated.compareTo(endTruncated) <= 0) {
                resultIds.add(logEntry.id);
            }
        }

        return resultIds;
    }
}

/**
 * Your LogSystem object will be instantiated and called as such:
 * LogSystem obj = new LogSystem();
 * obj.put(id,timestamp);
 * List<Integer> param_2 = obj.retrieve(start,end,granularity);
 */
