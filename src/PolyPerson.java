public class PolyPerson {
  public PolyPerson(){

  }
  public void sagMeinung(){
    System.out.println("Eine Person ist neutral");
  }
  public void tuWas(PolyPerson p){
    p.sagMeinung();
    if (p instanceof PolyKind){
      System.out.println("Das Kind is hier");
    }
    else{
      System.out.println("Irrelevant");
    }
  }
}
