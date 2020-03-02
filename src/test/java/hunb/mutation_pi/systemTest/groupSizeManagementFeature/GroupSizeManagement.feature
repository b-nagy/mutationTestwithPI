# language: hu

Jellemző: Csoport létszám kezelése

	Forgatókönyv: Csoporthoz hozzáadás
		Adott egy üres csoport
		Amennyiben hozzáadok egy főt
		Akkor a csoport létszáma: 1
	
	Forgatókönyv: Csoportból eltávolítás
		Adott egy három fős csoport
		Amennyiben egy főt elveszek belőle
		Akkor a csoport létszáma: 2

	Forgatókönyv: Csoport kiürítése
		Adott egy három fős csoport
		Amennyiben a csoportot kiürítem
		Akkor a csoport létszáma: 0
		
	Forgatókönyv: Csoport maximum létszáma öt fő
		Adott egy üres csoport
		Amennyiben hozzáadok öt főt
		Akkor a hatodik fő hozzáadásánál hibaüzenetet kapok