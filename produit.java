import java.util.Date;

public class produit
{
    public int identifiant;
    public String libelle;
    public String marque;
    public double prix;

    public Date date;


    public produit(){};
    public produit(int iden, String lib, String mar, double pri,Date d)
    {
        this.identifiant=iden;
        this.libelle=lib;
        this.marque=mar;
        this.prix=pri;
        this.date=d;
    }

    public produit(int iden, String lib, String mar)
    {
        this.identifiant=iden;
        this.libelle=lib;
        this.marque=mar;
    }

    public void affiche_produit4()
    {
        System.out.println("identifiant:"+this.identifiant+" "+"libelle:"+this.libelle+" "+"marque:"+this.marque+" "+"prix:"+this.prix);
    }

    public void affiche_produit3()
    {
        System.out.println("identifiant:"+this.identifiant+" "+"libelle:"+this.libelle+" "+"marque"+this.marque);
    }

    public String toString()
    {
        return "identifiant:"+this.identifiant+" "+"libelle:"+this.libelle+" "+"marque"+this.marque+" "+"prix:"+this.prix;
    }

    public void affiche_produit5()
    {
        System.out.println("identifiant:"+this.identifiant+" "+"libelle:"+this.libelle+" "+"marque:"+this.marque+" "+"prix:"+this.prix+" "+"date"+this.date);
    }
}
