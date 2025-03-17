import java.util.Scanner;

public class Calculatrice {

    // Attributs pour les nombres et le résultat
    private double nombre1;
    private double nombre2;
    private double resultat;

    // Constructeur pour initialiser les nombres
    public Calculatrice(double nombre1, double nombre2) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
    }

    // Méthode pour l'addition
    public void addition() {
        this.resultat = this.nombre1 + this.nombre2;
    }

    // Méthode pour la soustraction
    public void soustraction() {
        this.resultat = this.nombre1 - this.nombre2;
    }

    // Méthode pour la multiplication
    public void multiplication() {
        this.resultat = this.nombre1 * this.nombre2;
    }

    // Méthode pour la division
    public void division() {
        if (this.nombre2 == 0) {
            throw new ArithmeticException("Division par zéro impossible");
        }
        this.resultat = this.nombre1 / this.nombre2;
    }

    // Méthode pour afficher le résultat
    public void afficherResultat() {
        System.out.println("Le résultat est : " + this.resultat);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Demander à l'utilisateur d'entrer deux nombres
        System.out.print("Entrez le premier nombre : ");
        double num1 = sc.nextDouble();

        System.out.print("Entrez le deuxième nombre : ");
        double num2 = sc.nextDouble();

        // Créer une instance de la calculatrice avec les deux nombres
        Calculatrice calc = new Calculatrice(num1, num2);

        // Demander à l'utilisateur quelle opération effectuer
        System.out.println("Choisissez une opération :");
        System.out.println("1. Addition");
        System.out.println("2. Soustraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int choix = sc.nextInt();

        // Effectuer l'opération en fonction du choix
        try {
            switch (choix) {
                case 1:
                    calc.addition();
                    break;
                case 2:
                    calc.soustraction();
                    break;
                case 3:
                    calc.multiplication();
                    break;
                case 4:
                    calc.division();
                    break;
                default:
                    System.out.println("Choix invalide");
                    return;
            }
            // Afficher le résultat
            calc.afficherResultat();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
