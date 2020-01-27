// CMaisonUser.java 
public class CMaisonUser extends CMaison 
{
    public CMaisonUser() {
		super();

		CEclairage e1 = new CEclairage("e1",TypeAppareil.ECLAIRAGE);
		ma_liste_appareils.add(e1);
		CEclairage e2 = new CEclairage("e2",TypeAppareil.ECLAIRAGE);
		ma_liste_appareils.add(e2);
		CVoletFenetre v1 = new CVoletFenetre("v1",TypeAppareil.VOLET);
		ma_liste_appareils.add(v1);

		CInterface b1 = new CInterface("b1",TypeInterface.INTERRUPTEUR);
		ma_liste_interfaces.add(b1);
		CInterface t1 = new CInterface("t1",TypeInterface.MOBILE);
		ma_liste_interfaces.add(t1);
		CInterface zap = new CInterface("zap",TypeInterface.TELECOMMANDE);
		ma_liste_interfaces.add(zap);
         String bonjour_contenu = "\n     	for(CAppareil appareil0 : this.l_appareils)\n	" + 
		"	 if (appareil0.getNomAppareil().equals(v1)) \n    " + 
         "appareil0.appliquer(TypeActionAppareil.OUVRIR);\n    " + 
         "	for(CAppareil appareil1 : this.l_appareils)\n	" + 
		"	 if (appareil1.getNomAppareil().equals(e1)) \n    " + 
         "appareil1.appliquer(TypeActionAppareil.TAMISER);\n    " + 
         "	for(CAppareil appareil2 : this.l_appareils)\n	" + 
		"	 if (appareil2.getNomAppareil().equals(e2)) \n    " + 
         "appareil2.appliquer(TypeActionAppareil.ALLUMER); " ;
        CScenario bonjour= new CScenario("bonjour",bonjour_contenu);
        ma_liste_scenarios.add(bonjour);


		// Commandes associations
		zap.addScenarioAssocie("bonjour");
		t1.addScenarioAssocie("bonjour");
		b1.addScenarioAssocie("bonjour");

		// Commandes programmation
		monHabitat = new HabitatSpecific(ma_liste_appareils, ma_liste_ens_appareils, ma_liste_scenarios, ma_liste_interfaces, ma_liste_programmations);

	}
}