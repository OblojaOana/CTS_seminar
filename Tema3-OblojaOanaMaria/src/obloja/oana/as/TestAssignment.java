package obloja.oana.as;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import obloja.oana.as.adapter.EuPlatescPlatforma;
import obloja.oana.as.adapter.IEuPlatescPlatforma;
import obloja.oana.as.adapter.IPlataPrinAplicatie;
import obloja.oana.as.adapter.PlataAdapter;
import obloja.oana.as.builder.BuilderLucruriNecesare;
import obloja.oana.as.builder.Calatorie;
import obloja.oana.as.builder.UtilizatorLucruriNecesare;
import obloja.oana.as.decorator.CalatorieCompleta;
import obloja.oana.as.decorator.DecoratorPoze;
import obloja.oana.as.factory.CalatorieDeAfaceri;
import obloja.oana.as.factory.FactoryCalatorie;
import obloja.oana.as.factory.TipCalatorie;
import obloja.oana.as.flyweight.Locatie;
import obloja.oana.as.flyweight.LocatieFactory;
import obloja.oana.as.prototype.Poza;
import obloja.oana.as.proxy.IImagine;
import obloja.oana.as.proxy.Imagine;
import obloja.oana.as.proxy.RezolutieInaltaImagine;
import obloja.oana.as.singleton.ConexiuneAPI;

public abstract class TestAssignment {

	public static void main(String[] args) throws ParseException, CloneNotSupportedException {
		
		//TEST SINGLETON
		System.out.println("\nTest singleton");

		ConexiuneAPI conexiune1 = ConexiuneAPI.getConexiune();
		ConexiuneAPI conexiune2 = ConexiuneAPI.getConexiune();
		
		if(conexiune1 == conexiune2) {
			System.out.println("Cele 2 referinte sunt identice");
		}
		else {
			System.out.println("Cele 2 referinte sunt diferite");
		}
	
		//TEST FACTORY
		System.out.println("Test factory");
		ArrayList<Calatorie> calatorii=new ArrayList<>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date dataDeInceput = sdf.parse("2021-05-06");
		Date dataDeSfarsit = sdf.parse("2021-05-11");
		Calatorie calatorieCuFamilia=FactoryCalatorie.getCalatorie(TipCalatorie.FAMILIE,"Calatorie", "Italia", "Roma", dataDeInceput, dataDeSfarsit );
		Calatorie calatorieCuPrietenii=FactoryCalatorie.getCalatorie(TipCalatorie.PRIETENI,"Calatorie", "Romania", "Bucuresti", dataDeInceput, dataDeSfarsit );
		Calatorie calatorieDeAfacer=FactoryCalatorie.getCalatorie(TipCalatorie.AFACERI,"Calatorie", "Spania", "Madrid", dataDeInceput, dataDeSfarsit );
		
		calatorii.add(calatorieCuFamilia);
		calatorii.add(calatorieCuPrietenii);
		calatorii.add(calatorieDeAfacer);
		
		for (Calatorie calatorie:calatorii) {
			calatorie.afisareCalatorie();
		}
		
		//TEST BUILDER
		System.out.println("\nTest builder");
		UtilizatorLucruriNecesare utilizatorLucruriNecesare=new BuilderLucruriNecesare().setAreMedicamente(true).setAreBuletin(true).build();
		System.out.println(utilizatorLucruriNecesare.toString());
		
		//TEST DECORATOR
		System.out.println("\nTest decorator");
		Calatorie calatorieCompleta=new CalatorieCompleta("Calatorie", "Italia", "Roma", dataDeInceput, dataDeSfarsit);
		calatorieCompleta=new DecoratorPoze("Calatorie", "Italia", "Roma", dataDeInceput, dataDeSfarsit, 5);
		calatorieCompleta.statusCalatorie(dataDeInceput);
		
		//TEST PROTOTYPE
		System.out.println("\nTest prototype");
		Poza poza = new Poza("C:/poza", 100, 100);
		Poza poza2=(Poza) poza.clone();

		//TEST PROXY
		System.out.println("\nTest proxy");
		IImagine imagine1=new RezolutieInaltaImagine("imagini/imagine1.jpg");
		IImagine imagine2=new RezolutieInaltaImagine("imagini/imagine2.jpg");
		IImagine imagine3=new RezolutieInaltaImagine("imagini/imagine3.jpg");
		//apel doar pentru o singura imagine
		imagine2.arataImaginea();
		
		//TEST ADAPTER
		System.out.println("\nTest adapter");
		IEuPlatescPlatforma euPlatescPlatforma=new EuPlatescPlatforma();
		euPlatescPlatforma.setNrCardCredit("12234555");
		euPlatescPlatforma.setNumeUtilizator("Popescu Ion");
		euPlatescPlatforma.setDataExpirareCard("07/24");
		euPlatescPlatforma.setNrCVVCard("211");
		euPlatescPlatforma.setSumaDePlata(2347.3);
		
		IPlataPrinAplicatie plataPrinAplicatie=new PlataAdapter(euPlatescPlatforma);
	    System.out.println(plataPrinAplicatie.getNrCardCredit());
		 
		//TEST FLYWEIGHT
		System.out.println("\nTest flyweight");
		Locatie locatie1=LocatieFactory.getLocatieDupaTipulCalatoriei(TipCalatorie.FAMILIE);
		Locatie locatie2=LocatieFactory.getLocatieDupaTipulCalatoriei(TipCalatorie.FAMILIE);
		
		locatie1.setTara("Romania");
		locatie1.setJudet("Olt");
		locatie1.setOras("Slatina");
		System.out.println(locatie1);
		
		locatie2.setTara("Romania");
		locatie2.setJudet("Dolj");
		locatie2.setOras("Craiova");
		System.out.println(locatie1);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
	
		
	}

}
