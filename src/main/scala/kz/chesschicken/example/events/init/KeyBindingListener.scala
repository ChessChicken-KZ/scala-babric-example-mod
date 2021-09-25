package kz.chesschicken.example.events.init

import kz.chesschicken.example.events.init.KeyBindingListener.{keyBinding, keyBinding2, keyBinding3}
import net.mine_diver.unsafeevents.listener.EventListener
import net.minecraft.client.options.KeyBinding
import net.modificationstation.stationapi.api.client.event.option.KeyBindingRegisterEvent

object KeyBindingListener {

  var keyBinding: KeyBinding = _
  var keyBinding2: KeyBinding = _
  var keyBinding3: KeyBinding = _

}

class KeyBindingListener {

  @EventListener def registerKeyBindings(event: KeyBindingRegisterEvent): Unit = {
    val list = event.keyBindings
    keyBinding = new KeyBinding("key.examplemod.test", 21 /* Keyboard.KEY_Y */)
    keyBinding2 = new KeyBinding("key.examplemod.test2", 22 /* Keyboard.KEY_U */)
    keyBinding3 = new KeyBinding("key.examplemod.hurtme", 23 /* Keyboard.KEY_I */)
    list.add(keyBinding)
    list.add(keyBinding2)
    list.add(keyBinding3)
  }

}
