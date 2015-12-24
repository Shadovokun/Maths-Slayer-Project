class FonctionsCalculs extends Program {

    void algorithm() {

	println("Choisissez un nombre :");
	println("1- Addition");
	println("2- Soustraction");
	println("3- Multiplication");
	println("4- Division");
	int choix = -1;
	while ((choix <= 0) || (choix >= 5)) {
	choix = readInt();
	}
	
	if (choix==1) {
	    addition();
	    }
	if (choix==2) {
	    soustraction();
	} 
	if (choix==3) {
	    multiplication();
	} 
	if (choix==4) {
	    division();
	    }
    }

    void addition() {
	int membre1 = 0;
	int membre2 = 0;
	int resultat = 0;
	int reponse = 0;

	membre1 = (int) (random()*20);
	membre2 = (int) (random()*20);
	resultat = membre1 + membre2;

	println(membre1 + " + " + membre2 + " = ?");
	reponse= readInt();

	if (reponse==resultat) {
	    println("Bien joué !");
	} else {
	    println("Mauvaise réponse !");
	}
    }

    void soustraction() {
	int membre1 = 0;
	int membre2 = 0;
	int resultat = 0;
	int reponse = 0;

	membre1 = (int) (random()*20);
	membre2 = (int) (random()*20);

	if (membre1 > membre2) {	
	resultat = membre1 - membre2;
	println(membre1 + " - " + membre2 + " = ?");
	reponse= readInt();
	}

	if (membre1 <  membre2) {	
	resultat = membre2 - membre1;
	println(membre2 + " - " + membre1 + " = ?");
	reponse= readInt();
	}

	if (reponse==resultat) {
	    println("Bien joué !");
	} else {
	    println("Mauvaise réponse !");
	}
    }

    void multiplication() {
    	int membre1 = 0;
	int membre2 = 0;
	int resultat = 0;
	int reponse = 0;

	membre1 = (int) (random()*10);
	membre2 = (int) (random()*10);
	resultat = membre1 * membre2;

	println(membre1 + " x " + membre2 + " = ?");
	reponse= readInt();

	if (reponse==resultat) {
	    println("Bien joué !");
	} else {
	    println("Mauvaise réponse !");
	}
    }

    void division() {
	int membre1 = 0;
	int membre2 = 0;
	int resultat1 = 0;
	int resultat2 = 0;
	int quotient = 0;
	int reste = 0;

	membre1 = (int) (random()*20);
	membre2 = (int) (random()*20);

	println("Attention, il ne faut donner que le quotient, pas le reste !");

	if (membre1 > membre2) {	
	resultat1 = membre1 / membre2;
	resultat2 = membre1 % membre2;
	println(membre1 + " / " + membre2 + " = ?");
	print("Quotient = ");
	quotient= readInt();
	print("Reste = ");
	reste= readInt();
	}

	if (membre1 <  membre2) {	
	resultat1 = membre2 / membre1;
	resultat2 = membre2 % membre1;
	println(membre2 + " / " + membre1 + " = ?");
	print("Quotient = ");
	quotient= readInt();
	print("Reste = ");
	reste= readInt();
	}

	if (quotient==resultat1 && reste==resultat2) {
	    println("Bien joué !");
	} else {
	    println("Mauvaise réponse !");
	}
    }
    
}
