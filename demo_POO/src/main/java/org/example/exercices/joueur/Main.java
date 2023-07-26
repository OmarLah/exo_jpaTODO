package org.example.exercices.joueur;

public class Main {
    public static void main(String[] args) {
        Joueur warrior = new Joueur("WarriorDu59");

        for (int compteur = 1; compteur < 21; compteur++) {
            System.out.println("Le joueur effectue la quête n° " + compteur);
            warrior.effectuerUneQuete();
        }

        String ancienPseudo = warrior.getNom();
        warrior.setNom("LeGigaBossDuJava");

        System.out.println("Le joueur "+ancienPseudo+" est renommé :"+warrior.getNom());

    }
}
