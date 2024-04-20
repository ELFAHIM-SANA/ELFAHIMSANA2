---------------------------------Rapport TP2--------------------------------------

----->Projet Product

@Data :c'est pour ajouter les getters et setters 

@NoArgsConstructor : c'est pour les constructeurs sans paramétres

@AllArgsConstructor : c'est pour les constructeurs avec paramétres

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/3bc5b09e-217d-490f-ab4c-2ef667810e7e)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/73b8e2f9-d9c4-4480-b897-287a46cbc069)

Et pour ca soit une entité JPA; on utilise les annotations suivantes:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/a5851eb2-c9ac-422c-b1f8-6b1b318561ab)

Pour voir si la table est générée :

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/7e003721-0545-4d83-9169-a38d11013aac)

Lorsqu'on démarre l'application ici:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/c71ddf41-12a6-4b4c-b8f0-8c407d61aa79)

Notre table se génére automatiquement:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/fa5562b2-95e0-45ec-9506-2ddd454d41fe)

Pour enregistrer quelques produits dans notre table:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/919f4482-eeb5-4b9b-bed2-f3cb7d4aeaed)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/5cd354b4-7c4a-41ba-ba78-53674f5e367b)

Pour afficher les produits:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/027c895d-1d91-4e7d-a058-2d521795a7f3)

On peut aussi afficher un element avec son ID:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/90f7ab15-eb65-44b8-8ce2-820f4a1f9e30)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/6ed245b8-8aab-48c6-8fbd-b98ba3095969)

Pour passer à une base de donnée SQL:

1. Ajouter la dépendance de SQL

   ![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/2704abb5-db30-4e83-b239-5af9975cfc6a)

2. Modifier les propieties:

   ![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/dcfec55f-d08f-4455-9579-1a7781355867)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/84ddd3a7-f154-4618-9787-3c2b73fe9992)

Remarque:--------- A chaque fois on exécute on fait l'insertion dans la table et ca bien remarquable dans la photo ci dessus.

Ajouter autres méthodes à la classe ProductRepository:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/49b70b00-d835-4cae-9d39-0fb7e74be987)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/358a55ef-d3b1-405c-b680-1a4c6425ff98)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/0f9506d5-afae-4a67-8743-9f0d12a84abb)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/b9b838e9-53ad-4c47-979b-46e0ebfefd95)

Web Service:
1.Creer un pakage avec une classe ProductRestService:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/25e586ba-135d-4fcd-8746-4ea35d436aaa)

Consulter produits by id:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/747246f8-d430-46c2-881b-2e9a582e5240)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/51cc5e9d-7173-4b0c-9727-aa3b6f0166b7)



-------------------------------------------------------------------------Projet Hospital-------------------------------------------------------------

1. L'entité JPA Patient:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/9d8ad556-995e-4c84-b306-6130f7bfbd0f)

2.La classe Medecin:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/6930767e-32e1-43c0-8b3a-1290833bf910)

3.La classe Consultation:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/8974ee1b-7854-48c0-8cc2-10c926feadd7)

4.La classe RendezVous:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/04e2d1bf-4903-43fd-9bc7-857d1e92590d)

5.Enumuration StatusRDV:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/82633b1c-bfdb-442a-bf1d-2ba1a43d9092)


---Configuration de l'unité de persistance dans le ficher application.properties :

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/347b6a46-0da9-4289-9a95-25ea25d9b548)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/1b8b630a-5f13-491b-80e2-c9fb8d63404c)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/e4779d21-5e65-4d7b-9fde-b74f51bdd2fd)

--Création des interfaces JPA Repository basée sur Spring data:

1.Patient Repository:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/ba86cebd-e51f-42f7-9342-1f71f690b336)

2.Medecin Repository:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/f2687f1a-4230-4134-9e95-ba96375245b9)

3.Consultation Repository :

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/29ce31b4-7de8-4765-af96-1061485f359f)

4.RendezVous Repository:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/303f2471-5a0d-4ccc-9fc4-61b47f5bef15)


----Tester quelques opérations de gestion de patients :

1.Insérer et Consulter:

--Patient:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/32c8dc55-9f05-4e95-be95-658e828cd5ca)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/0ea9de54-6ad2-47a8-9f3c-c41cd84e333a)

--Medecin:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/f36b6ca6-da84-4955-bb60-9a0937f0fa6f)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/19fa0813-f44a-49af-a97c-a00f49fdd9ad)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/f2c91b49-9fff-45b4-8070-95d560fa17d4)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/ff0fac34-2502-41a6-80d5-45978f7cc4e8)

--RendezVous:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/58115ed2-cb12-4f13-9673-0b7dfa84ee50)


--Consultation:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/e6451bb5-965b-4f7f-9a54-95951d7fa829)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/1bfd083b-6222-408a-a6bd-a33ad1c27573)


-----------Servise:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/0820f302-5b0e-4247-816e-d6c11befe1c6)

Les modifications au niveau de l'application aprés la création de Service:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/fd21ff29-50ac-4ec5-ab3d-56e197fe17f9)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/ac059ba4-0e4a-47a0-9469-b5c36b4326c6)


---------------Remarque---------------------------------------------------------------------------------------------------
.si le ID de RendezVous n'est pas un chiffre, est un String par exemple ; alors on aurra les modifications suivantes:
.
.![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/b14e622f-329a-4d3a-93a7-1b48508aa711)
.
.![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/c11c6544-3dfb-40fe-9879-8d69b95ebd9e)
.
.![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/5c2c67b7-3431-4fa2-8e67-fc3b4391dc5c)
.
.![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/b9fd3090-b229-4030-9db2-9047ea4aef8d)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/0db69439-f56f-4944-ad13-02b78a80b9de)


----------------------------------------

----------------------Web--------------

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/6a68d3d1-869f-49b7-b7a6-09378095c638)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/20773476-5873-4025-802d-3c36c3766d97)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/21d7c76a-e198-4466-906f-828b7b35e622)


-----------------------------------Exemples de Role et User-------------------------------------------

1.Création de l'entité User:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/f4e0ee50-3600-47f8-8f15-8dd47d7c601f)

2.Création de l'entité Role:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/b294d18b-0357-4cff-b7fe-189457b11216)

3.Création de Repositories :

   _UserRepository:

   ![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/dae45ef4-5fa5-46ec-8ace-e405f4cc69f0)

   _RoleRepository:

   ![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/ae6db2fe-239a-4373-859b-4cdd4fc2dc92)

4.Création de Service:

_L'interface UserService:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/b762c2ec-68d5-46e7-a9ed-e1896c5c2d21)


_UserServiceImpl:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/70e0c75b-7fa7-4726-a7c9-cb1c907503e6)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/69636457-3595-493f-bf13-525d853430f6)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/addf4d63-70e1-46a8-bd12-d17cc81cfbdb)


-Test:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/89382659-3eff-47bb-9550-ec0cc3f61d6e)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/8e5ebbc5-bae8-4aba-8a2c-e78afd4cca64)

-Application properties:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/1352aff3-049b-4e4b-b47c-5e2fcd874e3d)

--La base de données:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/5c09d9e0-6b53-43a6-af87-7e44755cd693)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/037fb5e1-f8f8-4aeb-b0c3-7562e5e20248)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/b266da06-8a10-47b6-94f5-51e4c9e18326)

-Test:

Pour faire le test on acrér une méthode :

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/ce3bc8b7-84c1-40e9-acc0-b545bb6ca328)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/8c4c8b2a-a0a3-487c-9179-1ada2f0d55cf)


Puis on a la tester :

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/443fafe8-5803-4b34-b6df-aa7e7925fe37)

Et voici la sortie:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/f34bbc90-e36b-433e-aae6-627d689390eb)


-------------------MYSQL-----------------------

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/1a9f865d-23e9-4422-8021-485e962f3c79)

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/05f3ba72-4669-4c47-a1df-0bd02129644a)


-------------Pour cacher le mot de passe:

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/c53e7c89-94aa-4a79-a818-096335215d2c)

------------------------Web----------------

![image](https://github.com/ELFAHIM-SANA/ELFAHIMSANATP2/assets/131165163/d0088967-c285-4b2f-a79a-c9aa6f5925f0)
