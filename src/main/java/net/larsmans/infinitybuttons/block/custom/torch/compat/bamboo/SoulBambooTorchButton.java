package net.larsmans.infinitybuttons.block.custom.torch.compat.bamboo;

import net.larsmans.infinitybuttons.block.custom.torch.compat.PropelTorchButton;
import net.larsmans.infinitybuttons.compat.BambooBlocksItems;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SoulBambooTorchButton extends PropelTorchButton {
    public SoulBambooTorchButton(Properties properties) {
        super(properties);
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
        return new ArrayList<>(Collections.singleton(new ItemStack(BambooBlocksItems.SOUL_BAMBOO_TORCH_BUTTON.get())));
    }
}
