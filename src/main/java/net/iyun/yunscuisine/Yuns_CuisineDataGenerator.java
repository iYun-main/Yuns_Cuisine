package net.iyun.yunscuisine;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.iyun.yunscuisine.datagen.*;
import net.iyun.yunscuisine.datagen.langdatagen.*;
import net.minecraft.registry.RegistryBuilder;

public class Yuns_CuisineDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(EnglishLanguageProvider::new);
		pack.addProvider(SwedishLanguageProvider::new);
		pack.addProvider(DutchLanguageProvider::new);
		pack.addProvider(GermanLanguageProvider::new);
		pack.addProvider(CzechiaLanguageProvider::new);
		pack.addProvider(ModItemTagProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeProvider::new);

	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
	}
}
