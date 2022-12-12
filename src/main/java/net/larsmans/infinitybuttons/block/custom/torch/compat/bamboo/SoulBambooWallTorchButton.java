package net.larsmans.infinitybuttons.block.custom.torch.compat.bamboo;

import net.larsmans.infinitybuttons.block.custom.torch.compat.PropelWallTorchButton;
import net.larsmans.infinitybuttons.compat.BambooBlocksItems;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SoulBambooWallTorchButton extends PropelWallTorchButton {
    public SoulBambooWallTorchButton(Properties properties) {
        super(properties);
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
        return new ArrayList<>(Collections.singleton(new ItemStack(BambooBlocksItems.SOUL_BAMBOO_TORCH_BUTTON.get())));
    }
}
