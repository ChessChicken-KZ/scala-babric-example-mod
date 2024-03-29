package kz.chesschicken.example.events.init

import kz.chesschicken.example.events.init.ItemListener.example_item
import net.mine_diver.unsafeevents.listener.EventListener
import net.modificationstation.stationapi.api.event.registry.ItemRegistryEvent
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint
import net.modificationstation.stationapi.api.registry.{Identifier, ModID}
import net.modificationstation.stationapi.api.template.item.TemplateItemBase
import net.modificationstation.stationapi.api.util.Null

object ItemListener {
  var example_item: TemplateItemBase = _
}

class ItemListener {
  @Entrypoint.ModID val MOD_ID: ModID = Null.get()

  @EventListener def registerItems(event: ItemRegistryEvent): Unit = {
    example_item = new TemplateItemBase(Identifier.of(MOD_ID, "example_item")).setTranslationKey(MOD_ID, "example_item")
  }
}
