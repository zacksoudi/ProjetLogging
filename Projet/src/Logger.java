
import java.util.LinkedList;


    public class Logger {
    	
    	private Class<?> logger;
    	private Formater formater = null;
    	private Level level = null;
    	private LinkedList<Target> targets;
      
    	
        public Logger(Class<?> logger) {
        	this.logger = logger;
        	this.targets = new LinkedList<Target>();
        	
        	}
        public void setLevel(Level level) {
        	
        	this.level = level;
        	
        	}
        	public void setFormatter(Formater formater) {
        	
        	this.formater = formater;
        	
        	}
        	public void addTarget(Target target) {
        		
        		targets.add(target);
        		
        		}
        	
        	
        	public void debug(String msg) {
        	    showMsg(Level.DEBUG, msg);
        	}
        	public void info(String msg) {
        		showMsg(Level.INFO, msg);
        	}
        	public void error(String msg) {
        		showMsg(Level.ERROR, msg);
        	}
        	
        	private void showMsg(Level msgLevel, String msg){
        		if(level == null) {
        		System.out.println("Level non renseigné");
        		level = Level.DEBUG;
        		}
        		if(formater == null) {
        		System.out.println(" formateur du logger introuvable");
        		formater = new Formater();
        		}
        		if(targets.size() == 0) {
        		System.out.println("Aucune cible trouvé");
        		targets.add(new Console());
        		}
        		msg = formater.formatMsg(logger, msgLevel, msg);
        		envoyer(msgLevel, msg);
        		}
        	
        	private void envoyer(Level msgLevel, String msg) {
        		if(msgLevel.getValeur() >= level.getValeur()){
        		for(int i = 0; i < targets.size(); i++)
        		targets.get(i).traitement(msg);
        		}
        }
        	
    }