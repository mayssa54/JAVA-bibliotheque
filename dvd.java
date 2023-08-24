package mini.projet;
public class dvd extends multimedia 
{
    //attributs de la classe 
    private boolean bonus ; 
    
    //constructeur de la classe
    public dvd(multimedia m, boolean bonus) 
    {
        super(m) ; 
        this.bonus = bonus ; 
    }

    
    //méthodes de la classe 
    public boolean getBonus() 
    {
        return bonus ; 
    }
    public void setBonus(boolean bonus)
    {
        this.bonus = bonus ; 
    }
    @Override 
    public void description() 
    {
        System.out.println("la description du document : \n ");   
        System.out.println("le titre : \n" +titre+ "\n l'auteur :\n"  +auteur+ "\n reference : \n" +reference);   
        System.out.println("duree du fichier multimedia  : " +duree);   
        System.out.println("Bonus : " +bonus);   
    }
} 
