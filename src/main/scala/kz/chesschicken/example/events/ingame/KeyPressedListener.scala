package kz.chesschicken.example.events.ingame

import kz.chesschicken.example.events.init.{AchievementListener, KeyBindingListener}
import net.fabricmc.api.{EnvType, Environment}
import net.fabricmc.loader.api.FabricLoader
import net.mine_diver.unsafeevents.listener.EventListener
import net.minecraft.client.Minecraft
import net.modificationstation.stationapi.api.client.event.keyboard.KeyStateChangedEvent
import org.lwjgl.input.Keyboard

/**
 * This is an example of KeyStateChangedEvent.
 *
 * - What is it?
 * This allows your code to track any key event (pressing, clicking, etc) happening right now.
 * So, if you want to add some key binding, use this kind of code.
 */
class KeyPressedListener {

  @Environment(EnvType.CLIENT)
  @EventListener
  def keyPressed(event: KeyStateChangedEvent): Unit = {
    if (Keyboard.getEventKey == KeyBindingListener.keyBinding.key)
      FabricLoader.getInstance().getGameInstance.asInstanceOf[Minecraft].player.increaseStat(AchievementListener.achievement, 1)
    if (Keyboard.getEventKey == KeyBindingListener.keyBinding2.key)
      FabricLoader.getInstance().getGameInstance.asInstanceOf[Minecraft].player.increaseStat(AchievementListener.achievement2, 1)
    if (Keyboard.getEventKey == KeyBindingListener.keyBinding3.key)
      FabricLoader.getInstance().getGameInstance.asInstanceOf[Minecraft].player.damage(null, 1000000)
  }

}
