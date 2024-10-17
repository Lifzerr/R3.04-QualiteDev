public class TesterSingleton {
    public static void main(String args[]){
        // 2a - Déclarer les pointeurs
        SingletonChefCuisinier leCuisinier;
        SingletonChefCuisinier leChef;

        // 2b - Affecter l'adresse au cuisto
        leCuisinier = SingletonChefCuisinier.getInstance();

        // 2c - Lui donner le nom Navarro
        leCuisinier.setNom("Navarro");

        // 2d - Affecter l'adresse (non) au chef
        leChef = SingletonChefCuisinier.getInstance();

        // 2e - Afficher leChef
        System.out.println(leChef.toString()) ;
        System.out.println(leCuisinier.toString());
    }
}

/* Question 3  :

f) ca serait possible oui

g) Ca ne serait pas sain de le faire ainsi
 */