package kz.chesschicken.example.events.ingame

import net.modificationstation.stationapi.api.entity.player.PlayerHandler

/**
 * This is an example of PlayerHandler.
 *
 * - What is this?
 * Well, basically it is PlayerAPI, but better and you can do some player event stuff.
 * Check methods for examples.
 */
class ExamplePlayerHandler extends java.lang.Object with PlayerHandler {

  /**
   * While respawn method in main player code being executed,
   * this code will be also executed.
   *
   * So, the message "Oh noes" will be printed out if method [[net.minecraft.entity.player.PlayerBase#respawn]] is being executed too.
   * @return boolean state.
   */
  override def respawn(): Boolean = {
    println("Oh noes")
    false
  }

}
