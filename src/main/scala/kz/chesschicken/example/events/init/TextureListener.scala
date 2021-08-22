package kz.chesschicken.example.events.init

import kz.chesschicken.example.events.init.TextureListener.CUSTOM_MODEL
import net.mine_diver.unsafeevents.listener.EventListener
import net.modificationstation.stationapi.api.client.event.texture.TextureRegisterEvent
import net.modificationstation.stationapi.api.client.model.JsonModel
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
    ItemListener.coolItem.setTexture("/assets/examplemod/textures/coolItem.png")

    CUSTOM_MODEL = new JsonModel(Identifier.of(modID, "modelExample"))
  }

}
