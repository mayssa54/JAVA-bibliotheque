package mini.projet;
public abstract class multimedia extends document 
{ 
    //attributs de la classe  
    protected float duree ; 
    
    //constructeur de la classe
    public multimedia(document d, float duree)  
    {
        super(d) ; 
        this.duree = duree ; 
    }
    
    //constructeur par copie 
    public multimedia(multimedia m) 
    {  
        super(m) ; 
        duree = m.duree ; 
    }
    
    //méthodes de la classe  
    public float getDuree() 
    {
        return duree ; 
    }
    public void setDuree(float duree) 
    {
        this.duree = duree ; 
    } 
    
    @Override
    public void description() 
    {
        System.out.println("la description du document : \n ");   
        System.out.println("le titre : \n" +titre+ "\n l'auteur :\n"  +auteur+ "\n reference : \n" +reference);   
        System.out.println("duree du fichier multimedia  : " +duree);   
    } 
}
