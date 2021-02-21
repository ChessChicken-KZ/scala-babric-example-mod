package kz.chesschicken.example.events.init

import kz.chesschicken.example.events.ingame.ExamplePlayerHandler
import net.modificationstation.stationapi.api.common.event.EventListener
import net.modificationstation.stationapi.api.common.event.entity.player.PlayerHandlerRegister

class PlayerHandlerListener {

  @EventListener def registerPlayerHandlers(event: PlayerHandlerRegister): Unit = {
    event.playerHandlers.add(new ExamplePlayerHandler())
  }

}
