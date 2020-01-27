// Specification JFlex
import java_cup.runtime.Symbol;

/*
* @version V5
* @author Alan LE BOUDEC & William PENSEC
* @date 13/12/2019
*/
 
%%
%unicode
%cup
%line
%column

%{
	public int getYyLine(){
		return yyline+1;
	}
	public int getYyColumn(){
		return yycolumn+1;
	}
	public String getYyText(){
		return yytext();
	}
%}

action = "allumer" | "eteindre" | "fermer" | "ouvrir" | "tamiser" | "allumer_partiel" | "allumer_eco" | "ouvrir_partiel" | "fermer_partiel" 
type = "eclairage" | "volet" | "fenetre" | "chauffage" | "alarme"
interface = "interrupteur" | "mobile" | "telecommande" | "telephone" | "tablette" | "ordinateur"
autretype = "cafetiere" | "hifi" | "tv" | "portail" | "lave_linge" | "lave_vaisselle" | "video_proj" | "seche_linge"
autreapp = "autre_appareil"

etat = "etat"
actEtat = "ouvert" | "ferme" | "eteint" | "allume" | "eco" | "demi"

scenarioD = "<SCENARIO"
scenarioF = "</SCENARIO"
commandeO = "<DECLARATION_COMMANDES>"
commandeF = "</DECLARATION_COMMANDES>"
baldebprog = "<PROGRAMME_DOMUS>"
balfinprog = "</PROGRAMME_DOMUS>"
baldebapp = "<DECLARATION_APPAREILS>"
balfinapp = "</DECLARATION_APPAREILS>"
baldebinterface = "<DECLARATION_INTERFACES>"
balfininterface = "</DECLARATION_INTERFACES>"
baldebscenarii = "<DECLARATION_SCENARII>"
balfinscenarii = "</DECLARATION_SCENARII>"

chevronD = ">"
Dequal = "=="
equal = "="
parO = "("
parF = ")"
pointV = ";"
point = "."
virgule = ","
deuxP = ":"
acoO = "{"
acoF = "}"
underscore = "_"

pourtout = "pourtout"
faire = "faire "
fait = "fait"
messageD = "message"
si = "si"
alors = "alors"
sinon = "sinon"
fsi = "fsi"
def = "definir"

associer = "associer"
programmer = "programmer"
executer = "executer_scenario"

entier = [0-9]+
ident = [a-zA-Z][a-zA-Z0-9_]*
chaine = \" [^\"]* \"
guillemet = \"
commentaire = "//".*\n

erreur_chaine = [0-9]+[a-zA-Z0-9]*

%%
// Etat basique
{action}		{ return new Symbol(sym.ACTION, yytext()); }
{type} 			{ return new Symbol(sym.TYPE, yytext()); }
{interface} 		{ return new Symbol(sym.INTER, yytext()); }
{autretype} 		{ return new Symbol(sym.AUTTYPE, yytext()); }
{autreapp}		{ return new Symbol(sym.AUTAPP, yytext()); }

// Etat
{etat} 			{ return new Symbol(sym.ETAT, yytext()); }
{actEtat} 		{ return new Symbol(sym.ACTETAT, yytext()); }

// Balise globale
{scenarioD} 		{ return new Symbol(sym.SCENAD, yytext()); }
{scenarioF} 		{ return new Symbol(sym.SCENAF, yytext()); }
{commandeO} 		{ return new Symbol(sym.COMMO, yytext()); }
{commandeF} 		{ return new Symbol(sym.COMMF, yytext()); }
{baldebprog} 		{ return new Symbol(sym.DEBPROG, yytext()); }
{balfinprog} 		{ return new Symbol(sym.FINPROG, yytext()); }
{baldebapp} 		{ return new Symbol(sym.DEBAPP, yytext()); }
{balfinapp} 		{ return new Symbol(sym.FINAPP, yytext()); }
{baldebinterface} 	{ return new Symbol(sym.DEBINTER, yytext()); }
{balfininterface} 	{ return new Symbol(sym.FININTER, yytext()); }
{baldebscenarii} 	{ return new Symbol(sym.DEBSCENAR, yytext()); }
{balfinscenarii} 	{ return new Symbol(sym.FINSCENAR, yytext()); }

// Ponctuation
{chevronD} 		{ return new Symbol(sym.CHEVD, yytext()); }
{Dequal} 		{ return new Symbol(sym.DEQUAL, yytext()); }
{equal} 		{ return new Symbol(sym.EQUL, yytext()); }
{parO} 			{ return new Symbol(sym.PARO, yytext()); }
{parF} 			{ return new Symbol(sym.PARF, yytext()); }
{pointV} 		{ return new Symbol(sym.POINTV, yytext()); }
{point} 		{ return new Symbol(sym.POINT, yytext()); }
{virgule} 		{ return new Symbol(sym.VIRG, yytext()); }
{deuxP} 		{ return new Symbol(sym.DEUXP, yytext()); }
{acoO} 			{ return new Symbol(sym.ACOO, yytext()); }
{acoF} 			{ return new Symbol(sym.ACOF, yytext()); }
{underscore}		{ return new Symbol(sym.UND, yytext()); }
{guillemet}		{ return new Symbol(sym.GUIL, yytext()); }

// Boucle
{pourtout}		{ return new Symbol(sym.POURTT, yytext()); }
{faire}			{ return new Symbol(sym.FAIRE, yytext()); }
{fait}			{ return new Symbol(sym.FAIT, yytext()); }
{messageD}		{ return new Symbol(sym.MESSD, yytext()); }
{si}			{ return new Symbol(sym.SI, yytext()); }
{alors}			{ return new Symbol(sym.ALORS, yytext()); }
{sinon}			{ return new Symbol(sym.SINON, yytext()); }
{fsi}			{ return new Symbol(sym.FSI, yytext()); }
{def}			{ return new Symbol(sym.DEF, yytext()); }

// Fonction
{associer}		{ return new Symbol(sym.ASSOC, yytext()); }
{programmer}		{ return new Symbol(sym.PROG, yytext()); }
{executer}		{ return new Symbol(sym.EXEC, yytext()); }

// Entr�e basique
{entier} 		{ return new Symbol(sym.ENTIER, yytext()); }
{ident} 		{ return new Symbol(sym.IDENT, yytext()); }
{chaine} 		{ return new Symbol(sym.CHAINE, yytext()); }
{commentaire} 		{ return new Symbol(sym.COMMENTAIRE, yytext()); }

// Divers
[\t] 			{}
[ ] 			{}
[\n] 			{} 

// exemple de règle de détection d'erreurs lexicales...
{erreur_chaine} {System.out.println(" Erreur ligne "+(yyline+1)+" colonne "+(yycolumn+1)+" : "+yytext()+" => Identifiant incorrect ! "); }

.  {System.out.println(" Erreur ligne "+(yyline+1)+" colonne "+(yycolumn+1)+" : "+yytext()+" => caractère inconnu ! "); }
