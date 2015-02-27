
public enum Level {
   DEBUG(1), INFO(2), ERROR(3);
     private int valeurLvl;
     private Level(int valeurLvl){
        this.valeurLvl = valeurLvl;
      }
     public int getValeur(){
        return valeurLvl;
    }    
}
