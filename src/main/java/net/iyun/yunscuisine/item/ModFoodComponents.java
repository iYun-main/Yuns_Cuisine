package net.iyun.yunscuisine.item;


import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;

public class ModFoodComponents {
    public static final FoodComponent BUTTER = new FoodComponent.Builder().statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 300), 0.5f).nutrition(1).saturationModifier(0.5f).build();
    public static final FoodComponent HOPS = new FoodComponent.Builder().statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 700,5), 0.7f).nutrition(1).saturationModifier(0.5f).build();
    public static final FoodComponent SALT = new FoodComponent.Builder().nutrition(1).saturationModifier(0.1f).build();
    public static final FoodComponent SALTBUCKET = new FoodComponent.Builder().nutrition(1).saturationModifier(0.1f).build();
    public static final FoodComponent CORN = new FoodComponent.Builder().nutrition(4).saturationModifier(0.5f).build();
    public static final FoodComponent RUHBARB = new FoodComponent.Builder().nutrition(3).saturationModifier(0.5f).build();
    public static final FoodComponent SANDBREAD = new FoodComponent.Builder().nutrition(3).saturationModifier(-1.5f).build();
    public static final FoodComponent CUCUMBER = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f).build();
    public static final FoodComponent CAKESLICE = new FoodComponent.Builder().nutrition(4).saturationModifier(0.25f).build();
    public static final FoodComponent CUCUMBERSLICE = new FoodComponent.Builder().nutrition(1).saturationModifier(0.25f).build();
    public static final FoodComponent BELLPEPPERSLICE = new FoodComponent.Builder().nutrition(1).saturationModifier(0.25f).build();
    public static final FoodComponent BELLPEPPER = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f).build();
    public static final FoodComponent GARLIC = new FoodComponent.Builder().nutrition(2).saturationModifier(0.25f).build();
    public static final FoodComponent TOMATO = new FoodComponent.Builder().nutrition(2).saturationModifier(0.25f).build();
    public static final FoodComponent ONION = new FoodComponent.Builder().nutrition(2).saturationModifier(0.25f).build();
    public static final FoodComponent ONIONSLICE = new FoodComponent.Builder().nutrition(1).saturationModifier(0.25f).build();
    public static final FoodComponent RAWONIONRING = new FoodComponent.Builder().nutrition(2).saturationModifier(0.5f).build();
    public static final FoodComponent FRIEDONIONRING = new FoodComponent.Builder().nutrition(5).saturationModifier(0.45f).build();
    public static final FoodComponent TOMATOSOUP = new FoodComponent.Builder().nutrition(7).saturationModifier(0.15f).build();
    public static final FoodComponent FRIEDCHICKEN = new FoodComponent.Builder().nutrition(6).saturationModifier(0.75f).build();
    public static final FoodComponent RAWCHICKENLEG = new FoodComponent.Builder().nutrition(3).saturationModifier(0.75f).build();
    public static final FoodComponent COFFEE = new FoodComponent.Builder().nutrition(1).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 400,0),0.25f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED,300,2),0.25f).statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION,300,0),0.35f).build();
    public static final FoodComponent CUTTOMATO = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f).build();
    public static final FoodComponent RAWBACON = new FoodComponent.Builder().nutrition(1).saturationModifier(0.5f).build();
    public static final FoodComponent COOKEDBACON = new FoodComponent.Builder().nutrition(2).saturationModifier(1f).build();
    public static final FoodComponent BUTTEREDBAKEDPOTATO = new FoodComponent.Builder().nutrition(6).saturationModifier(0.25f).build();
    public static final FoodComponent SPIDEREYESOUP = new FoodComponent.Builder().statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 1,1),1f).statusEffect(new StatusEffectInstance(StatusEffects.WITHER, 500,6),1f).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 200, 9), 1f).nutrition(2).saturationModifier(0.5f).build();
    public static final FoodComponent PEPPER = new FoodComponent.Builder().nutrition(1).saturationModifier(0.1f).build();
    public static final FoodComponent CUTBREAD = new FoodComponent.Builder().nutrition(1).saturationModifier(0.25f).build();
    public static final FoodComponent WHISKEY = new FoodComponent.Builder().nutrition(2).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,400, 0),0.5f).build();
    public static final FoodComponent CHILLI = new FoodComponent.Builder().nutrition(3).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 250, 1), 0.10f).saturationModifier(0.25f).build();
    public static final FoodComponent CANDIEDSPIDEREYE = new FoodComponent.Builder().nutrition(2).saturationModifier(1f).build();
    public static final FoodComponent MARSHMELLOW = new FoodComponent.Builder().nutrition(2).saturationModifier(0.5f).build();
    public static final FoodComponent MARSHMELLOWSTICK = new FoodComponent.Builder().nutrition(3).saturationModifier(1f).build();
    public static final FoodComponent BOILEDEGG = new FoodComponent.Builder().nutrition(6).saturationModifier(0.5f).build();
    public static final FoodComponent GARLICBREAD = new FoodComponent.Builder().nutrition(6).saturationModifier(0.8f).build();
    public static final FoodComponent GLOBALMAGICBERRIES = new FoodComponent.Builder().nutrition(7).saturationModifier(1.3f).alwaysEdible().build();
    public static final FoodComponent MASHEDPOTATO = new FoodComponent.Builder().nutrition(7).saturationModifier(0.15f).build();
    public static final FoodComponent TRUFFLE = new FoodComponent.Builder().nutrition(4).saturationModifier(0.5f).build();
    public static final FoodComponent PIZZA = new FoodComponent.Builder().nutrition(7).saturationModifier(0.25f).build();
    public static final FoodComponent PIZZASLICE = new FoodComponent.Builder().snack().nutrition(3).saturationModifier(0.2f).build();
    public static final FoodComponent HOTCHOCOLATE = new FoodComponent.Builder().nutrition(1).saturationModifier(0.1f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 300,1),0.25f).build();
    public static final FoodComponent GLOBALCAKES = new FoodComponent.Builder().nutrition(10).saturationModifier(0.55f).build();
    public static final FoodComponent TOAST = new FoodComponent.Builder().nutrition(2).saturationModifier(0.25f).build();
    public static final FoodComponent PARSLEY = new FoodComponent.Builder().nutrition(1).saturationModifier(0.1f).build();
    public static final FoodComponent TOASTBACON = new FoodComponent.Builder().nutrition(5).saturationModifier(0.3f).build();
    public static final FoodComponent TOASTBUTTER = new FoodComponent.Builder().nutrition(5).saturationModifier(0.3f).build();
    public static final FoodComponent TOASTEGG = new FoodComponent.Builder().nutrition(5).saturationModifier(0.3f).build();
    public static final FoodComponent TOASTJAM = new FoodComponent.Builder().nutrition(5).saturationModifier(0.3f).build();
    public static final FoodComponent CABBAGEMEATROLL = new FoodComponent.Builder().nutrition(5).saturationModifier(0.35f).build();
    public static final FoodComponent HOGLINSANDWICH = new FoodComponent.Builder().nutrition(6).saturationModifier(0.40f).build();
    public static final FoodComponent CHEESE = new FoodComponent.Builder().nutrition(4).saturationModifier(0.5f).build();
    public static final FoodComponent GLOBALPIE = new FoodComponent.Builder().nutrition(7).saturationModifier(0.3f).build();
    public static final FoodComponent CROISSANT = new FoodComponent.Builder().nutrition(6).saturationModifier(0.3f).build();
    public static final FoodComponent DOUGHNUT = new FoodComponent.Builder().nutrition(6).saturationModifier(0.25f).build();
    public static final FoodComponent NIGIRISUSHI = new FoodComponent.Builder().nutrition(6).saturationModifier(0.5f).build();
    public static final FoodComponent VEGGIEMAKI = new FoodComponent.Builder().nutrition(5).saturationModifier(0.25f).build();
    public static final FoodComponent VEGGIESANDWICH = new FoodComponent.Builder().nutrition(7).saturationModifier(0.25f).build();
    public static final FoodComponent SALAD = new FoodComponent.Builder().nutrition(6).saturationModifier(0.35f).build();
    public static final FoodComponent BURGER = new FoodComponent.Builder().nutrition(6).saturationModifier(0.4f).build();
    public static final FoodComponent GLOBALSMOOTHIES = new FoodComponent.Builder().nutrition(5).saturationModifier(0.25f).build();
    public static final FoodComponent GLOBALJAMS = new FoodComponent.Builder().nutrition(5).saturationModifier(0.1f).build();
    public static final FoodComponent GLOBALCOOKIE = new FoodComponent.Builder().nutrition(6).saturationModifier(0.3f).build();
    public static final FoodComponent NOODLES = new FoodComponent.Builder().nutrition(5).saturationModifier(0.45f).build();
    public static final FoodComponent SPAGHETTI = new FoodComponent.Builder().nutrition(6).saturationModifier(0.45f).build();
    public static final FoodComponent STEAKANDPOTATO = new FoodComponent.Builder().nutrition(7).saturationModifier(0.35f).build();
    public static final FoodComponent PUMPKINSOUP = new FoodComponent.Builder().nutrition(5).saturationModifier(0.25f).build();
    public static final FoodComponent SPRINGROLL = new FoodComponent.Builder().nutrition(5).saturationModifier(0.15f).build();
    public static final FoodComponent STUFFEDMUSHROOM = new FoodComponent.Builder().nutrition(5).saturationModifier(0.35f).build();
    public static final FoodComponent TOAST2 = new FoodComponent.Builder().nutrition(4).saturationModifier(0.25f).build();
    public static final FoodComponent GRAPES = new FoodComponent.Builder().nutrition(3).saturationModifier(1f).build();
    public static final FoodComponent DUMPLING = new FoodComponent.Builder().nutrition(7).saturationModifier(0.5f).build();
    public static final FoodComponent DOUGH = new FoodComponent.Builder().nutrition(1).saturationModifier(0.5f).build();
    public static final FoodComponent PANCAKES = new FoodComponent.Builder().nutrition(5).saturationModifier(0.5f).build();
    public static final FoodComponent LETTUCE = new FoodComponent.Builder().nutrition(4).saturationModifier(0.25f).build();
    public static final FoodComponent GLOBALWINES = new FoodComponent.Builder().nutrition(4).saturationModifier(0.2f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,400,0),0.6f).build();
    public static final FoodComponent EGGONBREAD = new FoodComponent.Builder().nutrition(5).saturationModifier(0.25f).build();
    public static final FoodComponent FRIEDEGG = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f).build();
    public static final FoodComponent LETTUCELEAF = new FoodComponent.Builder().nutrition(2).saturationModifier(0.2f).build();
    public static final FoodComponent STUFFEDBELLPEPPER = new FoodComponent.Builder().nutrition(7).saturationModifier(0.45f).build();
    public static final FoodComponent BUCKETOFPEPPER = new FoodComponent.Builder().nutrition(2).saturationModifier(1f).build();
    public static final FoodComponent MOLTENSUGAR = new FoodComponent.Builder().nutrition(2).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED,500,1),0.25f).build();
    public static final FoodComponent COOKEDMARSHMELLOW = new FoodComponent.Builder().nutrition(3).saturationModifier(1f).build();
    public static final FoodComponent RICE = new FoodComponent.Builder().nutrition(2).saturationModifier(0.2f).build();
    public static final FoodComponent COOKEDMARSHMELLOWSTICK = new FoodComponent.Builder().nutrition(4).saturationModifier(0.125f).build();
    public static final FoodComponent SLIGHTLYCOOKEDMARSHMELLOWSTICK = new FoodComponent.Builder().nutrition(4).saturationModifier(0.125f).build();
    public static final FoodComponent SLIGHTLYCOOKEDMARSHMELLOW = new FoodComponent.Builder().nutrition(3).saturationModifier(0.5f).build();
    public static final FoodComponent BURNTMARSHMELLOW = new FoodComponent.Builder().nutrition(2).saturationModifier(0.45f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 400, 0),1f).build();
    public static final FoodComponent BURNTMARSHMELLOWSTICK = new FoodComponent.Builder().nutrition(1).saturationModifier(0.125f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 400, 0),1f).build();
   // public static final FoodComponent DEBUG = new FoodComponent.Builder().nutrition(1).saturationModifier(.5f).alwaysEdible().usingConvertsTo(Items.DIAMOND).build();
    public static final FoodComponent BERRIES = new FoodComponent.Builder().nutrition(2).saturationModifier(0.25f).build();
    public static final FoodComponent PEARLSTEW = new FoodComponent.Builder().nutrition(6).saturationModifier(0.2f).build();
    public static final FoodComponent BUTTERCORN = new FoodComponent.Builder().nutrition(6).saturationModifier(0.25f).build();
    public static final FoodComponent POPCORN = new FoodComponent.Builder().nutrition(5).saturationModifier(0.15f).build();
    public static final FoodComponent GRILLEDCORN = new FoodComponent.Builder().nutrition(6).saturationModifier(0.125f).build();
    public static final FoodComponent BOILEDSNIFF = new FoodComponent.Builder().nutrition(3).saturationModifier(0.125f).build();
    public static final FoodComponent OMLETTESNIFF = new FoodComponent.Builder().nutrition(5).saturationModifier(0.125f).build();
    public static final FoodComponent BLAZERODNOODLES = new FoodComponent.Builder().nutrition(7).saturationModifier(0.125f).statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 400 ,0),0.3f).build();
    public static final FoodComponent CHOCOSTRAW = new FoodComponent.Builder().nutrition(3).saturationModifier(0.125f).build();
    public static final FoodComponent MUFFIN = new FoodComponent.Builder().nutrition(5).saturationModifier(0.2f).build();
    public static final FoodComponent GLOBALMUFFINS = new FoodComponent.Builder().nutrition(5).saturationModifier(0.2f).build();
    public static final FoodComponent GLOBALPICKELS = new FoodComponent.Builder().nutrition(6).saturationModifier(0.25f).build();
    public static final FoodComponent GLOBALSTICKCANDY = new FoodComponent.Builder().nutrition(5).saturationModifier(0.15f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED,300,1),0.1f).build();
    public static final FoodComponent GLOBALROCKCANDY = new FoodComponent.Builder().nutrition(6).saturationModifier(0.2f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED,300,1),0.15f).build();
    public static final FoodComponent GLOBALCANDY = new FoodComponent.Builder().nutrition(3).saturationModifier(0.2f).statusEffect(new StatusEffectInstance(StatusEffects.SPEED,300,1),0.15f).build();
}
