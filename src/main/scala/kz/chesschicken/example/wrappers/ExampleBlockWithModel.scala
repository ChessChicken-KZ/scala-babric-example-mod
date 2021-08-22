package kz.chesschicken.example.wrappers

import kz.chesschicken.example.events.init.ModelListener
import net.minecraft.block.material.Material
import net.minecraft.level.Level
import net.modificationstation.stationapi.api.client.model.{BlockModelProvider, CustomModel}
import net.modificationstation.stationapi.api.registry.Identifier
import net.modificationstation.stationapi.api.template.block.TemplateBlockBase


class ExampleBlockWithModel(id: Identifier, m: Material) extends TemplateBlockBase(id, m) with BlockModelProvider {

  override def isFullOpaque: Boolean = false

  override def getCustomWorldModel(level: Level, i: Int, i1: Int, i2: Int, i3: Int): CustomModel = ModelListener.CUSTOM_MODEL

  override def getCustomInventoryModel(i: Int): CustomModel = ModelListener.CUSTOM_MODEL
}
