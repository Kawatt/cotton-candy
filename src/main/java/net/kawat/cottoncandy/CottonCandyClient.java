package net.kawat.cottoncandy;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.kawat.cottoncandy.item.CottonCandyItems;
import net.minecraft.item.DyeableItem;

public class CottonCandyClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        //Cotton Candy color redenring
        ColorProviderRegistry.ITEM.register((Stack, tintIndex) -> tintIndex > 0 ? -1 : ((DyeableItem) Stack.getItem()).getColor(Stack), CottonCandyItems.COTTON_CANDY);
    }

}
