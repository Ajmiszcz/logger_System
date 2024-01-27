public class Main {
    public static void main(String[] args) {

        LoggerSystem loggerSystem = new LoggerSystem();


        loggerSystem.createLog("Owner", "System started", LogType.INFO);
        loggerSystem.createLog("Admin", "Database connection error", LogType.ERROR);
        loggerSystem.createLog("Basic", "User login success", LogType.INFO);


        loggerSystem.displayAllLogs();


        loggerSystem.deleteLog("Owner", loggerSystem.displayAllLogs().get(0));
        loggerSystem.deleteLog("Basic", loggerSystem.displayAllLogs().get(1));


        loggerSystem.displayDeletedLogs();
    }
}