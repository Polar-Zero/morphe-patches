package blackroom_vp

import app.morphe.patcher.patch.ApkFileType
import app.morphe.patcher.patch.AppTarget
import app.morphe.patcher.patch.Compatibility
import app.morphe.patcher.patch.resourcePatch
import org.w3c.dom.Element

@Suppress("unused")
val COMPATIBILITY_TARGET = Compatibility(
	name = "흡혈귀의 연애방법",
	packageName = "info.blackroom.vampirelovemain.renew",
	apkFileType = ApkFileType.APK,
	appIconColor = 0xFF0045,
	targets = listOf(
		AppTarget(
			version = "1.6.2"
		)
	)
)

//Code from https://github.com/rushiranpise/morphe-patches/blob/main/patches/src/main/kotlin/app/template/patches/shared/universal/UniversalPatches.kt#L161
@Suppress("unused")
val mainPatch = resourcePatch(name="SDK 버전 변경",description = "대상 SDK를 강제로 변경하여 Android 12~14 기기에서 설치 가능하도록 조정합니다. (갤23, 폴드/플립5 등)\n64Bit만 지원하는 기기에는 여전히 설치가 어렵습니다 (갤24+, 폴드/플립6+ 등 불가)",default = true)
{
	compatibleWith(COMPATIBILITY_TARGET)
	execute()
	{
		document("AndroidManifest.xml").use { d ->
            d.documentElement.setAttribute("platformBuildVersionCode", "30")
            val usesSdk = doc.getElementsByTagName("uses-sdk").item(0) as? Element
                ?: doc.createElement("uses-sdk").also { doc.documentElement.appendChild(it) }
            usesSdk.setAttribute("android:targetSdkVersion", "30")
        }
	}
}