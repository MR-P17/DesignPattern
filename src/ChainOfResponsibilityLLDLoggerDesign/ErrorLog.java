package ChainOfResponsibilityLLDLoggerDesign;

public class ErrorLog extends LogProcessor{
    public ErrorLog(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    public void log(int logNumber, String message){
        if(logNumber == ERROR)
            System.out.println("ERROR:: " + message);
        else
            super.log(logNumber, message);
    }
}
