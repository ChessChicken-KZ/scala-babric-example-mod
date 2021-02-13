package kz.chesschicken.example

import net.modificationstation.stationapi.api.client.event.texture.TextureRegister
import net.modificationstation.stationapi.api.common.event.block.BlockRegister
import net.modificationstation.stationapi.api.common.event.item.ItemRegister
import net.modificationstation.stationapi.api.common.mod.StationMod
import net.modificationstation.stationapi.api.common.registry.ModID

class ScalaMod extends Object with StationMod{
  override def init(modID: ModID): Unit = {
    val scalaVariable: ScalaListener = new ScalaListener()
    BlockRegister.EVENT.register(scalaVariable, modID)
    ItemRegister.EVENT.register(scalaVariable, modID)
    TextureRegister.EVENT.register(scalaVariable)
  }
}
