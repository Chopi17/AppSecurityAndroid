# AppSecurityAndroid

## Fonctionnalités de bases de l'app

Les fonctionnalités que doit à minima avoir l'app

- pouvoir modifier information

- Identification Données biométriques / mot de passe
- Affichage des données de l'API doivent apparaître dans l'application



## Gestion des données en locales

Les données sur le téléphones ne doivent pas être directement accessible par tous

- chiffrer dossier qui contiennent les données.



## API

Il faut faire un échange avec l'API de façon sécurisé et que toute la partie de l'API n'est pas de grosse faille

- Cacher URL de l'api
- Echange avec une API en TLS


# Connexion
Pour la vérification de l'utilisateur nous verifions quand il confirme l'entrée de ses données si son username existe dans la bdd et si le password entrer correspond ave celui-ci.
Dans le cas contraire ont renvoie l'utilisateurs sur la page de connexion en l'informant qu'il n'as pas saisie le bon username ou le bon password.

#

