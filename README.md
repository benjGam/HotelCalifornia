# Conceptes de la programmation orientée object (POO)

La programmation orienté objet est une manière de développer une application<br>
en utilisant le concept d'object.<br>

## La classe d'objet

Une classe d'objet est enfaite tout simplement le plan selon lequel va être<br>
construit un objet dans l'application.<br>

Tel qu'une maison que l'on va fabriquer, va possèder un plan avant d'être construite.<br>

## L'objet

Un objet est une instance de sa classe, c'est à dire que l'on va créer une instance<br>
depuis la classe de l'objet afin de pouvoir définir ce que va être cet objet.<br>

Tel que la maison est l'instance de son plan, elle représente la construction faites<br>
suivant son plan.<br>

## Les attributs et les méthodes

Les attributs d'une classe d'objet sont enfaite ses caractèristiques.<br>
Par exemple, une maison peut-être de couleur bleu, rouge, possedez 2 chambres.<br>
Etc, ce sont les attributs de la classe.<br>

Les méthodes sont les fonctions d'une classe d'objet, que l'on appelles "méthodes"<br>
c'est dans les méthodes que nous allons définir le comportement d'un objet.<br>
De cette façons, une méthode "ouvrir_porte" permettrait d'ouvrir une porte de l'objet Maison<br>

## Encapsulation

L'encapsulation est un concept selon lequel, certains attributs et certaines méthodes<br>
au sein d'un objet ne doivent pas être accessible depuis l'extérieur, c'est à dire, rendre<br>
opaque, empêcher un élément extérieur d'accèder à une méthode ou un attribut d'un objet<br>
L'encapsulation se caractèrise par les mots clés suivants:

- public
- private
- protected

## Association

L'association est le fait d'associer deux objets entre-eux, par exemple:<br>
Un objet "Personnage" peut posseder un objet "Fourreau", qui peut lui même<br>
posséder une objet "Epée" etc.<br>
L'association est le fait d'associer des objets entre-eux.<br>

## L'agrégation et la Composition

L'agrégation et la composition sont liées à l'association.<br>
Lorsque l'on parle d'agrégation, on parle d'une relation existante entre deux objets<br>
l'un étant dissociable de l'autre et inversement<br>

Alors que l'on parle de composition lorsqu'un objet est dépendant de ses relations<br>
Par exemple : <br>

- Un objet "boutton"
- Un objet "fenêtre"

L'objet bouton dépends de l'objet fenêtre, il compose la fenêtre et si l'objet "fenêtre"<br>
venait à être détruit, l'objet bouton serait lui aussi supprimé.<br>

## Généralisation et Spécialisation

La spécialisation d'une classe est le fait de rendre une classe héritante d'un parent<br>
plus spécialisé que cette dernière, la classe spécialisé va opérer des actions bien spécifiques<br>
au contexte dans lequel elle sera utilisé.<br>

La généralisation d'une classe est l'inverse de la spécialisation, c'est à dire, rendre le comportement<br>
d'une classe bien moins spécifique à son contexte, afin de pouvoir utiliser cette classe dans un plus grand<br>
nombre de situations.<br>

## Héritage

L'héritage est le fait de faire hériter une classe d'objet d'une classe parente, prennons un exemple: <br>

- Un objet "Véhicule"
- Un objet "Voiture"
- Un objet "Moto"

Ici, la classe parente est la classe "Véhicule" et ses enfants sont "Voiture" et "Moto" puis-ce qu'il<br>
s'agit tout deux de véhicules, la classe véhicule peut avoir des attributs et des méthodes dont ses<br>
enfants hériteront, mais qu'ils pourront modifier.<br>

## Polymorphisme

Le polymorphisme est le fait de surcharger des méthodes au sein d'une classe objet, c'est à dire<br>
modifier le comportement d'un objet en fonction de ce que l'on veut en faire.<br>
Reprennons l'exemple ci-dessus: <br>

Le véhicule dispose d'une méthode "démarrer"<br>
la "voiture" hérite de la méthode "démarrer"<br>
la "moto" aussi.<br>

Mais voilà. Le mode de démarrage d'une voiture est différent de celui d'une moto.<br>
Nous redéfinirons la méthode "démarrer" pour la moto.<br>
On a fait du polymorphisme, on a modifier le comportement de l'objet "moto" comparé<br>
à son parent (Véhicule).<br>

# Classe abstraires et concrètes

Une classe abstraite est une classe qui servira de modèle à d'autres classes qui pourraient<br>
en hériter, on peut définir des méthodes abstraites au sein d'une classe abstraites, de cette<br>
façon, toutes les classes qui hériteront de la classe abstraites auront un comportement de base<br>
et devront importer et définir le comportement de méthodes marquées telles que "abstract" dans la<br>
la classe abstraite, une classe abstraite permet de définir un modèle à suivre pour les classes qui<br>
en hériteront.<br>
La classe abstraite ne peut pas être instanciée !<br>

Une classe concrète est une classe qui hérite d'une classe abstraites, elle pourra être instancié et utilisé<br>
comme n'importe quel objet.<br>