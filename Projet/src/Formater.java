import java.text.SimpleDateFormat;
import java.util.Date;


    public class Formater {
      private final SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SS");
      private String pattern = null;
      
      
     public String formatMsg(Class<?> loggerName, Level msgLevel, String msg) {
         if(pattern == null) {
           return "DATE=" + dateFormatter.format(new Date())
           + " - [LOGGER=" + loggerName.getName()
           + " LEVEL=" + Integer.toString(msgLevel.getValeur())
           + " LEVEL_TYPE=" + msgLevel.name()
           + " MESSAGE: " + msg + "]";
        }
         String formatedMsg = "";
         formatedMsg = pattern.replaceAll("\\%\\(acstime\\)\\%", dateFormatter.format(new Date()));
         formatedMsg = formatedMsg.replaceAll("\\%\\(loggerName\\)\\%", loggerName.getName());
         formatedMsg = formatedMsg.replaceAll("\\%\\(levelNum\\)\\%", Integer.toString(msgLevel.getValeur()));
         formatedMsg = formatedMsg.replaceAll("\\%\\(levelName\\)\\%", msgLevel.name());
         formatedMsg = formatedMsg.replaceAll("\\%\\(message\\)\\%", msg);
          return formatedMsg;
}
}
