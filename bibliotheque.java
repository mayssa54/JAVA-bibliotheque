package mini.projet;
import java.util.Scanner ; 
public class bibliotheque 
{
    //attributs de la classe  
    private document document[] ; 
    private int nombredocuments  ;  
    
    //constructeur de la classe
    public bibliotheque(document documents[],int n)
    {
        document=documents;
        nombredocuments=n;
    }
    
    //méthodes de la classe  
    public int getNombredocuments()
    {
      return nombredocuments ;   
    }
    
    public document[] getDocuments()
    {
        return document ; 
    } 
    
    public void setDocument(document documents[]) 
    {
        this.document = documents ; 
    }
    
    public void getdocuments()
    {
        System.out.println(); 
    }
    
    public void AjouterDocument(document d)
    {
        document[nombredocuments]=d ; 
        nombredocuments=nombredocuments+1 ;   
    } 
    
    public void EnleverDocument(document d) 
    { 
        while (document[nombredocuments] != null ) 
        {
            nombredocuments++ ; 
        }  
        int p = 0; 
        while ((document[p] != d) || (p<nombredocuments))  
                { 
                    p++ ;
                } 
        if(document[p]==d) 
            {
                document[p]=document[p+1]; 
                for(int s=p+1; s<nombredocuments ; s++)
                {
                    document[s]=document[s+1]; 
                } 
                document[nombredocuments-1]= null ; 
            } 
    } 
    
    public void listerdocuments()
    {
     for(int k=0;k<nombredocuments;k++)
     {
         document[k].description();
         System.out.println("");
     }
    } 
    
    
    public boolean TrouverDocument(document d)
    {
        boolean b= false ;  
        while (document[nombredocuments] != null ) 
        {
            nombredocuments++ ; 
        }
        int p;
        for(p=0 ; p<nombredocuments ; p++) 
        { 
            if(document[p]==d) 
            {
                b=true ; 
                return b ; 
            }
        }
        return b ;        
    }            

public static void main(String args[]) {  
        Scanner clavier = new Scanner( System.in);

        document[] documents = new document[20] ; 
        String auteur ; 
        String titre ; 
        int reference ; 
        int nombredepages ; 
        int nombredeplages ; 
        float duree ; 
        boolean bonus ; 
        int k ; 
        for(k=0; k<=20; k++) { 
        System.out.println("Choisisez un type de Dcocument : \n") ;
        System.out.println("************************************* \n") ;
        System.out.println("Tapez 1 si vous voulez choisir un livre \n") ;
        System.out.println("Tapez 2 si vous voulez choisir un dvd \n") ;
        System.out.println("Tapez 3 si vous voulez choisir un cd \n ") ; 
        System.out.println("Choisisez l'option :  \n") ;
        System.out.println("*********************************** \n") ;
        System.out.println("Tapez 4 si vous voulez enlever deux documents \n ") ; 
        System.out.println("Tapez 5 si vous voulez chercher un document \n ") ; 
        System.out.println("Tapez 6 si vous voulez Afficher la liste de tous les documents présents dans la bibliothèque \n ") ; 
        System.out.println("Tapez 7 si vous voulez quitter  \n ") ;
        int x= clavier.nextInt();   
        switch(x) { 
         
            case 1 : 
        {
            System.out.println("Enter le nom de l'auteur du livre : \n ");
            auteur=clavier.next() ; 
            System.out.println("Enter le titre du livre : \n ");
            titre=clavier.next() ; 
            System.out.println("Enter la reference du livre : \n ");
            reference=clavier.nextInt() ; 
            System.out.println("Enter le nombre de pages du livre : \n ");
            nombredepages=clavier.nextInt() ; 
            documents[k] = new livre (new document(auteur,titre,reference) {},nombredepages) ; 
              break ; 
        } 
        
            case 2 : 
        {
            System.out.println("Enter le nom de l'auteur du dvd : \n ");
            auteur=clavier.next() ; 
            System.out.println("Enter le titre du dvd : \n ");
            titre=clavier.next() ; 
            System.out.println("Enter la reference du dvd : \n ");
            reference=clavier.nextInt() ; 
            System.out.println("Enter le duree du dvd : \n ");
            duree=clavier.nextFloat() ;
            System.out.println("Enter le bonus : \n ");
            bonus=clavier.nextBoolean() ;  
            documents[k] = new dvd(new multimedia(new document(auteur,titre,reference) {},duree) {},bonus) ; 
              break ; 
        }
            case 3 : 
        {
            System.out.println("Enter le nom de l'auteur du cd : \n ");
            auteur=clavier.next() ; 
            System.out.println("Enter le titre du cd : \n ");
            titre=clavier.next() ; 
            System.out.println("Enter la reference du cd : \n ");
            reference=clavier.nextInt() ; 
            System.out.println("Enter le duree du cd : \n ");
            duree=clavier.nextFloat() ;
            System.out.println("Enter le nombre de plages du cd  : \n ");
            nombredeplages=clavier.nextInt() ;
            documents[k] = new cd(new multimedia(new document(auteur,titre,reference) {},duree) {},nombredeplages) ; 
              break ; 
        }
        
       
        case 4 : 
        {
            bibliotheque bib = new bibliotheque(documents,20) ; 
            bib.EnleverDocument(documents[k]); 
              break ; 
        }
        case 5 : 
        {
            bibliotheque bib = new bibliotheque(documents,20) ; 
            bib.TrouverDocument(documents[k]) ; 
              break ; 
        }
        case 6 : 
        {
            bibliotheque bib = new bibliotheque(documents,20) ; 
            bib.listerdocuments();
              break ; 
        }
        case 7 : 
        {
            break ; 
        }
     
        }
 
}
} 
} 
