package acs.ase.ro.dp.state;

public class StareDeplasareRanit implements InterfataModDeplasare {
	@Override
	public void seMisca(SuperErou erou) {
      System.out.println(erou.nume+" se deplaseaza mai incet deoarece este ranit");	
	}
}
