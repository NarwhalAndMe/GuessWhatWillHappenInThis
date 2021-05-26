package fr.anatom3000.gwwhit.materials.senuz;
import net.minecraft.util.registry.*;
import net.minecraft.util.Identifier;
import net.minecraft.item.BlockItem;
import fr.anatom3000.gwwhit.CustomItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.biome.v1.*;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.*;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class SenuzRoot  {
public static final SenuzDust SENUZ_DUST = new SenuzDust();
public static final Block SENUZ_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(2.3259587871313485f,4.823242085775082f).sounds(BlockSoundGroup.METAL).requiresTool().breakByTool(FabricToolTags.PICKAXES, 2));
public static final Block SENUZ_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(2.9219375389445275f,4.0401593593869265f).sounds(BlockSoundGroup.STONE).requiresTool().breakByTool(FabricToolTags.PICKAXES, 0));
public static final SenuzSword SENUZ_SWORD = new SenuzSword(SenuzMaterial.INSTANCE);

public void onInitialize() {
Registry.register(Registry.ITEM, new Identifier("gwwhit","senuz_dust"),SENUZ_DUST);
Registry.register(Registry.BLOCK, new Identifier("gwwhit", "senuz_block"), SENUZ_BLOCK);
Registry.register(Registry.ITEM, new Identifier("gwwhit", "senuz_block"), new BlockItem(SENUZ_BLOCK, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup)));
Registry.register(Registry.BLOCK, new Identifier("gwwhit", "senuz_ore"), SENUZ_ORE);
Registry.register(Registry.ITEM, new Identifier("gwwhit", "senuz_ore"), new BlockItem(SENUZ_ORE, new FabricItemSettings().group(CustomItemGroups.GWWHITGroup)));
Registry.register(Registry.ITEM, new Identifier("gwwhit","senuz_sword"),SENUZ_SWORD);
RegistryKey<ConfiguredFeature<?,?>> ore = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN, new Identifier("gwwhit","ore_senuz"));
BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ore);
}
public void onInitializeClient() {

}
}