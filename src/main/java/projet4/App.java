package projet4;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // Initialisation des variables

        int salaire = 400;
        int prime = 250;
        int quota = 10;

        // Récupéré le nombre de ventes

        System.out.println("combien de vente avez-vous conclues cette semaine ? ");
        Scanner clavier = new Scanner(System.in);
        int nbVente = clavier.nextInt();
        clavier.close();

        // test prime ou pas ?

        if (nbVente >= quota) {
            salaire = salaire + prime;
        }

        // affichage

        System.out.println("Votre salaire est de : " + salaire + " €");

        // quota respecter ou non

        if (nbVente >= quota) {
            System.out.println("Félicitation ! vous avez rempli le quota ");
        } else {
            int manque;
            manque = quota - nbVente;
            System.out.println("Il vous manques : " + manque + " nombre de vente pour atteindre votre quota ");
        }
    }
}
