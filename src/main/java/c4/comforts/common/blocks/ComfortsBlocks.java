/*
 * Copyright (c) 2017 <C4>
 *
 * This Java class is distributed as a part of Comforts.
 * Comforts is open source and licensed under the GNU General Public License v3.
 * A copy of the license can be found here: https://www.gnu.org/licenses/gpl.txt
 */

package c4.comforts.common.blocks;

import c4.comforts.common.items.ComfortsItems;
import net.minecraft.item.EnumDyeColor;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ComfortsBlocks {

    public static BlockSleepingBag[] SLEEPING_BAGS;
    public static BlockHammock[] HAMMOCKS;

    @GameRegistry.ObjectHolder("comforts:rope")
    public static BlockRope ROPE;

    public static void preInit() {
        SLEEPING_BAGS = new BlockSleepingBag[16];
        HAMMOCKS = new BlockHammock[16];

        for(int i = 0; i < 16; i++) {
            EnumDyeColor color = EnumDyeColor.byMetadata(i);
            SLEEPING_BAGS[i] = new BlockSleepingBag(color);
            HAMMOCKS[i] = new BlockHammock(color);
        }
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {

        ROPE.initModel();
    }
}
