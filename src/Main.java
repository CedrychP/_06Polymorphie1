// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
  public static void main(String[] args) {
    PolyPerson pp0 = new PolyPerson();
    PolyPerson pp1 = new PolyVater();
    PolyPerson pp2 = new PolyKind();
    PolyPerson pp3 = new PolyEnkel();
    pp0.sagMeinung();
    pp1.sagMeinung();
    pp2.sagMeinung();
    pp3.sagMeinung();
    pp0.tuWas(pp1);

    System.out.println("Ende der Vorstellung, jetzt experimentieren wir");
    pp0 = pp2;
    pp0.sagMeinung();



  }
}