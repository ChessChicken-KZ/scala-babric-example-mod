package kz.chesschicken.example.events.init

import net.mine_diver.unsafeevents.listener.EventListener
import net.modificationstation.stationapi.api.client.event.texture.TextureRegisterEvent
import net.modificationstation.stationapi.api.client.texture.atlas.Atlases
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint
import net.modificationstation.stationapi.api.registry.{Identifier, ModID}
import net.modificationstation.stationapi.api.util.Null

class TextureListener {
  @Entrypoint.ModID
  var modID: ModID = Null.get()

  @EventListener def registerTextures(event: TextureRegisterEvent): Unit = {
  }

}
