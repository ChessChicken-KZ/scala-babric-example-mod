package kz.chesschicken.example.events.init

import net.modificationstation.stationapi.api.client.event.texture.TextureRegister
import net.modificationstation.stationapi.api.client.texture.{TextureFactory, TextureRegistry}
import net.modificationstation.stationapi.api.common.event.EventListener

class TextureListener {

  @EventListener def registerTextures(event: TextureRegister): Unit = {
    ItemListener.coolItem.setTexturePosition(TextureFactory.INSTANCE.addTexture(TextureRegistry.getRegistry("GUI_ITEMS"), "/assets/examplemod/textures/coolItem.png"))
  }

}
