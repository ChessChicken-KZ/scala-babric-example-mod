package kz.chesschicken.example.custom

import net.minecraft.block.BlockBase
import net.modificationstation.stationapi.api.client.gui.screen.menu.AchievementPage
import net.modificationstation.stationapi.api.registry.ModID

import java.util.Random

class ExampleAchievementPage(id : ModID, name: String) extends AchievementPage(id, name) {

  override def getBackgroundTexture(random: Random, column: Int, row: Int, randomizedRow: Int, currentTexture: Int): Int = {
    var k = BlockBase.SAND.texture
    val l = random.nextInt(1 + row) + row / 2
    if (l <= 37 && row != 35) {
      if (l == 22) {
        if (random.nextInt(2) != 0)
          k =  BlockBase.REDSTONE_ORE.texture
        else
          k = BlockBase.DIAMOND_ORE.texture

      } else if (l == 10) {
        k = BlockBase.WOOD.texture;
      } else if (l == 8) {
        k = BlockBase.REDSTONE_ORE.texture;
      } else if (l > 4) {
        k = BlockBase.STONE.texture;
      } else if (l > 0) {
        k = BlockBase.DIRT.texture;
      }
    } else {
      k = BlockBase.BEDROCK.texture;
    }
    k
  }

}
