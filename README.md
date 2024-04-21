---------------------------------Rapport TP2--------------------------------------

----->Projet Product

@Data :c'est pour ajouter les getters et setters 

@NoArgsConstructor : c'est pour les constructeurs sans paramétres

@AllArgsConstructor : c'est pour les constructeurs avec paramétres

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA2/assets/131165163/ef889293-ee86-450f-bd02-c31ea75c789e)

Pour voir si la table est générée :

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA2/assets/131165163/82be1df0-a2b1-46ce-9c51-9e4a524ab430)

Pour enregistrer quelques produits dans notre table:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA2/assets/131165163/81fae07e-9a09-443a-b3fe-2865491ec345)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA2/assets/131165163/3a6a09f3-376a-4c33-a794-c9b7c1a15dc1)

Pour passer à une base de donnée SQL:

1. Ajouter la dépendance de SQL

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA2/assets/131165163/ff5b5401-d0f6-47d9-b578-f53c30070038)

2. Modifier les propieties:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA2/assets/131165163/9c0d1ba7-774f-49ec-a348-dea7490519eb)

Remarque:--------- A chaque fois on exécute on fait l'insertion dans la table 

Web Service:
1.Creer un pakage avec une classe ProductRestService:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA2/assets/131165163/58f9e7a6-4851-4c38-8568-60a430b586a9)




-------------------------------------------------------------------------Projet Hospital-------------------------------------------------------------

1. L'entité JPA Patient:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA2/assets/131165163/2473a9bb-7c2c-4769-a50b-c68fce8f9937)

2.La classe Medecin:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA2/assets/131165163/cb1551ac-0587-4a6c-8b9b-22d3b1ec670e)

3.La classe Consultation:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA2/assets/131165163/fbba3a90-52b9-402a-bdda-550f6051c59a)

4.La classe RendezVous:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA2/assets/131165163/e1bbbe67-19fc-47f0-9762-fb203c054922)

5.Enumuration StatusRDV:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA2/assets/131165163/ce9f0f78-02d2-447f-b05d-ceea5b3ff218)


---Configuration de l'unité de persistance dans le ficher application.properties :

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA2/assets/131165163/33b47ec1-ea0d-42a2-a95d-1c6d39cccffb)

--Création des interfaces JPA Repository basée sur Spring data:

1.Patient Repository:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA2/assets/131165163/c55c8830-0983-428b-9de2-a92c7cbece96)

2.Medecin Repository:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA2/assets/131165163/f669317d-7da3-496a-8451-c853d95a1719)

3.Consultation Repository :

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA2/assets/131165163/543054c8-fe36-4d77-ab53-65ca333092ee)

4.RendezVous Repository:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA2/assets/131165163/d9e04ab9-aeba-4f68-8d4d-2cda8019c7bf)


----Tester quelques opérations de gestion de patients :

1.Insérer :

--Patient:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA2/assets/131165163/dc8fb4fe-f121-4434-8025-d2970cc3cecb)

--Medecin:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA2/assets/131165163/095db55b-cffb-4c4b-ba37-9dad01a97f96)


--RendezVous:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA2/assets/131165163/2a117e7f-5cd8-4d1a-90cb-6f8e292302b8)


--Consultation:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA2/assets/131165163/13301885-b9f1-4fcb-be44-21dea5704e7c)


-----------Servise:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA2/assets/131165163/a7e3e91a-6ff2-488d-85c7-1f0460d5af0a)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA2/assets/131165163/62b1ec1a-6acb-405b-8395-30a71cd7f091)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA2/assets/131165163/e411329b-3827-4d16-a876-45e9abf4b0c5)



----------------------Web--------------

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA2/assets/131165163/804bb48b-6bbb-4b7b-b842-690e95808ae2)



-----------------------------------Exemples de Role et User-------------------------------------------

1.Création de l'entité User:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA2/assets/131165163/6514e958-1f90-4a04-9ecf-1dfdc0829f11)

2.Création de l'entité Role:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA2/assets/131165163/92965def-97f0-4be6-bb8b-c5af32c424ec)

3.Création de Repositories :

   _UserRepository:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA2/assets/131165163/88d22d9c-0d69-468b-b4ad-c7489ca1a376)

   _RoleRepository:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA2/assets/131165163/a7cc3a50-ff1a-4eee-aa88-d7044fb55707)

4.Création de Service:

_L'interface UserService:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA2/assets/131165163/3cfd5fad-3ace-47bf-8cdb-06e7012f3c1e)


_UserServiceImpl:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA2/assets/131165163/09db215d-377b-4b46-85e0-b0d72458a349)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA2/assets/131165163/3bdb2604-937d-4edf-b2b9-1388ff8a92d4)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA2/assets/131165163/ac635d3e-7fb9-49e9-a17a-af7cb258d825)


-Application properties:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA2/assets/131165163/0190a347-2e05-48a8-ba96-898d61bb333e)


-------------------MYSQL-----------------------

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANA2/assets/131165163/49367404-a03d-4391-9477-b66cb2019e9a)

