package net.tropicraft.core.common.item;

/*
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;
*/

public class ItemDart extends ItemTropicraft {

    /*
    public static final String[] dartNames;
    private static final int[] colors;
    private static final String[] tooltipText;

    public ItemDart() {
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setMaxStackSize(64);
    }

    public void getSubItems(final Item item, final CreativeTabs par2CreativeTabs, final List par3List) {
        for (int i = 0; i < ItemDart.dartNames.length; ++i) {
            par3List.add(new ItemStack(item, 1, i));
        }
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(final ItemStack itemstack, final EntityPlayer ent, final List list, final boolean wat) {
        list.clear();
        list.add(
                ItemDart.tooltipText[itemstack.getItemDamage()]
                        + (new TextComponentTranslation(net.minecraft.util.text.translation.I18n.translateToLocal("dart.tropicraft:prefix.name")))
                        + " "
                        + (new TextComponentTranslation(net.minecraft.util.text.translation.I18n.translateToLocal("dart.tropicraft:" + ItemDart.dartNames[itemstack.getItemDamage()] + ".name"))));
    }

    static {
        dartNames = new String[] { "paralyze", "poison", "moveSlowdown", "harm", "confusion", "hunger", "weakness" };
        colors = new int[] { 16758271, 2461347, 13621209, 14672442, 5322747, 14754852, 7129087 };
        tooltipText = new String[] { "§d", "§3", "§7", "§6", "§1", "§4", "§9" };
    }*/
}
