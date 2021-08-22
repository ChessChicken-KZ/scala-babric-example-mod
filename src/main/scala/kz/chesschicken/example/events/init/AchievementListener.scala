package kz.chesschicken.example.events.init

import kz.chesschicken.example.custom.ExampleAchievementPage
import kz.chesschicken.example.events.init.AchievementListener.{achievement, achievement2}
import net.mine_diver.unsafeevents.listener.EventListener
import net.minecraft.achievement.Achievement
import net.minecraft.item.ItemBase
import net.modificationstation.stationapi.api.event.achievement.AchievementRegisterEvent
import net.modificationstation.stationapi.api.mod.entrypoint.Entrypoint
import net.modificationstation.stationapi.api.registry.ModID
import net.modificationstation.stationapi.api.util.Null

object AchievementListener {

  var achievement: Achievement = _
  var achievement2: Achievement = _

}

class AchievementListener {
  @Entrypoint.ModID
  var modID: ModID = Null.get()

  @EventListener def registerAchievements(event: AchievementRegisterEvent): Unit = {
    val list = event.achievements
    val achievementPage = new ExampleAchievementPage(modID, "examplemod:testPage")
    achievement = new Achievement(69696969, "examplemod:boned", -1, 0, ItemBase.bone, null)
    achievement2 = new Achievement(69696970, "examplemod:apple", 0, 10, ItemBase.apple, achievement)
    achievement2.setUnusual()
    list.add(achievement)
    list.add(achievement2)
    achievementPage.addAchievements(achievement, achievement2)
  }

}
