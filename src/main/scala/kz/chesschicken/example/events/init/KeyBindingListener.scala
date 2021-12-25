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
    keyBinding = new KeyBinding("key.examplemod.test", 21 /* Keyboard.KEY_Y */)
    event.keyBindings.add(keyBinding)

    keyBinding2 = new KeyBinding("key.examplemod.test2", 22 /* Keyboard.KEY_U */)
    event.keyBindings.add(keyBinding2)

    keyBinding3 = new KeyBinding("key.examplemod.hurtme", 23 /* Keyboard.KEY_I */)
    event.keyBindings.add(keyBinding3)
  }

}
