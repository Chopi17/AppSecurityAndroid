# AppSecurityAndroid

Bonjour monsieur, comme vous pourrez voir dans le GIT (https://github.com/Chopi17/AppSecurityAndroid) que nous ne sommes pas en mesure de vous présenter un travail répondant à vos attentent. Malheureusement, ce n'est pas l'objet du cours qui nous a posé problème mais notre niveau en Java et Android. En effet un seul membre du groupe a suivi le cours d'Android et un autre membre n'a jamais pratiqué le Java. Nous n'avons donc absolument pas eu le temps de mettre une application fonctionnel sur le temps impartie. Nous y avons passer énormément de temps et cela ne ce verra sans doute pas sur la note. ce qui est dommage dans cette situation, c'est que nous avons absolument pas pratiquer la partie sécurité (ce que l'ai entendre le nom du cours) et nous seront évaluer sur des points qui n'ont absolument aucun rapport avec les prérequis indiqué. A l'avenir, il serait plus judicieux dans un cours de sécurité d'avertir à l'ensemble des étudiants des éventuels prérequis, et des les avertir qu'ils passeront d'avantage de temps à faire de l'Android plutôt que de la sécurité. Cela nous évitera ce genre de déconvenue qui en plus de nous fournir aucunes compétences technique ne ferra que dégouter des étudiants de la programmation mobile. Et ainsi faire un choix éclairer, ce qui est le propre de toute bonne démocratie. A bonne entendeur.

Vous avez pu constater que notre application ne fonctionne pas malgré les efforts fournis de notre part.
Nous allons néanmoins expliquer ce que l'on voulait/ a put faire.

## API

Il faut faire un échange avec l'API de façon sécurisé et que toute la partie de l'API n'est pas de grosse faille. Pour cela, nous avons tout d'abord essayer de cacher l'URL de l'api dans un fichier dont le CHMOD était de 400. Cependant, lors de l'implémentation de cette features nous n'avons pas pu réussir à nous connecter à l'API parce moyen. Nous avons aussi entrepris de réaliser une connexion en TLS avec l'API mais notre niveau en protocole TLS ne nous à pas permis de mener cette entreprise à son terme.



## Base de données

pour ce qui est de la base de données, nous souhaitions créer la base de façon standard. Et par la suite chiffrer l'APK à l'aide du plugin Enigma (https://medium.com/@christopherney/protect-android-app-against-reverse-engineering-with-enigma-string-obfuscation-plugin-11687022cbef). Cela aurait ainsi protéger l'URL de l'API ainsi que le contenu de la base de données et toute autre informations au sein de l'APK.



#Enregistrement sécurisé des données
Nous voulions créer une bdd et cripter les données avec l'enigma APK. 

# Connexion
Pour la vérification de l'utilisateur nous verifions quand il confirme l'entrée de ses données si son username existe dans la bdd et si le password entrer correspond avec celui-ci.
Dans le cas contraire ont renvoie l'utilisateurs sur la page de connexion en l'informant qu'il n'as pas saisie le bon username ou le bon password.

#

