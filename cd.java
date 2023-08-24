package mini.projet;
public class cd extends multimedia 
{
    //attributs de la classe 
    private int nombredeplages ; 
    
    //constructeur de la classe
    public cd(multimedia m, int nombredeplages)
    {
        super(m) ;
        this.nombredeplages = nombredeplages ; 
    }
    
    //méthodes de la classe  
    public int getNombredeplages()
    {
        return nombredeplages ; 
    }
    public void setNombredeplages(int nombredeplages)
    {
        this.nombredeplages = nombredeplages ; 
    }
    @Override 
    public void description()
    {
        System.out.println("la description du document : \n ");   
        System.out.println("le titre : \n" +titre+ "\n l'auteur :\n"  +auteur+ "\n reference : \n" +reference);   
        System.out.println("duree du fichier multimedia  : " +duree);   
        System.out.println("nombre de plages  : " +nombredeplages); 
    }
    
}
