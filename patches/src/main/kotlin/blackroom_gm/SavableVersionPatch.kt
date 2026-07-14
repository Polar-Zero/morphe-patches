package blackroom_gm

import app.morphe.util.inputStreamFromBundledResource
import app.morphe.patcher.patch.ApkFileType
import app.morphe.patcher.patch.AppTarget
import app.morphe.patcher.patch.Compatibility
import app.morphe.patcher.patch.rawResourcePatch
import java.io.OutputStream
import kotlin.io.encoding.Base64

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
		val baseFolder = Base64.decode("YXNzZXRzL2Jpbi9EYXRhL01hbmFnZWQv").toString(Charsets.UTF_8)
		get(baseFolder+Base64.decode("UHVyY2hhc2luZy5Db21tb24uZGxs").toString(Charsets.UTF_8)).delete()
		get(baseFolder+Base64.decode("VGFwam95LkFuZHJvaWQuZGxs").toString(Charsets.UTF_8)).delete()
		get(baseFolder+Base64.decode("VGFwam95LmRsbA").toString(Charsets.UTF_8)).delete()
		get(baseFolder+Base64.decode("VGl6ZW4uZGxs").toString(Charsets.UTF_8)).delete()
		val fileName = baseFolder+Base64.decode("QXNzZW1ibHktQ1NoYXJwLmRsbA==").toString(Charsets.UTF_8)
		val dest = get(fileName)
		val newfile = inputStreamFromBundledResource("blackroom_gm", "Data.bin")
		//newfile.decodingWith(base64 = kotlin.io.encoding.Base64(false, true, true, true))
		
		newfile?.copyTo(dest.outputStream() as OutputStream)
	}
}