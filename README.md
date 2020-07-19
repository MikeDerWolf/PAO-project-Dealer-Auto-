# ProiectPAO
Proiect PAO - Dealer Auto  
Etapa 1:  
Clase: Autovehicul, Motocicleta, Masina, Autobuz, Camion, Client, Vanzare, Servicii, Main  
Actiuni:  
-adaugare autovehicul  
-stergere autovehicul  
-afisare autovehicule  
-afisare autovehicule vandute  
-adaugare client  
-stergere client  
-afisare clienti  
-inregistrare vanzare  
-afisare vanzari  
-afisare autovehicule achizitionate de catre client  
-afisare stoc autovehicule dupa pret(crescator)  

Etapa 2:  
Adaugare fisier audit gestionat de catre clasa Audit si fisiere CSV pentru persistenta datelor. Operatiile pentru scriere si citire se realizeaza cu ajutorul claselor singleton CitireCSV si scriere CSV.  
Fisierele text counterAutovehicule, counterClienti si counterVanzari sunt folosite pentru a pastra unicitatea ID-urilor inregistrarilor si sunt gestionate cu ajutorul functiilor readCounter si writeCounter din clasele asociate.  
Fisierul clienti.csv are numar variabil de coloane deoarece fiecare client poate avea un numar variabil de autovehicule cumparate.  
