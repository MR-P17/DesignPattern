package ChainOfResponsibilityLLDLoggerDesign;

public class DebugLog extends LogProcessor{
    public DebugLog(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    public void log(int logNumber, String message){
        if(logNumber == DEBUG)
            System.out.println("DEBUG:: "+message);
        else
            super.log(logNumber, message);
    }
}
