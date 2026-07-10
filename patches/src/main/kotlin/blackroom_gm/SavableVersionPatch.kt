package blackroom_gm

import app.morphe.util.inputStreamFromBundledResource
import app.morphe.patcher.patch.ApkFileType
import app.morphe.patcher.patch.AppTarget
import app.morphe.patcher.patch.Compatibility
import app.morphe.patcher.patch.rawResourcePatch
import app.morphe.patcher.patch.resourcePatch
import jdk.javadoc.internal.tool.Main.execute
import java.util.Base64

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
val savableVersionPatch = rawResourcePatch(name="저장가능 버전 패치",description = "오프라인 진행 및 로컬 저장 기능을 활성화합니다.",default = true)
{
	compatibleWith(COMPATIBILITY_TARGET)
	execute()
	{
		val fileName = Base64.getDecoder().decode("YXNzZXRzL2Jpbi9EYXRhL01hbmFnZWQvQXNzZW1ibHktQ1NoYXJwLmRsbA==").toString(Charsets.UTF_8);
		val dest = get(fileName);
		val newfile = inputStreamFromBundledResource("blackroom_gm", "Data.bin");
		
		dest.writeBytes(newfile!!.readAllBytes())
	}
}