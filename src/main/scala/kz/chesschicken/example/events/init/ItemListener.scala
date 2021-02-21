package kz.chesschicken.example.events.init

import kz.chesschicken.example.events.init.ItemListener.coolItem
import net.modificationstation.stationapi.api.common.event.EventListener
import net.modificationstation.stationapi.api.common.event.item.ItemRegister
import net.modificationstation.stationapi.api.common.mod.entrypoint.Entrypoint
import net.modificationstation.stationapi.api.common.registry.{Identifier, ModID}
import net.modificationstation.stationapi.api.common.util.Null
import net.modificationstation.stationapi.template.common.item.ItemBase

object ItemListener {

  var coolItem: net.minecraft.item.ItemBase = _

}

class ItemListener {

  @Entrypoint.ModID val MOD_ID: ModID = Null.get

  @EventListener def registerItems(event: ItemRegister): Unit = {
    coolItem = new ItemBase(Identifier.of(MOD_ID, "coolitem")).setTranslationKey(MOD_ID, "coolitem")
  }

}
