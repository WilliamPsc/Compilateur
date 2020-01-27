// CMaisonUser.java 
public class CMaisonUser extends CMaison 
{
    public CMaisonUser() {
		super();

		CEclairage e1 = new CEclairage("e1",TypeAppareil.ECLAIRAGE);
		ma_liste_appareils.add(e1);
		CEclairage e2 = new CEclairage("e2",TypeAppareil.ECLAIRAGE);
		ma_liste_appareils.add(e2);
		CEclairage e3 = new CEclairage("e3",TypeAppareil.ECLAIRAGE);
		ma_liste_appareils.add(e3);
		CVoletFenetre v1 = new CVoletFenetre("v1",TypeAppareil.VOLET);
		ma_liste_appareils.add(v1);
		CVoletFenetre v2 = new CVoletFenetre("v2",TypeAppareil.VOLET);
		ma_liste_appareils.add(v2);
		CVoletFenetre v3 = new CVoletFenetre("v3",TypeAppareil.VOLET);
		ma_liste_appareils.add(v3);
		CVoletFenetre v4 = new CVoletFenetre("v4",TypeAppareil.VOLET);
		ma_liste_appareils.add(v4);
		CChauffage rad1 = new CChauffage("rad1",TypeAppareil.CHAUFFAGE);
		ma_liste_appareils.add(rad1);
		CAlarme a1 = new CAlarme("a1",TypeAppareil.ALARME);
		ma_liste_appareils.add(a1);
		CVoletFenetre fen = new CVoletFenetre("fen",TypeAppareil.FENETRE);
		ma_liste_appareils.add(fen);
		CAutreAppareil cafe = new CAutreAppareil("cafe",TypeAppareil.AUTRE_APPAREIL_CAFE);
		ma_liste_appareils.add(cafe);
		CAutreAppareil hf = new CAutreAppareil("hf",TypeAppareil.AUTRE_APPAREIL_HIFI);
		ma_liste_appareils.add(hf);

		CEnsAppareil mon_eclairage_salon = new CEnsAppareil("mon_eclairage_salon");
		mon_eclairage_salon.addAppareil(e2);
		mon_eclairage_salon.addAppareil(e3);
		ma_liste_ens_appareils.add(mon_eclairage_salon);

		CInterface b2 = new CInterface("b2",TypeInterface.INTERRUPTEUR);
		ma_liste_interfaces.add(b2);
		CInterface b1 = new CInterface("b1",TypeInterface.INTERRUPTEUR);
		ma_liste_interfaces.add(b1);
		CInterface t1 = new CInterface("t1",TypeInterface.MOBILE);
		ma_liste_interfaces.add(t1);
		CInterface c1 = new CInterface("c1",TypeInterface.TELECOMMANDE);
		ma_liste_interfaces.add(c1);
         String bonjour_contenu = "\n     for(CAppareil appareil1 : this.l_appareils)\n	" + 
	"	if (appareil1.typeAppareil.equals(TypeAppareil.VOLET))\n    " + 
         "   appareil1.appliquer(TypeActionAppareil.OUVRIR);\n    " + 
         "	for(CAppareil appareil1 : this.l_appareils)\n	" + 
		"	 if (appareil1.getNomAppareil().equals(a1)) \n    " + 
         "appareil1.appliquer(TypeActionAppareil.ETEINDRE);\n    " + 
         "	for(CAppareil appareil1 : this.l_appareils)\n	" + 
		"	 if (appareil1.getNomAppareil().equals(cafe)) \n    " + 
         "appareil1.appliquer(TypeActionAppareil.ALLUMER);\n    " + 
         " if (rad1.etatAppareil().equals(ETEINT))\n    " + 
         "   appareil2.appliquer(TypeActionAppareil.ALLUMER);\n    " + 
         "   	for(CAppareil appareil2 : this.l_appareils)\n	" + 
		"	 if (appareil2.getNomAppareil().equals(hf)) \n    " + 
         "   appareil2.appliquer(TypeActionAppareil.ALLUMER); " ;
        CScenario bonjour= new CScenario("bonjour",bonjour_contenu);
        ma_liste_scenarios.add(bonjour);

         String soiree_contenu = "\n     for(CAppareil appareil1 : this.l_appareils)\n	" + 
	"	if (appareil1.typeAppareil.equals(TypeAppareil.VOLET))\n    " + 
         "      appareil1.appliquer(TypeActionAppareil.FERMER);\n    " + 
         "   		for(CEnsAppareil ensAppareil : this.l_ensembles)\n	" + 
	"	if (ensAppareil.nomEnsAppareil.equals(\"mon_eclairage_salon\"))\n    " + 
         "      appareil2.appliquer(TypeActionAppareil.ALLUMER); " ;
        CScenario soiree= new CScenario("soiree",soiree_contenu);
        ma_liste_scenarios.add(soiree);

         String soiree_musique_contenu = "\n     this.execScenarioNum(1);\n    " + 
         "   for(CAppareil appareil1 : this.l_appareils)\n	" + 
	"	if (appareil1.typeAppareil.equals(TypeAppareil.AUTRE_APPAREIL_HIFI))\n    " + 
         "      appareil1.appliquer(TypeActionAppareil.ALLUMER); " ;
        CScenario soiree_musique= new CScenario("soiree_musique",soiree_musique_contenu);
        ma_liste_scenarios.add(soiree_musique);

         String depart_contenu = "\n     System.out.println(\"Scenario D�part\")\n    " + 
         "   for(CAppareil appareil1 : this.l_appareils)\n	" + 
	"	if (appareil1.typeAppareil.equals(TypeAppareil.VOLET))\n    " + 
         "      appareil1.appliquer(TypeActionAppareil.FERMER);\n    " + 
         "   for(CAppareil appareil2 : this.l_appareils)\n	" + 
	"	if (appareil2.typeAppareil.equals(TypeAppareil.ECLAIRAGE))\n    " + 
         "      appareil2.appliquer(TypeActionAppareil.ETEINDRE);\n    " + 
         "   \n    " + 
         "      appareil3.appliquer(TypeActionAppareil.ETEINDRE);\n    " + 
         "    if (fen.etatAppareil().equals(FERME))\n    " + 
         "      appareil4.appliquer(TypeActionAppareil.ALLUMER);System.out.println(\"Attention : la fen�tre \"+fen+\" est ouverte !\") " ;
        CScenario depart= new CScenario("depart",depart_contenu);
        ma_liste_scenarios.add(depart);

         String noel1_contenu = "\n     	for(CAppareil appareil0 : this.l_appareils)\n	" + 
		"	 if (appareil0.getNomAppareil().equals(e1)) \n    " + 
         "      appareil0.appliquer(TypeActionAppareil.ALLUMER); " ;
        CScenario noel1= new CScenario("noel1",noel1_contenu);
        ma_liste_scenarios.add(noel1);

         String noel2_contenu = "\n     	for(CAppareil appareil0 : this.l_appareils)\n	" + 
		"	 if (appareil0.getNomAppareil().equals(e2)) \n    " + 
         "      appareil0.appliquer(TypeActionAppareil.ALLUMER); " ;
        CScenario noel2= new CScenario("noel2",noel2_contenu);
        ma_liste_scenarios.add(noel2);

         String noel3_contenu = "\n     	for(CAppareil appareil0 : this.l_appareils)\n	" + 
		"	 if (appareil0.getNomAppareil().equals(e3)) \n    " + 
         "      appareil0.appliquer(TypeActionAppareil.ALLUMER); " ;
        CScenario noel3= new CScenario("noel3",noel3_contenu);
        ma_liste_scenarios.add(noel3);


		// Commandes associations
		b2.addScenarioAssocie("depart");
		t1.addScenarioAssocie("depart");
		c1.addScenarioAssocie("noel3");
		c1.addScenarioAssocie("noel2");
		c1.addScenarioAssocie("noel1");
		b1.addScenarioAssocie("bonjour");

		// Commandes programmation
		CProgrammation p1 = new CProgrammation("soiree_musique");
		CDate p1d1 = new CDate(2017, 11, 20, 19, 30);
		p1.addDate(p1d1);
		CDate p1d2 = new CDate(2017, 11, 21, 19, 30);
		p1.addDate(p1d2);
		ma_liste_programmations.add(p1);

		CProgrammation p2 = new CProgrammation("soiree");
		CDate p2d1 = new CDate(2017, -1, 1, 18, 0);
		p2.addDate(p2d1);
		ma_liste_programmations.add(p2);

		monHabitat = new HabitatSpecific(ma_liste_appareils, ma_liste_ens_appareils, ma_liste_scenarios, ma_liste_interfaces, ma_liste_programmations);

	}
}