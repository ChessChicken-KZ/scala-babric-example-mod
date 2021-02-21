package kz.chesschicken.example.events.ingame

import net.modificationstation.stationapi.api.common.entity.player.PlayerHandler

class ExamplePlayerHandler extends java.lang.Object with PlayerHandler {

  override def respawn(): Boolean = {
    println("Oh noes")
    false
  }

}
