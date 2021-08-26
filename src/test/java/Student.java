public class Student {

    public String imię;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndeksu;

    public void przedstawSię() {
        System.out.println("Nazywam się " + imię + nazwisko + "Mój numer indeksu to : " + numerIndeksu);
    }

    public void zalogujSię() {
        System.out.println("Loguje się za pomocą : " + nick + email);
    }
}
