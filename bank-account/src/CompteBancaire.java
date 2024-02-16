import java.util.Scanner;

public class CompteBancaire {

    private static Scanner sc = new Scanner(System.in);

    private String proprietor;
    double sold;
    int numero;
    static int nombreComptes = 0 ;

    CompteBancaire(){
        this.proprietor="None";
        sold=0;
        numero = nombreComptes++;
    }


    CompteBancaire( String proprietor){
        this.proprietor=proprietor;
        sold=0;
        numero = nombreComptes++;
    }


    public double getSold(){
        return this.sold;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public String getProprietor() {
        return this.proprietor;
    }
    
    public static int getNombreComptes(){
        return nombreComptes;
    }
    
    public String afficher(){
        String s="nom : ";
        s+=this.proprietor+" ";
        s+="sold : "+this.sold+" ";
        s+="num : "+this.numero+" ";

        return s;
    }

    public void verser(double money){
        if (money >= 0){
            this.sold+=money;
        }
    }
    public void verser(){
        int retry = 0;
        while (retry<3) {
            System.out.println("give me the money :-D  : ");
            double money = sc.nextDouble();
            if (money>=0) {
                this.sold+=money;
                break;
            }else {
                System.out.println("le nombre egal a 0 ou negatife !!!!!");
            } 
            retry++;
        }
        
    }

    public boolean retirer(){
       
        System.out.println("give me the money :-): ");
        double money = sc.nextDouble();
        if (money>=0 && this.sold >= money) {
            this.sold-=money;
            return true;
        }else{
            System.out.println("ce argent est imposible !!!!!!");
            return false;
        }   
    }

    public boolean retirer(double money){
        if (money>=0 && this.sold >= money) {
            this.sold-=money;
            return true;
        }else{
            return false;
        }
    }
    public boolean virer(CompteBancaire cpt , double money ){
        if (money > 0 && this.sold>=money){
            this.sold-=money;
            cpt.sold+=money;
            return true;
        }else{
            System.out.println("ce argent est imposible !!!!!!");
            return false;
        }
    }

    private char menuCompte(){
        char choix;
        System.out.println("----------------(._.) Menu ( *_* )-------------------------");
        System.out.println("c:------------ Consulter");
        System.out.println("v:------------ verser");
        System.out.println("r:------------ retirer");
        System.out.println("q:------------ quiter");
        System.out.println("--------------------------------------------");
        choix = sc.next().charAt(0);
        
        return choix;
    }
    public void operation(){
        char choix ;
        while (true) {
           choix = menuCompte();
            switch (choix) {
                case 'c':
                    System.out.println(this);
                    break;
                case 'v':
                    this.verser();
                    break;
                case 'r':
                    this.retirer();
                    break;
                case 'q':
                    return;
                default:
                    System.out.println("the choise is wrong check again (¬_¬ )");
                    break;
            }
        }
        
    }


}
