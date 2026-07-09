package app.template.patches.blackroom_gm

import app.morphe.patcher.PatcherContext
import app.morphe.patcher.patch.rawResourcePatch
import java.io.File
import java.nio.file.Files
import app.template.patches.shared.Constants.COMPATIBILITY_BLACKROOM_GM
/*
fun addFile(destPath: String, srcFile: File, packageName: String): File {
	//Jar();
	return null;
}*/
@Suppress("unused")
val savableVersionPatch = rawResourcePatch(name="저장가능 버전 패치",description = "오프라인 진행 및 저장 기능을 활성화합니다.",default = true)
{
	compatibleWith(COMPATIBILITY_BLACKROOM_GM)
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