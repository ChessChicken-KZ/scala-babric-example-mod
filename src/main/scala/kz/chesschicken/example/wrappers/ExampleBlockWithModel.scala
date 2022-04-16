package kz.chesschicken.example.wrappers

import net.minecraft.block.material.Material
import net.modificationstation.stationapi.api.registry.Identifier
import net.modificationstation.stationapi.api.template.block.TemplateBlockBase


class ExampleBlockWithModel(id: Identifier, m: Material) extends TemplateBlockBase(id, m) {

  override def isFullOpaque: Boolean = false

}
