package kz.chesschicken.example.custom

import net.minecraft.block.BlockBase
import net.modificationstation.stationapi.api.client.gui.screen.menu.AchievementPage
import net.modificationstation.stationapi.api.registry.ModID

import java.util.Random

class ExampleAchievementPage(id : ModID, name: String) extends AchievementPage(id, name) {

  override def getBackgroundTexture(random: Random, column: Int, row: Int, randomizedRow: Int, currentTexture: Int): Int = {
    val l = random.nextInt(1 + row) + row / 2
    if (l <= 37 && row != 35) {
      if (l == 22) {
        if (random.nextInt(2) != 0)
          BlockBase.REDSTONE_ORE.texture
        else
          BlockBase.DIAMOND_ORE.texture

      } else if (l == 10) {
        BlockBase.WOOD.texture
      } else if (l == 8) {
        BlockBase.REDSTONE_ORE.texture
      } else if (l > 4) {
        BlockBase.STONE.texture
      } else if (l > 0) {
        BlockBase.DIRT.texture
      }
    } else {
      BlockBase.BEDROCK.texture
    }
    BlockBase.SAND.texture
  }

}
