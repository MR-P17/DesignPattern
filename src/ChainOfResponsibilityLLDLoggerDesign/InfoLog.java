package ChainOfResponsibilityLLDLoggerDesign;

public class InfoLog extends LogProcessor{

    public InfoLog(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    public void log(int logNumber, String message){
        if(logNumber == INFO)
            System.out.println("INFO:: "+ message);
        else
            super.log(logNumber, message);
    }
}
