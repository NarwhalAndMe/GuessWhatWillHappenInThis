package fr.anatom3000.gwwhit.materials.sijtyw;
import net.minecraft.util.registry.*;
import net.minecraft.util.Identifier;
import net.minecraft.item.BlockItem;
import fr.anatom3000.gwwhit.CustomItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorMaterial;
import net.fabricmc.fabric.api.biome.v1.*;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.*;
public class SijtywRoot  {
public static final Sijtyw SIJTYW = new Sijtyw();
public static final SijtywBlock SIJTYW_BLOCK = new SijtywBlock();
public static final SijtywOre SIJTYW_ORE = new SijtywOre();
public static final SijtywShovel SIJTYW_SHOVEL = new SijtywShovel(SijtywMaterial.INSTANCE);
public static final SijtywPickaxe SIJTYW_PICKAXE = new SijtywPickaxe(SijtywMaterial.INSTANCE);
public static final SijtywAxe SIJTYW_AXE = new SijtywAxe(SijtywMaterial.INSTANCE);
public static final SijtywHoe SIJTYW_HOE = new SijtywHoe(SijtywMaterial.INSTANCE);
public static final ArmorMaterial sijtywArmorMaterial = new SijtywArmorMaterial();
public static final SijtywHelmet SIJTYW_HELMET = new SijtywHelmet(sijtywArmorMaterial);
public static final SijtywChestplate SIJTYW_CHESTPLATE = new SijtywChestplate(sijtywArmorMaterial);
public static final SijtywLeggings SIJTYW_LEGGINGS = new SijtywLeggings(sijtywArmorMaterial);
public static final SijtywBoots SIJTYW_BOOTS = new SijtywBoots(sijtywArmorMaterial);

public void onInitialize() {
Registry.register(Registry.ITEM, new Identifier("gwwhit","sijtyw"),SIJTYW);
Registry.register(Registry.BLOCK, new Identifier("gwwhit", "sijtyw_block"), SIJTYW_BLOCK);
Registry.register(Registry.ITEM, new Identifier("gwwhit", "sijtyw_block"), new BlockItem(SIJTYW_BLOCK, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup)));
Registry.register(Registry.BLOCK, new Identifier("gwwhit", "sijtyw_ore"), SIJTYW_ORE);
Registry.register(Registry.ITEM, new Identifier("gwwhit", "sijtyw_ore"), new BlockItem(SIJTYW_ORE, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup)));
Registry.register(Registry.ITEM, new Identifier("gwwhit","sijtyw_shovel"),SIJTYW_SHOVEL);
Registry.register(Registry.ITEM, new Identifier("gwwhit","sijtyw_pickaxe"),SIJTYW_PICKAXE);
Registry.register(Registry.ITEM, new Identifier("gwwhit","sijtyw_axe"),SIJTYW_AXE);
Registry.register(Registry.ITEM, new Identifier("gwwhit","sijtyw_hoe"),SIJTYW_HOE);
Registry.register(Registry.ITEM, new Identifier("gwwhit","sijtyw_helmet"),SIJTYW_HELMET);
Registry.register(Registry.ITEM, new Identifier("gwwhit","sijtyw_chestplate"),SIJTYW_CHESTPLATE);
Registry.register(Registry.ITEM, new Identifier("gwwhit","sijtyw_leggings"),SIJTYW_LEGGINGS);
Registry.register(Registry.ITEM, new Identifier("gwwhit","sijtyw_boots"),SIJTYW_BOOTS);
RegistryKey<ConfiguredFeature<?,?>> ore = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier("gwwhit","ore_sijtyw"));
BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ore);
}
public void onInitializeClient() {

}
}