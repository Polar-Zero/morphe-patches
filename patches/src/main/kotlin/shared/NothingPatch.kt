package shared;

import app.morphe.patcher.patch.ApkFileType
import app.morphe.patcher.patch.AppTarget
import app.morphe.patcher.patch.Compatibility
import app.morphe.patcher.patch.resourcePatch
import org.w3c.dom.Element

//Code from https://github.com/rushiranpise/morphe-patches/blob/main/patches/src/main/kotlin/app/template/patches/shared/universal/UniversalPatches.kt#L161
@Suppress("unused")
val NothingPatch = resourcePatch(name="더미 패치",description = "이 패치는 아무 코드도 실행하지 않습니다. apk 서명을 변경해야 할 때 유용할지도?")
{
	execute()
	{
	}
}