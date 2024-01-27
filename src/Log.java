class Log {
    private long timestamp;
    private String creator;
    private String logText;
    private LogType logType;

    public Log(String creator, String logText, LogType logType) {
        this.timestamp = System.currentTimeMillis();
        this.creator = creator;
        this.logText = logText;
        this.logType = logType;
    }

    @Override
    public String toString() {
        return "Log{" +
                "timestamp=" + timestamp +
                ", creator='" + creator + '\'' +
                ", logText='" + logText + '\'' +
                ", logType=" + logType +
                '}';
    }

    public Log get(int i) {

        return null;
    }
}