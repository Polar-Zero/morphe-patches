package app.template.patches.example

import app.morphe.patcher.patch.ResourcePatch
import app.template.patches.shared.Constants.COMPATIBILITY_BLACKROOM_GM

@Suppress("unused")
val savableVersionPatch = ResourcePatch(
    name = "저장가능 버전 패치",
    description = "오프라인 진행 및 저장 기능을 활성화합니다.",
    default = true
) {
    compatibleWith(COMPATIBILITY_BLACKROOM_GM)
    dependsOn(savableVersionPatch)
	addAppResources("blackroom_gm")
}
