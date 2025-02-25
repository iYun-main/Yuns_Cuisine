package net.iyun.yunscuisine.datagen.langdatagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.iyun.yunscuisine.item.ModItems;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class CzechiaLanguageProvider extends FabricLanguageProvider {
    public CzechiaLanguageProvider(FabricDataOutput dataGenerator, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataGenerator, "cs_cz", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {

        translationBuilder.add(ModItems.SALT,"Sůl");
        translationBuilder.add(ModItems.RAWCHICKENLEG,"Syrová Kuřecí Noha");
        translationBuilder.add(ModItems.FRIEDCHICKEN,"Smažená Kuřecí Noha");
        translationBuilder.add(ModItems.BUCKETOFSALT,"Kbelík Soli");
        translationBuilder.add(ModItems.PEPPER,"Pepř");
        translationBuilder.add(ModItems.BUCKETOFPEPPER,"Kbelík Pepře");
        translationBuilder.add(ModItems.MARSHMELLOW,"Marshmellow");
        translationBuilder.add(ModItems.MARSHMELLOWSTICK,"Marshmellow na Tyčce");
        translationBuilder.add(ModItems.COOKEDMARSHMELLOW,"Pečený Marshmellow");
        translationBuilder.add(ModItems.COOKEDMARSHMELLOWSTICK,"Pečený Marshmellow na Tyčce");
        translationBuilder.add(ModItems.SLIGHTLYCOOKEDMARSHMELLOW,"Trochu Opečený Marshmellow");
        translationBuilder.add(ModItems.SLIGHTLYCOOKEDMARSHMELLOWSTICK,"Trochu Opečený Marshmellow na Tyčce");
        translationBuilder.add(ModItems.BURNTMARSHMELLOW,"Spálený Marshmellow");
        translationBuilder.add(ModItems.BURNTMARSHMELLOWSTICK,"Spálený Marshmellow na Tyčce");
        translationBuilder.add(ModItems.BOILEDEGG,"Vařené Vajíčko");
        translationBuilder.add(ModItems.COPPERBERRY,"Měďená Bobule");
        translationBuilder.add(ModItems.DIAMONDBERRY,"Diamantová Bobule");
        translationBuilder.add(ModItems.IRONBERRY,"Železná Bobule");
        translationBuilder.add(ModItems.LAPISBERRY,"Lapisová Bobule");
        translationBuilder.add(ModItems.EMERALDBERRY,"Smaragdová Bobule");
        translationBuilder.add(ModItems.NETHERITEBERRY,"Netheritová Bobule");
        translationBuilder.add(ModItems.NETHERQUARTZBERRY,"Netherově Křemenná Bobule");
        translationBuilder.add(ModItems.AMETHYSTBERRY,"Ametystová Bobule");
        translationBuilder.add(ModItems.COALBERRY,"Uhelná Bobule");
        translationBuilder.add(ModItems.GOLDBERRY,"Zlatá Bobule");
        translationBuilder.add(ModItems.REDSTONEBERRY,"Redstonová Bobule");
        translationBuilder.add(ModItems.BUTTER,"Máslo");
        translationBuilder.add(ModItems.MOLTENSUGAR,"Molten Sugar in a Bucket");
        translationBuilder.add(ModItems.TRUFFLE,"Lanýž");
        translationBuilder.add(ModItems.FRIEDEGG,"Volské oko");
        translationBuilder.add(ModItems.EGGONBREAD,"Vajíčka na Chlebu");
        translationBuilder.add(ModItems.GARLICBREAD,"Česnekový Chléb");
        translationBuilder.add(ModItems.GLOWBERRYSMOOTHIE,"Zářinkový Smoothie");
        translationBuilder.add(ModItems.CANDIEDSPIDEREYE,"Kandované Pavoučí Oko");
        translationBuilder.add(ModItems.CHILLI,"Čili Paprička");
        translationBuilder.add(ModItems.CHILLISEEDS,"Semínka Čili Papriček");
        translationBuilder.add(ModItems.RUHBARBSEEDS,"Semínka Rebarbory");
        translationBuilder.add(ModItems.ANCIENTSEEDS,"Prastaré Semínka");
        translationBuilder.add(ModItems.STRAWBERRY,"Jahoda");
        translationBuilder.add(ModItems.BLUEBERRY,"Borůvka");
        translationBuilder.add(ModItems.WHISKEY,"Whisky");
        translationBuilder.add(ModItems.CUTBREAD,"Krájený Chléb");
        translationBuilder.add(ModItems.RAWBACON,"Syrová Slanina");
        translationBuilder.add(ModItems.COOKEDBACON,"Pečená Slanina");
        translationBuilder.add(ModItems.SPIDEREYESOUP,"Polévka z Pavoučích Očí");
        translationBuilder.add(ModItems.MASHEDPOTATOES,"Bramborová Kaše");
        translationBuilder.add(ModItems.STUFFEDBELLPEPPER,"Plněná Paprika");
        translationBuilder.add(ModItems.BUTTEREDPOTATO,"Brambora na Másle");
        translationBuilder.add(ModItems.TOMATOSEEDS,"Semínka Rajčat");
        translationBuilder.add(ModItems.COFFEEBEAN,"Kávové Zrna");
        translationBuilder.add(ModItems.HOPSEEDS,"Semínka Chmele");
        translationBuilder.add(ModItems.ONION,"Cibule");
        translationBuilder.add(ModItems.RICE,"Rýže");
        translationBuilder.add(ModItems.HOPS,"Chmel");
        translationBuilder.add(ModItems.GARLIC,"Česnek");
        translationBuilder.add(ModItems.TOMATO,"Rajče");
        translationBuilder.add(ModItems.ANCIENTFRUIT,"Prastaré Ovoce");
        translationBuilder.add(ModItems.RHUBARB,"Rebarbora");
        translationBuilder.add(ModItems.RAWONIONRING,"Syrový Cibulový Kroužek");
        translationBuilder.add(ModItems.LETTUCELEAF,"Salátový List");
        translationBuilder.add(ModItems.ONIONSLICE,"Kousek Cibule");
        translationBuilder.add(ModItems.FRIEDONIONRING,"Smažený Cibulový Kroužek");
        translationBuilder.add(ModItems.CUTTOMATO,"Krájené Rajče");
        translationBuilder.add(ModItems.TOMATOSOUP,"Rajčatová Polévka");
        translationBuilder.add(ModItems.COFFEE,"Káva");
        translationBuilder.add(ModItems.CUCUMBER,"Okurka");
        translationBuilder.add(ModItems.CUCUMBERSLICE,"Kousek Okurky");
        translationBuilder.add(ModItems.PARSLEY,"Petržel");
        translationBuilder.add(ModItems.CUCUMBERSEEDS,"Semínka Okurky");
        translationBuilder.add(ModItems.LETTUCESEEDS,"Semínka Salátu");
        translationBuilder.add(ModItems.GRAPESEEDS,"Seminka Hroznu");
        translationBuilder.add(ModItems.PARSLEYSEEDS,"Semínka Petržele");
        translationBuilder.add(ModItems.BELLPEPPERSEEDS,"Semínka Papriky");
        translationBuilder.add(ModItems.CORNSEEDS,"Semínka Kukuřice");
        translationBuilder.add(ModItems.GRAPES,"Hrozny");
        translationBuilder.add(ModItems.LETTUCE,"Salát");
        translationBuilder.add(ModItems.APPLEPIE,"Jablečný Koláč");
        translationBuilder.add(ModItems.TOAST,"Toast");
        translationBuilder.add(ModItems.BELLPEPPER,"Paprika");
        translationBuilder.add(ModItems.BELLPEPPERSLICE,"Kousek Papriky");
        translationBuilder.add(ModItems.TOAST2,"Opečený Toast");
        translationBuilder.add(ModItems.CARROTCAKE,"Mrkvový Dort");
        translationBuilder.add(ModItems.APPLECAKE,"Jablečný Dort");
        translationBuilder.add(ModItems.SWEETBERRYCAKE,"Dort se Sladkými Bobulemi");
        translationBuilder.add(ModItems.CHORUSCAKE,"Chorusový Dort");
        translationBuilder.add(ModItems.MELONSCAKE,"Melounový Dort");
        translationBuilder.add(ModItems.BLUEBERRYCAKE,"Borůvkový Dort");
        translationBuilder.add(ModItems.STRAWBERRYCAKE,"Jahodový Dort");
        translationBuilder.add(ModItems.GLOWBERRYCAKE,"Zářinkový Dort");
        translationBuilder.add(ModItems.RHUBARBCAKE,"Rebarborový Dort");
        translationBuilder.add(ModItems.CHOCOLATEPIE,"Čokoládový Koláč");
        translationBuilder.add(ModItems.CHEESE,"Sýr");
        translationBuilder.add(ModItems.CHEESEPIE,"Sýrový Koláč");
        translationBuilder.add(ModItems.PANCAKES,"Palačinky");
        translationBuilder.add(ModItems.CROISSANT,"Loupák");
        translationBuilder.add(ModItems.DOUGHTNUT,"Koblih");
        translationBuilder.add(ModItems.CHOCODONUT,"Čokoládový Koblih");
        translationBuilder.add(ModItems.APPLEDONUT,"Jablečný Koblih");
        translationBuilder.add(ModItems.BEETDONUT,"Řepný Koblih");
        translationBuilder.add(ModItems.BLUEDONUT,"Borůvkový Koblih");
        translationBuilder.add(ModItems.CARROTDONUT,"Mrkvový Koblih");
        translationBuilder.add(ModItems.CHORUSDONUT,"Chorusový Koblih");
        translationBuilder.add(ModItems.MELONDONUT,"Melounový Koblih");
        translationBuilder.add(ModItems.STRAWDONUT,"Jahodový Koblih");
        translationBuilder.add(ModItems.SWEETDONUT,"Koblih ze Sladkých Bobulí");
        translationBuilder.add(ModItems.GLOWDONUT,"Zářinkový Koblih");
        translationBuilder.add(ModItems.SALAD,"Salát");
        translationBuilder.add(ModItems.PUMPKINSOUP,"Dýňová Polévka");
        translationBuilder.add(ModItems.WINE,"Víno");
        translationBuilder.add(ModItems.SWEETWINE,"Sladké Víno");
        translationBuilder.add(ModItems.MELONWINE,"Melounové Víno");
        translationBuilder.add(ModItems.GLOWWINE,"Zářinkové Víno");
        translationBuilder.add(ModItems.BEETWINE,"Řepné Víno");
        translationBuilder.add(ModItems.PUMKINWINE,"Dýňové Víno");
        translationBuilder.add(ModItems.ANCIENTWINE,"Víno z Prastarého Ovoce");
        translationBuilder.add(ModItems.CHORUSWINE,"Chorusové Víno");
        translationBuilder.add(ModItems.RHUBARBWINE,"Rebarborové Víno");
        translationBuilder.add(ModItems.NOODLES,"Nudle");
        translationBuilder.add(ModItems.PIZZA,"Pizza");
        translationBuilder.add(ModItems.PIZZASLICE,"Kousek Pizzy");
        translationBuilder.add(ModItems.SPAGHETTI,"Špagety");
        translationBuilder.add(ModItems.DUMPLING,"Knedlík");
        translationBuilder.add(ModItems.DOUGH,"Těsto");
        translationBuilder.add(ModItems.SPRINGROLL,"Jarní Závitek");
        translationBuilder.add(ModItems.STUFFEDMUSHROOM,"Plněný Hřib");
        translationBuilder.add(ModItems.HOGLINSANDWICH,"Hoglinový Sendvič");
        translationBuilder.add(ModItems.NIGIRISUSHI,"Nigiri Suši");
        translationBuilder.add(ModItems.VEGGIEMAKI,"Zeleninové Maki");
        translationBuilder.add(ModItems.HOTCHOCOLATE,"Horká Čokoláda");
        translationBuilder.add(ModItems.CABBAGEMEATROLL,"Masová Roláda se Zelím");
        translationBuilder.add(ModItems.BURGER,"Burger");
        translationBuilder.add(ModItems.BEETCOOKIE,"Řepná Sušenka");
        translationBuilder.add(ModItems.CHORUSCOOKIE,"Chorusová Sušenka");
        translationBuilder.add(ModItems.GLOWCOOKIE,"Zářinková Sušenka");
        translationBuilder.add(ModItems.MELONCOOKIE,"Melounová Sušenka");
        translationBuilder.add(ModItems.SWEETCOOKIE,"Sušenka se Sladkými Bobulemi");
        translationBuilder.add(ModItems.BLUECOOKIE,"Borůvková Sušenka");
        translationBuilder.add(ModItems.STRAWCOOKIE,"Jahodová Sušenka");
        translationBuilder.add(ModItems.APPLESMOOTHIE,"Jablečný Smoothie");
        translationBuilder.add(ModItems.CARROTSMOOTHIE,"Mrkvový Smoothie");
        translationBuilder.add(ModItems.PUMPKINSMOOTHIE,"Dýňový Smoothie");
        translationBuilder.add(ModItems.SWEETBERRYSMOOTHIE,"Smoothie ze Sladkých Bobulí");
        translationBuilder.add(ModItems.WATERMELONSMOOTHIE,"Melounový Smoothie");
        translationBuilder.add(ModItems.BLUEBERSMOOTHIE,"Borůvkový Smoothie");
        translationBuilder.add(ModItems.MAGMASMOOTHIE,"Smoothie z Lávové Pěny");
        translationBuilder.add(ModItems.STRAWBERSMOOTHIE,"Jahodový Smoothie");
        translationBuilder.add(ModItems.RHUBARBSMOOTHIE,"Rebarborový Smoothie");
        translationBuilder.add(ModItems.MELONJAM,"Melounový Džem");
        translationBuilder.add(ModItems.APPLEJAM,"Jablečný Džem");
        translationBuilder.add(ModItems.BLUEBERJAM,"Borůvkový Džem");
        translationBuilder.add(ModItems.STRAWJAM,"Jahodový Džem");
        translationBuilder.add(ModItems.CHORUSJAM,"Chorusový Džem");
        translationBuilder.add(ModItems.BEETJAM,"Řepný Džem");
        translationBuilder.add(ModItems.SWEETJAM,"Džem ze Sladkých Bobulí");
        translationBuilder.add(ModItems.GLOWJAM,"Zářinkový Džem");
        translationBuilder.add(ModItems.CARROTJAM,"Mrkvový Džem");
        translationBuilder.add(ModItems.TOASTWITHBACON,"Toast se Slaninou");
        translationBuilder.add(ModItems.TOASTWITHBUTTER, "Toast s Máslem");
        translationBuilder.add(ModItems.TOASTWITHEGG, "Vajíčko na Toastu");
        translationBuilder.add(ModItems.TOASTWITHJAM, "Toast s Džemem");
        translationBuilder.add(ModItems.CARROTCAKESLICE, "Kousek Mrkvového Dortu");
        translationBuilder.add(ModItems.CAKESLICE, "Kousek Dortu");
        translationBuilder.add(ModItems.APPLECAKESLICE, "Kousek Jablečného Dortu");
        translationBuilder.add(ModItems.GLOWBERRYCAKESLICE, "Kousek Zářinkového Dortu");
        translationBuilder.add(ModItems.SWEETBERRYCAKESLICE, "Kousek Dortu ze Sladkých Bobulí");
        translationBuilder.add(ModItems.BEETROOTCAKESLICE, "Kousek Řepného Dortu");
        translationBuilder.add(ModItems.RHUBARBCAKESLICE, "Kousek Rebarborového Dortu");
        translationBuilder.add(ModItems.BEETROOTCAKE, "Řepný Dort");
        translationBuilder.add(ModItems.CORN, "Kukuřice");
        translationBuilder.add(ModItems.PEARLSTEW, "Polévka z Endových Perel");
        translationBuilder.add(ModItems.BUTTERCORN, "Kukuřice na Másle");
        translationBuilder.add(ModItems.POPCORN, "Popcorn");
        translationBuilder.add(ModItems.GRILLEDCORN, "Grilovaná Kukuřice");
        translationBuilder.add(ModItems.BOILEDSNIFFEGG, "Vařené Čmuchalové Vajíčko");
        translationBuilder.add(ModItems.SNIFFEROMLETTE, "Čmuchalová Omeleta");
        translationBuilder.add(ModItems.BLAZERODNOODLES, "Nudle z Ohnivých Holí");
        translationBuilder.add(ModItems.BIGBOWL, "Velká Miska");
        translationBuilder.add(ModItems.CHOCOSTRAWBERRY, "Jahoda v Čokoládě");
        translationBuilder.add(ModItems.MUFFIN, "Muffin");
        translationBuilder.add(ModItems.APPLEMUFFIN, "Jablečný Muffin");
        translationBuilder.add(ModItems.BLUEMUFFIN, "Borůvkový Muffin");
        translationBuilder.add(ModItems.STRAWMUFFIN, "Jahodový Muffin");
        translationBuilder.add(ModItems.MELONMUFFIN, "Melounový Muffin");
        translationBuilder.add(ModItems.GLOWMUFFIN, "Zářinkový Muffin");
        translationBuilder.add(ModItems.CARROTMUFFIN, "Mrkvový Muffin");
        translationBuilder.add(ModItems.SWEETMUFFIN, "Muffin se Sladkými Bobulemi");
        translationBuilder.add(ModItems.CHOCOMUFFIN, "Čokoládový Muffin");
        translationBuilder.add(ModItems.PUMPKINMUFFIN, "Dýňový Muffin");
        translationBuilder.add(ModItems.RHUBARBMUFFIN, "Rebarborový Muffin");
        translationBuilder.add(ModItems.PICKELS, "Nakládané Okurky");
        translationBuilder.add(ModItems.PICKELTOMATO, "Nakládané Rajčata");
        translationBuilder.add(ModItems.PICKELSTRAW, "Nakládané Jahody");
        translationBuilder.add(ModItems.PICKELONION, "Nakládaná Cibule");
        translationBuilder.add(ModItems.PICKELCORN, "Nakládaná Kukuřice");
        translationBuilder.add(ModItems.PICKELCHILLI, "Nakládané Čili Papričky");
        translationBuilder.add(ModItems.PICKELCARROT, "Nakládané Mrkve");
        translationBuilder.add(ModItems.PICKELBLUE, "Nakládané Borůvky");
        translationBuilder.add(ModItems.PICKELBELL, "Nakládané Papriky");
        translationBuilder.add(ModItems.CANDIED_APPLE, "Kandované Jablko na Tyčce");
        translationBuilder.add(ModItems.CANDIED_BEET, "Kandovaná Řepa na Tyčce");
        translationBuilder.add(ModItems.CANDIED_BLUEBER, "Kandované Borůvky na Tyččce");
        translationBuilder.add(ModItems.CANDIED_CARROT, "Kandované Mrkve na Tyčce");
        translationBuilder.add(ModItems.CANDIED_GLOWBER, "Kandovaná Zářinka na Tyčce");
        translationBuilder.add(ModItems.CANDIED_MELON, "Kandovaný Meloun na Tyčce");
        translationBuilder.add(ModItems.CANDIED_PUMPKIN, "Kandovaná Dýně na Tyčce");
        translationBuilder.add(ModItems.CANDIED_STRAWBER, "Kandovaná Jahoda na Tyčce");
        translationBuilder.add(ModItems.CANDIED_SWEETBER, "Kandovaná Sladká Bobule na Tyčce");
        translationBuilder.add(ModItems.ROCK_CANDY_APPLE, "Jablečný Kandys");
        translationBuilder.add(ModItems.ROCK_CANDY_BEET, "Řepný Kandys");
        translationBuilder.add(ModItems.ROCK_CANDY_BLUEBER, "Borůvkový Kandys");
        translationBuilder.add(ModItems.ROCK_CANDY_CARROT, "Mrkvový Kandys");
        translationBuilder.add(ModItems.ROCK_CANDY_GLOWBER, "Zářinkový Kandys");
        translationBuilder.add(ModItems.ROCK_CANDY_MELON, "Melounový Kandys");
        translationBuilder.add(ModItems.ROCK_CANDY_PUMPKIN, "Dýňový Kandys");
        translationBuilder.add(ModItems.ROCK_CANDY_STRAWBER, "Jahodový Kandys");
        translationBuilder.add(ModItems.ROCK_CANDY_SWEETBER, "Kandys s Příchutí Sladkých Bobulí");
        translationBuilder.add(ModItems.TAFFY, "Karamela");
        translationBuilder.add(ModItems.CANDY_CORN, "Bonbónová Kukuřice");
        translationBuilder.add(ModItems.SANDBREAD, "Taguella");
        translationBuilder.add(ModItems.STEAKANDPOTATO, "Steak s Bramborem");
        translationBuilder.add(ModItems.VEGGIESANDWICH, "Zeleninový Sendvič");
        translationBuilder.add(ModItems.WATERMELONCAKESLICE, "Kousek Melounového Dortu");
        translationBuilder.add(ModItems.CHORUSCAKESLICE, "Kousek Chorusového Dortu");
        translationBuilder.add(ModItems.STRAWBERRYCAKESLICE, "Kousek Jahodového Dortu");
        translationBuilder.add(ModItems.BLUEBERRYCAKESLICE, "Kousek Borůvkového Dortu");

        translationBuilder.add(ModItems.BUTTER_TART, "Máslový koláč");
        translationBuilder.add(ModItems.CANDY_CANE, "Candy Cane");
        translationBuilder.add(ModItems.CHAMP, "Šampaňské");
        translationBuilder.add(ModItems.CHRIS_PUD, "Vánoční pudink");
        translationBuilder.add(ModItems.EGGNOG, "Vaječný koňak");
        translationBuilder.add(ModItems.GIN_BREAD, "Perníkový panáček");
        translationBuilder.add(ModItems.RICE_PUD, "Rýžový nákyp");
        translationBuilder.add(ModItems.RICE_PUD_BIG, "Velký rýžový nákyp");
        translationBuilder.add(ModItems.HONEY_PORL, "Medové vepřové");


    }

    @Override
    public String getName() {
        return "Adding Czechia to Yuns Cuisine";
    }
}