import java.util.ArrayList;
import java.util.List;

class LoggerSystem {
    private List<Log> logs;
    private List<Log> deletedLogs;

    public LoggerSystem() {
        this.logs = new ArrayList<>();
        this.deletedLogs = new ArrayList<>();
    }

    public void createLog(String creator, String logText, LogType logType) {
        Log log = new Log(creator, logText, logType);
        logs.add(log);
        System.out.println("Log created: " + log);
    }


    public void deleteLog(String owner, Log log) {
        if (owner.equals("Owner") || owner.equals("Admin")) {
            logs.remove(log);
            deletedLogs.add(log);
            System.out.println("Log deleted: " + log);
        } else {
            System.out.println("Access denied. Only Owner or Admin can delete logs.");
        }
    }


    public Log displayAllLogs() {
        System.out.println("All Logs:");
        for (Log log : logs) {
            System.out.println(log);
        }
        return null;
    }


    public void displayDeletedLogs() {
        System.out.println("Deleted Logs:");
        for (Log log : deletedLogs) {
            System.out.println(log);
        }
    }
}