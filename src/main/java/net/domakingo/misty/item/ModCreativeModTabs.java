package net.domakingo.misty.item;

import net.domakingo.misty.Misty;
import net.domakingo.misty.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Misty.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MISTY_TAB = CREATIVE_MODE_TABS.register("misty_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MIST_ORB.get()))
                    .title(Component.translatable("creativetab.misty_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.MIST_ORB.get());
                        pOutput.accept(ModBlocks.MIST.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
