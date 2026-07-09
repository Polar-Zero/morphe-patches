package app.blackroom_gm

import app.morphe.patcher.patch.ApkFileType
import app.morphe.patcher.patch.AppTarget
import app.morphe.patcher.patch.Compatibility
import app.morphe.patcher.patch.rawResourcePatch
import java.io.File
import java.nio.file.Files

@Suppress("unused")
val COMPATIBILITY_TARGET = Compatibility(
	name = "길드 마스터가 되어주세요!",
	packageName = "com.devblackroom.blanc.gm",
	apkFileType = ApkFileType.APKS,
	appIconColor = 0xFF0045,
	targets = listOf(
		AppTarget(
			version = "2.1.8"
		)
	)
)

@Suppress("unused")
val savableVersionPatch = rawResourcePatch(name="저장가능 버전 패치",description = "오프라인 진행 및 저장 기능을 활성화합니다.",default = true)
{
	compatibleWith(COMPATIBILITY_TARGET)
	execute()
	{
		delete("res/values/strings.xml")
		val file = get("assets/bin/Data/Managed/Assembly-CSharp.dll")
		print(file.length())
		val content = file.readText()
		file.writeText(content)
		
		print(file.length())
		//addFile("assets/bin/Data/Managed","Assembly-CSharp.dll")
	}
}