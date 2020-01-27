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
		for(CAppareil appareil1 : this.l_appareils)
		if (appareil1.typeAppareil.equals(TypeAppareil.VOLET))
appareil1.appliquer(TypeActionAppareil.OUVRIR);
	for(CAppareil appareil1 : this.l_appareils)
if (appareil1.getNomAppareil().equals("a1")) appareil1.appliquer(TypeActionAppareil.ETEINDRE);
	for(CAppareil appareil1 : this.l_appareils)
if (appareil1.getNomAppareil().equals("cafe")) appareil1.appliquer(TypeActionAppareil.ALLUMER);
	for(CAppareil appareil2 : this.l_appareils)
		if (appareil2.getNomAppareil().equals("rad1"))
		if (appareil2.getEtatAppareil().equals(TypeEtatAppareil.ETEINT))
 {appareil2.appliquer(TypeActionAppareil.ALLUMER);
}	for(CAppareil appareil2 : this.l_appareils)
if (appareil2.getNomAppareil().equals("hf")) appareil2.appliquer(TypeActionAppareil.ALLUMER);
	break ;

			case 1:
		for(CAppareil appareil1 : this.l_appareils)
		if (appareil1.typeAppareil.equals(TypeAppareil.VOLET))
appareil1.appliquer(TypeActionAppareil.FERMER);
			for(CEnsAppareil ensAppareil : this.l_ensembles)
		if (ensAppareil.nomEnsAppareil.equals("mon_eclairage_salon"))
			for(CAppareil appareil2 : ensAppareil.lAppareils)
appareil2.appliquer(TypeActionAppareil.ALLUMER);
	break ;

			case 2:
		for(CAppareil appareil1 : this.l_appareils)
		if (appareil1.typeAppareil.equals(TypeAppareil.AUTRE_APPAREIL_HIFI))
appareil1.appliquer(TypeActionAppareil.ALLUMER);
	break ;

			case 3:
System.out.println("Scenario D�part");
		for(CAppareil appareil1 : this.l_appareils)
		if (appareil1.typeAppareil.equals(TypeAppareil.VOLET))
appareil1.appliquer(TypeActionAppareil.FERMER);
			for(CAppareil appareil2 : this.l_appareils)
		if (appareil2.typeAppareil.equals(TypeAppareil.ECLAIRAGE))
appareil2.appliquer(TypeActionAppareil.ETEINDRE);
				for(CAppareil appareil3 : this.l_appareils)
		if (appareil3.estTypeAutreAppareil())
appareil3.appliquer(TypeActionAppareil.ETEINDRE);
	for(CAppareil appareil4 : this.l_appareils)
				if (appareil4.getNomAppareil().equals("fen"))
				if (appareil4.getEtatAppareil().equals(TypeEtatAppareil.FERME))
 {appareil4.appliquer(TypeActionAppareil.ALLUMER);
		 } else {System.out.println("Attention : la fen�tre "+appareil4.getNomAppareil()+" est ouverte !");
}	break ;

			case 4:
	for(CAppareil appareil0 : this.l_appareils)
if (appareil0.getNomAppareil().equals("e1")) appareil0.appliquer(TypeActionAppareil.ALLUMER);
	break ;

			case 5:
	for(CAppareil appareil0 : this.l_appareils)
if (appareil0.getNomAppareil().equals("e2")) appareil0.appliquer(TypeActionAppareil.ALLUMER);
	break ;

			case 6:
	for(CAppareil appareil0 : this.l_appareils)
if (appareil0.getNomAppareil().equals("e3")) appareil0.appliquer(TypeActionAppareil.ALLUMER);
	break ;

		 default :

		}
	}
}