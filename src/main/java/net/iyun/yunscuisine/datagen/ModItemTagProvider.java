package net.iyun.yunscuisine.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.iyun.yunscuisine.item.ModItems;
import net.iyun.yunscuisine.util.ModTags;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(ItemTags.MEAT)
                .add(ModItems.FRIEDCHICKEN)
                .add(ModItems.RAWCHICKENLEG)
                .add(ModItems.CANDIEDSPIDEREYE)
                .add(ModItems.TOASTWITHBACON)
                .add(ModItems.CABBAGEMEATROLL)
                .add(ModItems.HOGLINSANDWICH)
                .add(ModItems.NIGIRISUSHI)
                .add(ModItems.BURGER)
                .add(ModItems.STUFFEDMUSHROOM)
                .add(ModItems.DUMPLING)
                .add(ModItems.HONEY_PORL)
                .add(ModItems.RAWBACON)
                .add(ModItems.COOKEDBACON)
                .add(ModItems.STEAKANDPOTATO);

        getOrCreateTagBuilder(ConventionalItemTags.FOODS)
        .add(ModItems.ANCIENTFRUIT.asItem())
        .add(ModItems.SALT.asItem())
        .add(ModItems.BUCKETOFSALT.asItem())
        .add(ModItems.PEPPER.asItem())
        .add(ModItems.BUCKETOFPEPPER.asItem())
        .add(ModItems.BUTTER.asItem())
        .add(ModItems.MOLTENSUGAR.asItem())
        .add(ModItems.MARSHMELLOW.asItem())
        .add(ModItems.MARSHMELLOWSTICK.asItem())
        .add(ModItems.SLIGHTLYCOOKEDMARSHMELLOW.asItem())
        .add(ModItems.SLIGHTLYCOOKEDMARSHMELLOWSTICK.asItem())
        .add(ModItems.COOKEDMARSHMELLOW.asItem())
        .add(ModItems.COOKEDMARSHMELLOWSTICK.asItem())
        .add(ModItems.BURNTMARSHMELLOW.asItem())
        .add(ModItems.BURNTMARSHMELLOWSTICK.asItem())
        .add(ModItems.COPPERBERRY.asItem())
        .add(ModItems.COALBERRY.asItem())
        .add(ModItems.GOLDBERRY.asItem())
        .add(ModItems.EMERALDBERRY.asItem())
        .add(ModItems.IRONBERRY.asItem())
        .add(ModItems.LAPISBERRY.asItem())
        .add(ModItems.AMETHYSTBERRY.asItem())
        .add(ModItems.DIAMONDBERRY.asItem())
        .add(ModItems.NETHERITEBERRY.asItem())
        .add(ModItems.REDSTONEBERRY.asItem())
        .add(ModItems.NETHERQUARTZBERRY.asItem())
        .add(ModItems.BOILEDEGG.asItem())
        .add(ModItems.FRIEDEGG.asItem())
        .add(ModItems.EGGONBREAD.asItem())
        .add(ModItems.CUTBREAD.asItem())
        .add(ModItems.TRUFFLE.asItem())
        .add(ModItems.CANDIEDSPIDEREYE.asItem())
        .add(ModItems.RAWBACON.asItem())
        .add(ModItems.COOKEDBACON.asItem())
        .add(ModItems.TOMATO.asItem())
        .add(ModItems.CUTTOMATO.asItem())
        .add(ModItems.CUCUMBER.asItem())
        .add(ModItems.CUCUMBERSLICE.asItem())
        .add(ModItems.GRAPES.asItem())
        .add(ModItems.COFFEEBEAN.asItem())
        .add(ModItems.LETTUCE.asItem())
        .add(ModItems.LETTUCELEAF.asItem())
        .add(ModItems.APPLEPIE.asItem())
        .add(ModItems.CHOCOLATEPIE.asItem())
        .add(ModItems.CHEESEPIE.asItem())
        .add(ModItems.CHEESE.asItem())
        .add(ModItems.TOAST.asItem())
        .add(ModItems.TOAST2.asItem())
        .add(ModItems.CAKESLICE.asItem())
        .add(ModItems.CARROTCAKE.asItem())
        .add(ModItems.SWEETBERRYCAKE.asItem())
        .add(ModItems.GLOWBERRYCAKE.asItem())
        .add(ModItems.APPLECAKE.asItem())
        .add(ModItems.MELONSCAKE.asItem())
        .add(ModItems.CHORUSCAKE.asItem())
        .add(ModItems.BEETROOTCAKE.asItem())
        .add(ModItems.STRAWBERRYCAKE.asItem())
        .add(ModItems.BLUEBERRYCAKE.asItem())
        .add(ModItems.MUFFIN.asItem())
        .add(ModItems.APPLEMUFFIN.asItem())
        .add(ModItems.BLUEMUFFIN.asItem())
        .add(ModItems.STRAWMUFFIN.asItem())
        .add(ModItems.MELONMUFFIN.asItem())
        .add(ModItems.GLOWMUFFIN.asItem())
        .add(ModItems.CARROTMUFFIN.asItem())
        .add(ModItems.SWEETMUFFIN.asItem())
        .add(ModItems.CHOCOMUFFIN.asItem())
        .add(ModItems.PUMPKINMUFFIN.asItem())
        .add(ModItems.PICKELS.asItem())
        .add(ModItems.PICKELTOMATO.asItem())
        .add(ModItems.PICKELSTRAW.asItem())
        .add(ModItems.PICKELONION.asItem())
        .add(ModItems.PICKELCORN.asItem())
        .add(ModItems.PICKELCHILLI.asItem())
        .add(ModItems.PICKELCARROT.asItem())
        .add(ModItems.PICKELBLUE.asItem())
        .add(ModItems.PICKELBELL.asItem())
        .add(ModItems.PANCAKES.asItem())
        .add(ModItems.CROISSANT.asItem())
        .add(ModItems.WINE.asItem())
        .add(ModItems.GLOWWINE.asItem())
        .add(ModItems.BEETWINE.asItem())
        .add(ModItems.CHORUSWINE.asItem())
        .add(ModItems.MELONWINE.asItem())
        .add(ModItems.SWEETWINE.asItem())
        .add(ModItems.WHISKEY.asItem())
        .add(ModItems.BUTTEREDPOTATO.asItem())
        .add(ModItems.MASHEDPOTATOES.asItem())
        .add(ModItems.TOMATOSOUP.asItem())
        .add(ModItems.SPIDEREYESOUP.asItem())
        .add(ModItems.SALAD.asItem())
        .add(ModItems.PUMPKINSOUP.asItem())
        .add(ModItems.NOODLES.asItem())
        .add(ModItems.SPAGHETTI.asItem())
        .add(ModItems.STEAKANDPOTATO.asItem())
        .add(ModItems.DUMPLING.asItem())
        .add(ModItems.DOUGH.asItem())
        .add(ModItems.SPRINGROLL.asItem())
        .add(ModItems.STUFFEDMUSHROOM.asItem())
        .add(ModItems.NIGIRISUSHI.asItem())
        .add(ModItems.VEGGIEMAKI.asItem())
        .add(ModItems.VEGGIESANDWICH.asItem())
        .add(ModItems.HOTCHOCOLATE.asItem())
        .add(ModItems.COFFEE.asItem())
        .add(ModItems.CABBAGEMEATROLL.asItem())
        .add(ModItems.BURGER.asItem())
        .add(ModItems.APPLESMOOTHIE.asItem())
        .add(ModItems.CARROTSMOOTHIE.asItem())
        .add(ModItems.PUMPKINSMOOTHIE.asItem())
        .add(ModItems.SWEETBERRYSMOOTHIE.asItem())
        .add(ModItems.WATERMELONSMOOTHIE.asItem())
        .add(ModItems.GLOWBERRYSMOOTHIE.asItem())
        .add(ModItems.BLUEBERSMOOTHIE.asItem())
        .add(ModItems.STRAWBERSMOOTHIE.asItem())
        .add(ModItems.TOASTWITHBUTTER.asItem())
        .add(ModItems.TOASTWITHBACON.asItem())
        .add(ModItems.TOASTWITHJAM.asItem())
        .add(ModItems.TOASTWITHEGG.asItem())
        .add(ModItems.FRIEDCHICKEN.asItem())
        .add(ModItems.RAWCHICKENLEG.asItem())
        .add(ModItems.PARSLEY.asItem())
        .add(ModItems.ONION.asItem())
        .add(ModItems.ONIONSLICE.asItem())
        .add(ModItems.RAWONIONRING.asItem())
        .add(ModItems.FRIEDONIONRING.asItem())
        .add(ModItems.BELLPEPPER.asItem())
        .add(ModItems.BELLPEPPERSLICE.asItem())
        .add(ModItems.STUFFEDBELLPEPPER.asItem())
        .add(ModItems.GARLIC.asItem())
        .add(ModItems.GARLICBREAD.asItem())
        .add(ModItems.PIZZA.asItem())
        .add(ModItems.PIZZASLICE.asItem())
        .add(ModItems.DOUGHTNUT.asItem())
        .add(ModItems.BEETDONUT.asItem())
        .add(ModItems.CARROTDONUT.asItem())
        .add(ModItems.APPLEDONUT.asItem())
        .add(ModItems.BLUEDONUT.asItem())
        .add(ModItems.STRAWDONUT.asItem())
        .add(ModItems.SWEETDONUT.asItem())
        .add(ModItems.CHOCODONUT.asItem())
        .add(ModItems.MELONDONUT.asItem())
        .add(ModItems.CHORUSDONUT.asItem())
        .add(ModItems.GLOWDONUT.asItem())
        .add(ModItems.GLOWBERRYCAKESLICE.asItem())
        .add(ModItems.APPLECAKESLICE.asItem())
        .add(ModItems.SWEETBERRYCAKESLICE.asItem())
        .add(ModItems.WATERMELONCAKESLICE.asItem())
        .add(ModItems.CHORUSCAKESLICE.asItem())
        .add(ModItems.CARROTCAKESLICE.asItem())
        .add(ModItems.BEETROOTCAKESLICE.asItem())
        .add(ModItems.STRAWBERRYCAKESLICE.asItem())
        .add(ModItems.BLUEBERRYCAKESLICE.asItem())
        .add(ModItems.MELONJAM.asItem())
        .add(ModItems.CARROTJAM.asItem())
        .add(ModItems.CHORUSJAM.asItem())
        .add(ModItems.BEETJAM.asItem())
        .add(ModItems.SWEETJAM.asItem())
        .add(ModItems.GLOWJAM.asItem())
        .add(ModItems.BLUEBERJAM.asItem())
        .add(ModItems.STRAWJAM.asItem())
        .add(ModItems.APPLEJAM.asItem())
        .add(ModItems.GLOWCOOKIE.asItem())
        .add(ModItems.MELONCOOKIE.asItem())
        .add(ModItems.SWEETCOOKIE.asItem())
        .add(ModItems.BEETCOOKIE.asItem())
        .add(ModItems.CHORUSCOOKIE.asItem())
        .add(ModItems.BLUECOOKIE.asItem())
        .add(ModItems.STRAWCOOKIE.asItem())
        .add(ModItems.CHILLI.asItem())
        .add(ModItems.CORN.asItem())
        .add(ModItems.STRAWBERRY.asItem())
        .add(ModItems.BLUEBERRY.asItem())
        .add(ModItems.PEARLSTEW.asItem())
        .add(ModItems.POPCORN.asItem())
        .add(ModItems.BUTTERCORN.asItem())
        .add(ModItems.SNIFFEROMLETTE.asItem())
        .add(ModItems.BOILEDSNIFFEGG.asItem())
        .add(ModItems.BLAZERODNOODLES.asItem())
        .add(ModItems.GRILLEDCORN.asItem())
        .add(ModItems.CHOCOSTRAWBERRY.asItem())
        .add(ModItems.RHUBARB.asItem())
        .add(ModItems.SANDBREAD.asItem());

        getOrCreateTagBuilder(ItemTags.VILLAGER_PLANTABLE_SEEDS)
        .add(ModItems.CHILLISEEDS.asItem())
        .add(ModItems.CORNSEEDS.asItem())
        .add(ModItems.CUCUMBERSEEDS.asItem())
        .add(ModItems.GRAPESEEDS.asItem())
        .add(ModItems.LETTUCESEEDS.asItem())
        .add(ModItems.PARSLEYSEEDS.asItem())
        .add(ModItems.RUHBARBSEEDS.asItem())
        .add(ModItems.TOMATOSEEDS.asItem())
        .add(ModItems.ANCIENTSEEDS.asItem())
        .add(ModItems.BELLPEPPERSEEDS.asItem());


        getOrCreateTagBuilder(ModTags.Items.JAM)
                .add(ModItems.BEETJAM)
                .add(ModItems.BLUEBERJAM)
                .add(ModItems.STRAWJAM)
                .add(ModItems.CARROTJAM)
                .add(ModItems.CHORUSJAM)
                .add(ModItems.GLOWJAM)
                .add(ModItems.MELONJAM)
                .add(ModItems.APPLEJAM);
    }
}

