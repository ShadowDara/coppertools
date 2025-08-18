package de.shadowdara.coppertools.item;

import de.shadowdara.coppertools.Coppertools;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item COPPER_HELMET = registerItem("copper_helmet",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.HELMET,
            new FabricItemSettings())
    );
    public static final Item COPPER_CHESTPLATE = registerItem("copper_chestplate",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.CHESTPLATE,
                    new FabricItemSettings())
    );
    public static final Item COPPER_LEGGINGS = registerItem("copper_leggings",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.LEGGINGS,
                    new FabricItemSettings())
    );
    public static final Item COPPER_BOOTS = registerItem("copper_boots",
            new ArmorItem(ModArmorMaterials.COPPER, ArmorItem.Type.BOOTS,
                    new FabricItemSettings())
    );

    public static final Item COPPER_SWORD = registerItem("copper_sword",
            new SwordItem(ModToolMaterial.COPPER, 3, -2.4f,
            new FabricItemSettings())
    );
    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe",
            new PickaxeItem(ModToolMaterial.COPPER, 1, -2.8f,
            new FabricItemSettings())
    );
    public static final Item COPPER_AXE = registerItem("copper_axe",
            new AxeItem(ModToolMaterial.COPPER, 6.5f, -3.2f,
            new FabricItemSettings())
    );
    public static final Item COPPER_SHOVEL = registerItem("copper_shovel",
            new ShovelItem(ModToolMaterial.COPPER, 1.5f, -3f,
            new FabricItemSettings())
    );
    public static final Item COPPER_HOE = registerItem("copper_hoe",
            new HoeItem(ModToolMaterial.COPPER, -2, -1.5f,
            new FabricItemSettings())
    );


    private static void addItemsToArmorItemGroup(FabricItemGroupEntries entries) {
        entries.add(COPPER_HELMET);
        entries.add(COPPER_CHESTPLATE);
        entries.add(COPPER_LEGGINGS);
        entries.add(COPPER_BOOTS);

        entries.add(COPPER_SWORD);
        entries.add(COPPER_AXE);
    }

    private static void addItemsToToolsGroup(FabricItemGroupEntries entries) {
        entries.add(COPPER_PICKAXE);
        entries.add(COPPER_AXE);
        entries.add(COPPER_SHOVEL);
        entries.add(COPPER_HOE);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM,
                new Identifier(Coppertools.MOD_ID, name), item
        );
    }

    public static void registerModItems() {
        Coppertools.LOGGER.info("Registering Mod Items for " + Coppertools.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::addItemsToArmorItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsGroup);
    }
}
