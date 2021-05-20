package subiect1.compisite;

public interface InterfataActiuniEmail {

  public void trimiteEmail(String subject, InterfataActiuniEmail destinatie);
  public void creareEmailDraft(String subject, int prioritate);
  public void trimiteEvenimit(String subject, String data, InterfataActiuniEmail destinatie);

}
