package acs.ase.ro.dp.chain;

public abstract class ModulProcesareMesaj {

	ModulProcesareMesaj next=null;
	public abstract void procesareMesaj(MesajChat mesaj);
	
	public void setNext(ModulProcesareMesaj next) {
		this.next = next;
	}
}