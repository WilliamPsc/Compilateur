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
		CAutreAppareil hf = new CAutreAppareil("hf",TypeAppareil.AUTRE_APPAREIL_HIFI);
		ma_liste_appareils.add(hf);
		CAutreAppareil cafe = new CAutreAppareil("cafe",TypeAppareil.AUTRE_APPAREIL_CAFE);
		ma_liste_appareils.add(cafe);
		CVoletFenetre v2 = new CVoletFenetre("v2",TypeAppareil.VOLET);
		ma_liste_appareils.add(v2);

		CEnsAppareil mon_eclairage_salon = new CEnsAppareil("mon_eclairage_salon");
		mon_eclairage_salon.addAppareil(e1);
		mon_eclairage_salon.addAppareil(e2);
		ma_liste_ens_appareils.add(mon_eclairage_salon);

		CInterface b2 = new CInterface("b2",TypeInterface.INTERRUPTEUR);
		ma_liste_interfaces.add(b2);
		CInterface b3 = new CInterface("b3",TypeInterface.INTERRUPTEUR);
		ma_liste_interfaces.add(b3);
		CInterface b1 = new CInterface("b1",TypeInterface.INTERRUPTEUR);
		ma_liste_interfaces.add(b1);
		CInterface t1 = new CInterface("t1",TypeInterface.MOBILE);
		ma_liste_interfaces.add(t1);
		CInterface zap = new CInterface("zap",TypeInterface.TELECOMMANDE);
		ma_liste_interfaces.add(zap);
		CInterface b4 = new CInterface("b4",TypeInterface.INTERRUPTEUR);
		ma_liste_interfaces.add(b4);
         String bonjour_contenu = "\n     	for(CAppareil appareil0 : this.l_appareils)\n	" + 
		"	 if (appareil0.getNomAppareil().equals(v1)) \n    " + 
         "appareil0.appliquer(TypeActionAppareil.OUVRIR);\n    " + 
         "	for(CAppareil appareil0 : this.l_appareils)\n	" + 
		"	 if (appareil0.getNomAppareil().equals(v2)) \n    " + 
         "appareil0.appliquer(TypeActionAppareil.OUVRIR);\n    " + 
         "	for(CAppareil appareil0 : this.l_appareils)\n	" + 
		"	 if (appareil0.getNomAppareil().equals(e1)) \n    " + 
         "appareil0.appliquer(TypeActionAppareil.ETEINDRE);\n    " + 
         "	for(CAppareil appareil0 : this.l_appareils)\n	" + 
		"	 if (appareil0.getNomAppareil().equals(hf)) \n    " + 
         "appareil0.appliquer(TypeActionAppareil.ALLUMER);\n    " + 
         "	for(CAppareil appareil0 : this.l_appareils)\n	" + 
		"	 if (appareil0.getNomAppareil().equals(cafe)) \n    " + 
         "appareil0.appliquer(TypeActionAppareil.ALLUMER); " ;
        CScenario bonjour= new CScenario("bonjour",bonjour_contenu);
        ma_liste_scenarios.add(bonjour);

         String bonjour2_contenu = "\n     for(CAppareil appareil1 : this.l_appareils)\n	" + 
	"	if (appareil1.typeAppareil.equals(TypeAppareil.VOLET))\n    " + 
         "   appareil1.appliquer(TypeActionAppareil.OUVRIR);\n    " + 
         "	for(CAppareil appareil1 : this.l_appareils)\n	" + 
		"	 if (appareil1.getNomAppareil().equals(e1)) \n    " + 
         "appareil1.appliquer(TypeActionAppareil.ETEINDRE);\n    " + 
         "\n    " + 
         "   appareil2.appliquer(TypeActionAppareil.ALLUMER); " ;
        CScenario bonjour2= new CScenario("bonjour2",bonjour2_contenu);
        ma_liste_scenarios.add(bonjour2);

         String soiree_contenu = "\n     		for(CEnsAppareil ensAppareil : this.l_ensembles)\n	" + 
	"	if (ensAppareil.nomEnsAppareil.equals(\"mon_eclairage_salon\"))\n    " + 
         "   appareil1.appliquer(TypeActionAppareil.ALLUMER); " ;
        CScenario soiree= new CScenario("soiree",soiree_contenu);
        ma_liste_scenarios.add(soiree);

         String fincafe_contenu = "\n     System.out.println(\"Extinction de la machine a cafe.\")\n    " + 
         "for(CAppareil appareil1 : this.l_appareils)\n	" + 
	"	if (appareil1.typeAppareil.equals(TypeAppareil.AUTRE_APPAREIL_CAFE))\n    " + 
         "   appareil1.appliquer(TypeActionAppareil.ETEINDRE); " ;
        CScenario fincafe= new CScenario("fincafe",fincafe_contenu);
        ma_liste_scenarios.add(fincafe);

         String soiree_musique_contenu = "\n     this.execScenarioNum(2);\n    " + 
         " if (hf.etatAppareil().equals(ALLUME))\n    " + 
         "   System.out.println(\"La hifi est deja allumee !\")appareil1.appliquer(TypeActionAppareil.ALLUMER); " ;
        CScenario soiree_musique= new CScenario("soiree_musique",soiree_musique_contenu);
        ma_liste_scenarios.add(soiree_musique);

         String verif_contenu = "\n     for(CAppareil appareil1 : this.l_appareils)\n	" + 
	"	if (appareil1.typeAppareil.equals(TypeAppareil.ECLAIRAGE))\n    " + 
         "      System.out.println(\"Etat de \"+e+\" = \"+e.etatAppareil())\n    " + 
         "    if (hf.etatAppareil().equals(ALLUME))\n    " + 
         "      System.out.println(\"La hifi est allumee.\") " ;
        CScenario verif= new CScenario("verif",verif_contenu);
        ma_liste_scenarios.add(verif);


		// Commandes associations
		b2.addScenarioAssocie("bonjour2");
		b3.addScenarioAssocie("verif");
		b3.addScenarioAssocie("fincafe");
		b3.addScenarioAssocie("soiree");
		b4.addScenarioAssocie("soiree_musique");
		zap.addScenarioAssocie("bonjour");
		t1.addScenarioAssocie("bonjour");
		b1.addScenarioAssocie("bonjour");

		// Commandes programmation
		CProgrammation p1 = new CProgrammation("soiree_musique");
		CDate p1d1 = new CDate(2017, 12, 31, 19, 0);
		p1.addDate(p1d1);
		CDate p1d2 = new CDate(2017, 7, 14, 19, 30);
		p1.addDate(p1d2);
		CDate p1d3 = new CDate(2017, 12, 24, 18, 30);
		p1.addDate(p1d3);
		ma_liste_programmations.add(p1);

		CProgrammation p2 = new CProgrammation("soiree");
		CDate p2d1 = new CDate(2017, -1, 1, 18, 0);
		p2.addDate(p2d1);
		ma_liste_programmations.add(p2);

		monHabitat = new HabitatSpecific(ma_liste_appareils, ma_liste_ens_appareils, ma_liste_scenarios, ma_liste_interfaces, ma_liste_programmations);

	}
}