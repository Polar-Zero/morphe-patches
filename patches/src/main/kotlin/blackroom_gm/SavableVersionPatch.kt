package blackroom_gm

import app.morphe.util.inputStreamFromBundledResource
import app.morphe.patcher.patch.ApkFileType
import app.morphe.patcher.patch.AppTarget
import app.morphe.patcher.patch.Compatibility
import app.morphe.patcher.patch.resourcePatch

@Suppress("unused")
val COMPATIBILITY_TARGET = Compatibility(
	name = "길드 마스터가 되어주세요!",
	packageName = "com.devblackroom.blanc.gm",
	apkFileType = ApkFileType.APK,
	appIconColor = 0xFF0045,
	targets = listOf(
		AppTarget(
			version = "1.1.9"
		)
	)
)

@Suppress("unused")
val savableVersionPatch = resourcePatch(name="저장가능 버전 패치",description = "오프라인 진행 및 저장 기능을 활성화합니다.",default = true)
{
	compatibleWith(COMPATIBILITY_TARGET)
	execute()
	{
		val fileName = "assets/bin/Data/Managed/Assembly-CSharp.dll"
		
		val newfile = inputStreamFromBundledResource("blackroom_gm", fileName);
        newfile.use{input
		->
            destination.outputStream().use { output ->
                input.copyTo(output)
            }
        }
		Thread.sleep(50000)
		val file = get(fileName)
		val content = file.readText()
		file.writeText(content)
	}
}