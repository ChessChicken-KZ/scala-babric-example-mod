package kz.chesschicken.example.events.init

import kz.chesschicken.example.events.init.BlockListener.{exampleBlock, exampleBlock2}
import kz.chesschicken.example.wrappers.ExampleBlockWithModel
import net.minecraft.block.material.Material
import net.modificationstation.stationapi.api.common.event.EventListener
import net.modificationstation.stationapi.api.common.event.block.BlockRegister
import net.modificationstation.stationapi.api.common.mod.entrypoint.Entrypoint
import net.modificationstation.stationapi.api.common.registry.{Identifier, ModID}
import net.modificationstation.stationapi.api.common.util.Null
import net.modificationstation.stationapi.template.common.block.BlockBase

object BlockListener {

  var exampleBlock: net.minecraft.block.BlockBase = _
  var exampleBlock2: net.minecraft.block.BlockBase = _

}

class BlockListener {

  @Entrypoint.ModID val MOD_ID: ModID = Null.get()

  @EventListener def registerBlocks(event: BlockRegister): Unit = {
    System.out.println(MOD_ID)
    exampleBlock = new BlockBase(Identifier.of(MOD_ID, "test"), Material.DIRT).setTranslationKey(MOD_ID, "test")
    exampleBlock2 = new ExampleBlockWithModel(Identifier.of(MOD_ID, "test2"), Material.DIRT).setTranslationKey(MOD_ID, "test2")
  }

}
