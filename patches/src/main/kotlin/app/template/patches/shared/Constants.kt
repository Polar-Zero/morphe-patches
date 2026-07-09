package app.template.patches.shared

import app.morphe.patcher.patch.ApkFileType
import app.morphe.patcher.patch.AppTarget
import app.morphe.patcher.patch.Compatibility

object Constants {
    val COMPATIBILITY_BLACKROOM_GM = Compatibility(
        name = "길드 마스터가 되어주세요!", // App name as it appears in the Android launcher.
        packageName = "com.devblackroom.blanc.gm",
        apkFileType = ApkFileType.APKS, // Preferred or recommended file type.
        appIconColor = 0xFF0045, // Icon color in Morphe Manager. Usually the same color as the icon background.
        targets = listOf(
            // "version = null" means the patch works with the latest app target
            // and is expected to work with all future app targets.
            //
            // It is highly recommended to always include the exact app version you developed your patches for
            // or the last version you have confirmed as 100% working.
            AppTarget(
                version = "2.1.8"
            )
        )
    )
}
