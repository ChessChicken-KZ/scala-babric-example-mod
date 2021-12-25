package kz.chesschicken.example.events.init

import kz.chesschicken.example.events.init.TextureListener.CUSTOM_MODEL
import net.mine_diver.unsafeevents.listener.EventListener
import net.modificationstation.stationapi.api.client.event.texture.TextureRegisterEvent
import net.modificationstation.stationapi.api.client.model.json.JsonModel
import net.modificationstation.stationapi.api.client.texture.atlas.Atlases
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint
import net.modificationstation.stationapi.api.registry.{Identifier, ModID}
import net.modificationstation.stationapi.api.util.Null

object TextureListener {
  var CUSTOM_MODEL: JsonModel = _
}

class TextureListener {
  @Entrypoint.ModID
  var modID: ModID = Null.get()

  @EventListener def registerTextures(event: TextureRegisterEvent): Unit = {
    ItemListener.coolItem.setTexture("/assets/examplemod/textures/item/coolItem.png")
    BlockListener.exampleBlock3.texture = Atlases.getStationTerrain.addTexture(Identifier.of(modID, "block/scotlalamsy")).index
    CUSTOM_MODEL = JsonModel.get(Identifier.of(modID, "modelExample"))
  }

}
