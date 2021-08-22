package kz.chesschicken.example.events.init

import kz.chesschicken.example.events.init.BlockListener.{exampleBlock, exampleBlock2}
import kz.chesschicken.example.wrappers.ExampleBlockWithModel
import net.mine_diver.unsafeevents.listener.EventListener
import net.minecraft.block.material.Material
import net.modificationstation.stationapi.api.event.registry.BlockRegistryEvent
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint
import net.modificationstation.stationapi.api.registry.{Identifier, ModID}
import net.modificationstation.stationapi.api.template.block.TemplateBlockBase
import net.modificationstation.stationapi.api.util.Null

object BlockListener {

  var exampleBlock: net.minecraft.block.BlockBase = _
  var exampleBlock2: net.minecraft.block.BlockBase = _

}

class BlockListener {

  @Entrypoint.ModID val MOD_ID: ModID = Null.get()

  @EventListener def registerBlocks(event: BlockRegistryEvent): Unit = {
    System.out.println(MOD_ID)
    exampleBlock = new TemplateBlockBase(Identifier.of(MOD_ID, "test"), Material.DIRT).setTranslationKey(MOD_ID, "test")
    exampleBlock2 = new ExampleBlockWithModel(Identifier.of(MOD_ID, "test2"), Material.DIRT).setTranslationKey(MOD_ID, "test2")
  }

}
