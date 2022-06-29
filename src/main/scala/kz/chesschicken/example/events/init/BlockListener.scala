package kz.chesschicken.example.events.init

import kz.chesschicken.example.events.init.BlockListener.{example_block, example_model_block, exampleBlock3}
import kz.chesschicken.example.wrappers.ExampleBlockWithModel
import net.mine_diver.unsafeevents.listener.EventListener
import net.minecraft.block.material.Material
import net.modificationstation.stationapi.api.event.registry.BlockRegistryEvent
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint
import net.modificationstation.stationapi.api.registry.{Identifier, ModID}
import net.modificationstation.stationapi.api.template.block.TemplateBlockBase
import net.modificationstation.stationapi.api.util.Null

object BlockListener {

  var example_block: TemplateBlockBase = _
  var example_model_block: TemplateBlockBase = _
  var exampleBlock3: TemplateBlockBase = _
}

class BlockListener {

  @Entrypoint.ModID val MOD_ID: ModID = Null.get()

  @EventListener def registerBlocks(event: BlockRegistryEvent): Unit = {
    example_block = new TemplateBlockBase(Identifier.of(MOD_ID, "example_block"), Material.DIRT).setTranslationKey(MOD_ID, "example_block")
    example_model_block = new ExampleBlockWithModel(Identifier.of(MOD_ID, "example_model_block"), Material.DIRT).setTranslationKey(MOD_ID, "example_model_block")
    exampleBlock3 = new TemplateBlockBase(Identifier.of(MOD_ID, "test3"), Material.SAND).setTranslationKey(MOD_ID, "test3")
  }

}
