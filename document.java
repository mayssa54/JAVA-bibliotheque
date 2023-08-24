package mini.projet; 
public abstract class document { 
   
    //attributs de la classe 
    protected String auteur ;
    protected String titre ;
    protected int reference ; 
    
    //constructeur de la classe
    public document(String auteur, String titre, int reference) 
    {
        this.auteur= auteur ; 
        this.titre= titre ; 
        this.reference= reference ; 
    }
    
    //constructeur par copie 
    public document ( document d ) 
    { 
        auteur = d.auteur ; 
        titre = d.titre ; 
        reference = d.reference ; 
    }
    
    //méthodes de la classe
    public int getReference() 
    { 
        return reference ; 
    }
    public void setReference(int reference) 
    { 
        this.reference = reference ; 
    }
    public String getTitre() 
    {
        return titre ; 
    }
    public void setTitre(String titre)
    {
        this.titre = titre ; 
    }
    public String getAuteur() 
    {
        return auteur ; 
    }
    public void setAuteur(String auteur) 
    {
        this.auteur = auteur ; 
    } 
    public void description() 
    { 
        System.out.println("la description du document : \n ");   
        System.out.println("le titre : \n" +titre+ "\n l'auteur :\n"  +auteur+ "\n reference : \n" +reference);   
    }  
       
}
 