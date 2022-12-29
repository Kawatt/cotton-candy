package net.kawat.cottoncandy.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.kawat.cottoncandy.CottonCandy;
import net.kawat.cottoncandy.item.custom.CottonCandyItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class CottonCandyItems {
    public static final Item COTTON_CANDY = registerItem("cotton_candy",
            new CottonCandyItem(new FabricItemSettings().group(ItemGroup.FOOD)
                    .food(new FoodComponent.Builder().hunger(1).saturationModifier(0.6F).build())));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(CottonCandy.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CottonCandy.LOGGER.debug("Registering ModItems for " + CottonCandy.MOD_ID);
    }
}
