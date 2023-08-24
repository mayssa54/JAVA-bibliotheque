package mini.projet;
public class livre extends document      
{  
    //attributs de la classe 
    private int nombredepages ; 
    
    //constructeur de la classe
    

    livre(document d ,int nombredepages) 
    {
           super(d); 
           this.nombredepages = nombredepages ;   
    }


        //méthodes de la classe  
    public int getNombredepages() 
    {
        return nombredepages  ; 
    }
    public void setNombredepages(int nombredepages)  
    {
       this.nombredepages = nombredepages ;  
    }
    
    @Override 
    public void description() 
    { 
        System.out.println("la description du document : \n ");   
        System.out.println("le titre : \n" +titre+ "\n l'auteur :\n"  +auteur+ "\n reference : \n" +reference);   
        System.out.println("la description du livre : \n ");   
        System.out.println("le nombre de pages : " +nombredepages );    
    }  
} 
