package ChainOfResponsibilityLLDLoggerDesign;

public class MainLogger {
    public static void main(String[] args) {
        LogProcessor logProcessor =  new InfoLog(new DebugLog(new ErrorLog(null)));

        logProcessor.log(LogProcessor.ERROR, "error detected.");
        logProcessor.log(LogProcessor.INFO, "just need info.");
        logProcessor.log(LogProcessor.DEBUG, "need to debug");
        logProcessor.log(4, "log this");
    }

}
