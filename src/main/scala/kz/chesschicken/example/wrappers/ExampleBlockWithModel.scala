package kz.chesschicken.example.wrappers

import kz.chesschicken.example.events.init.TextureListener
import net.minecraft.block.material.Material
import net.minecraft.level.BlockView
import net.modificationstation.stationapi.api.client.model.{BlockInventoryModelProvider, BlockWorldModelProvider, JsonModel}
import net.modificationstation.stationapi.api.registry.Identifier
import net.modificationstation.stationapi.api.template.block.TemplateBlockBase


class ExampleBlockWithModel(id: Identifier, m: Material) extends TemplateBlockBase(id, m) with BlockInventoryModelProvider with BlockWorldModelProvider {

  override def isFullOpaque: Boolean = false

  override def getCustomWorldModel(level: BlockView, x: Int, y: Int, z: Int): JsonModel  = TextureListener.CUSTOM_MODEL

  override def getInventoryModel(i: Int): JsonModel = TextureListener.CUSTOM_MODEL


}
