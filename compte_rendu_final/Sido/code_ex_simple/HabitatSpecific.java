// HabitatSpecific.java 

import java.util.ArrayList;

public class HabitatSpecific extends Habitat {

	public HabitatSpecific(ArrayList<CAppareil> lapp, ArrayList<CEnsAppareil> lens, ArrayList<CScenario> lscen, ArrayList<CInterface> lint, ArrayList<CProgrammation> lprog){
		super(lapp,lens,lscen,lint,lprog);
	}
	public void execScenarioNum(int num){
		System.out.println( "Execution du scenario "+this.l_scenarios.get(num).getNomScenario()+"...");

		switch(num) {
			case 0:
	for(CAppareil appareil0 : this.l_appareils)
if (appareil0.getNomAppareil().equals("v1")) appareil0.appliquer(TypeActionAppareil.OUVRIR);
	for(CAppareil appareil0 : this.l_appareils)
if (appareil0.getNomAppareil().equals("v2")) appareil0.appliquer(TypeActionAppareil.OUVRIR);
	for(CAppareil appareil0 : this.l_appareils)
if (appareil0.getNomAppareil().equals("e1")) appareil0.appliquer(TypeActionAppareil.ETEINDRE);
	for(CAppareil appareil0 : this.l_appareils)
if (appareil0.getNomAppareil().equals("hf")) appareil0.appliquer(TypeActionAppareil.ALLUMER);
	for(CAppareil appareil0 : this.l_appareils)
if (appareil0.getNomAppareil().equals("cafe")) appareil0.appliquer(TypeActionAppareil.ALLUMER);
	break ;

			case 1:
		for(CAppareil appareil1 : this.l_appareils)
		if (appareil1.typeAppareil.equals(TypeAppareil.VOLET))
appareil1.appliquer(TypeActionAppareil.OUVRIR);
	for(CAppareil appareil1 : this.l_appareils)
if (appareil1.getNomAppareil().equals("e1")) appareil1.appliquer(TypeActionAppareil.ETEINDRE);
			for(CAppareil appareil2 : this.l_appareils)
		if (appareil2.estTypeAutreAppareil())
appareil2.appliquer(TypeActionAppareil.ALLUMER);
	break ;

			case 2:
		for(CEnsAppareil ensAppareil : this.l_ensembles)
		if (ensAppareil.nomEnsAppareil.equals("mon_eclairage_salon"))
			for(CAppareil appareil1 : ensAppareil.lAppareils)
appareil1.appliquer(TypeActionAppareil.ALLUMER);
	break ;

			case 3:
System.out.println("Extinction de la machine a cafe.");
		for(CAppareil appareil1 : this.l_appareils)
		if (appareil1.typeAppareil.equals(TypeAppareil.AUTRE_APPAREIL_CAFE))
appareil1.appliquer(TypeActionAppareil.ETEINDRE);
	break ;

			case 4:
	for(CAppareil appareil1 : this.l_appareils)
	if (appareil1.getNomAppareil().equals("hf"))
	if (appareil1.getEtatAppareil().equals(TypeEtatAppareil.ALLUME))
 {System.out.println("La hifi est deja allumee !");
		 } else {appareil1.appliquer(TypeActionAppareil.ALLUMER);
}	break ;

			case 5:
		for(CAppareil appareil1 : this.l_appareils)
		if (appareil1.typeAppareil.equals(TypeAppareil.ECLAIRAGE))
System.out.println("Etat de "+appareil1.getNomAppareil()+" = "+appareil1.getEtatAppareil());
	for(CAppareil appareil2 : this.l_appareils)
		if (appareil2.getNomAppareil().equals("hf"))
		if (appareil2.getEtatAppareil().equals(TypeEtatAppareil.ALLUME))
 {System.out.println("La hifi est allumee.");
}	break ;

		 default :

		}
	}
}