package kz.chesschicken.example.events.init

import net.mine_diver.unsafeevents.listener.EventListener
import net.modificationstation.stationapi.api.client.event.texture.TextureRegisterEvent

class TextureListener {

  @EventListener def registerTextures(event: TextureRegisterEvent): Unit = {
    ItemListener.coolItem.setTexture("/assets/examplemod/textures/coolItem.png")
  }

}
