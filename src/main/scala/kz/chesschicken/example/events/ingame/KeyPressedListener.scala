package kz.chesschicken.example.events.ingame

import kz.chesschicken.example.events.init.{AchievementListener, KeyBindingListener}
import net.fabricmc.api.{EnvType, Environment}
import net.fabricmc.loader.api.FabricLoader
import net.minecraft.client.Minecraft
import org.lwjgl.input.Keyboard

class KeyPressedListener {

  @Environment(EnvType.CLIENT)
  def keyPressed(): Unit = {

    if (Keyboard.getEventKey == KeyBindingListener.keyBinding.key) FabricLoader.getInstance().getGameInstance.asInstanceOf[Minecraft].player.increaseStat(AchievementListener.achievement, 1)
    if (Keyboard.getEventKey == KeyBindingListener.keyBinding2.key) FabricLoader.getInstance().getGameInstance.asInstanceOf[Minecraft].player.increaseStat(AchievementListener.achievement2, 1)
    if (Keyboard.getEventKey == KeyBindingListener.keyBinding3.key) FabricLoader.getInstance().getGameInstance.asInstanceOf[Minecraft].player.damage(null, 1000000)
  }

}
