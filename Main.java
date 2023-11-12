import java.util.Date;

public class Main
{
    public static void main(String[] args)
    {
       Date d=new Date();
       produit p1=new produit();
       produit Pa=new produit(1021,"lait","delice");
       produit Pb=new produit(2510,"yaourt","vitalait");
       produit Pc=new produit(3250,"tomate","sicam",1.200,d);

       p1.affiche_produit4();
       Pa.affiche_produit3();
       Pb.affiche_produit3();
       Pc.affiche_produit4();

       Pa.prix=0.700;
       Pa.affiche_produit4();
       Pb.prix=0.500;

       p1.identifiant=1500;
       p1.libelle="soda";
       p1.marque="shweppess";
       p1.prix=2.000;

       p1.affiche_produit4();
       Pa.affiche_produit4();
       Pb.affiche_produit4();
       Pc.affiche_produit4();

       System.out.println(p1);
       System.out.println(Pa);
       System.out.println(Pb);
       System.out.println(Pc);





    }

}