Feature: Fonctionnalité de la page d'accueil

    Scenario: Titre et Description de la homepage
        Given je suis sur la homepage
        Then le titre doit être "Voitures électriques, énergie solaire et propre | Tesla France"
        And La description de la page d'accueil doit être: "Tesla accélère la transition mondiale vers une énergie durable en proposant des véhicules électriques, des panneaux solaires et des solutions intégrées d'énergie renouvelable pour les particuliers et les entreprises."

    Scenario Outline: Punchlines dans le menu de la homepage
        Given je suis sur la homepage
        Then la punchline doit être "<title>"
        Examples:
            | title     |
            | Model 3   |
            | Model X   |
            | Model Y   |
            | Powerwall |
            | Recharge  |

    Scenario Outline: Le menu tout en haut contient plusieurs liens
        Given je suis sur la homepage
        Then je peux accéder au lien: "<link-menu>"
        Examples:
            | link-menu |
            | Model S   |
            | Model 3   |
            | Model X   |
            | Model Y   |
            | Powerwall |
            | Recharge  |

    Scenario Outline: Le menu tout en haut contient plusieurs liens
        Given je suis sur la homepage
        Then je peux accéder au lien: "<link-profile>"
        Examples:
            | link-profile |
            | Assistance   |
            | Shop   |
            | Compte   |

    Scenario Outline: Punchlines dans le menu burger
        Given je suis sur la homepage
        When je suis dans le menu burger
        Then je peux accéder au lien: "<link>"
        Examples:
            | link                                |
            | Véhicules disponibles               |
            | Véhicules d'occasion                |
            | Reprise                             |
            | Essais                              |
            | Véhicules de société                |
            | Cybertruck                          |
            | Roadster                            |
            | Électricité pour les professionnels |
            | Industries                          |
            | Énergie                             |
            | Nous trouver                        |
            | Évènements                          |
            | Assistance                          |
            | Relations investisseurs             |
