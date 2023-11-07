package net.miner.minermod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.text.Text;
import net.miner.minermod.MinerMod;
import net.miner.minermod.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup MINERMOD_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MinerMod.MOD_ID, "minermod"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.minermod"))
                    .icon(() -> new ItemStack(ModItems.PINKDIAMOND)).entries((displayContext, entries) -> {
                        entries.add(ModItems.PINKDIAMOND);

                        entries.add(ModBlocks.PINK_DIAMOND_BLOCK);
                        entries.add(ModBlocks.PINK_DIAMOND_ORE);
                        entries.add(ModBlocks.DEEPSLATE_PINK_DIAMOND_ORE);
                        entries.add(ModBlocks.ENDSTONE_PINK_DIAMOND_ORE);


                    }).build());
    public static void registerItemGroups(){
        MinerMod.LOGGER.info("Registering Item Groups for " + MinerMod.MOD_ID);
    }
}
