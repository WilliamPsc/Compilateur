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
	for(CAppareil appareil1 : this.l_appareils)
if (appareil1.getNomAppareil().equals("e1")) appareil1.appliquer(TypeActionAppareil.TAMISER);
	for(CAppareil appareil2 : this.l_appareils)
if (appareil2.getNomAppareil().equals("e2")) appareil2.appliquer(TypeActionAppareil.ALLUMER);
	break ;

		 default :

		}
	}
}