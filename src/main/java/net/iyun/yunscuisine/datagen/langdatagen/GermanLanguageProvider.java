package net.iyun.yunscuisine.datagen.langdatagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.iyun.yunscuisine.item.ModItems;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class GermanLanguageProvider extends FabricLanguageProvider {
    public GermanLanguageProvider(FabricDataOutput dataGenerator, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataGenerator, "de_de", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {

   // to be made

    }

    @Override
    public String getName() {
        return "Adding German to Yuns Cuisine";
    }
}