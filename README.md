# 👋🧩 Morphe Patches

Repository for Morphe Patches.

## ❓ About

This repository contains patches about help abandoned Android games run properly.

이 Repo는 어밴던웨어가 된 안드로이드 게임의 정상 작동을 도와주는 패치를 포함합니다.

## 패치 적용법
>  패치를 적용하려면 아래 이미지나 다음 링크를 사용하세요: https://morphe.software/add-source?github=Polar-Zero/morphe-patches
>  (Morphe 앱이 설치되지 않았을 경우 관련 과정도 같이 진행됩니다)

>  또는 Morphe 앱에서 다음 링크를 붙여넣어 직접 추가하는 것도 가능합니다 : https://github.com/Polar-Zero/morphe-patches

![QR Code](https://github.com/Polar-Zero/morphe-patches/blob/dev/QR.png?raw=true)

## 🩹 Patches list

<!-- PATCHES_START EXPANDED -->
> **[v1.1.0-dev.1](https://github.com/Polar-Zero/morphe-patches/releases/tag/v1.1.0-dev.1)**&nbsp;&nbsp;•&nbsp;&nbsp;`dev`&nbsp;&nbsp;•&nbsp;&nbsp;2 patches total
<details open>
<summary>📦 흡혈귀의 연애방법&nbsp;&nbsp;•&nbsp;&nbsp;1 patch</summary>
<br>

**🎯 Supported versions:**

| 1.6.2 |
| :---: |

| 💊&nbsp;Patch | 📜&nbsp;Description | ⚙️&nbsp;Options |
|----------|----------------|-----------|
| [SDK 버전 변경](#sdk) | 대상 SDK를 강제로 변경하여 Android 12~14 기기에서 설치 가능하도록 조정합니다. (갤23, 폴드/플립5 등)<br>64Bit만 지원하는 기기에는 여전히 설치가 어렵습니다 (갤24+, 폴드/플립6+ 등 불가) |  |

</details>

<details open>
<summary>📦 길드 마스터가 되어주세요!&nbsp;&nbsp;•&nbsp;&nbsp;1 patch</summary>
<br>

**🎯 Supported versions:**

| 1.1.9 |
| :---: |

| 💊&nbsp;Patch | 📜&nbsp;Description | ⚙️&nbsp;Options |
|----------|----------------|-----------|
| [저장가능 버전 패치](#) | 오프라인 진행 및 로컬 저장 기능을 활성화합니다. |  |

</details>

<!-- PATCHES_END -->


&nbsp;

    아래 부가적인 설명은 영문으로만 제공됩니다.

&nbsp;

## How to use these patches

> Click here to add these patches to Morphe: https://morphe.software/add-source?github=Polar-Zero/morphe-patches
> (If the Morphe app is not installed, the relevant steps will also be performed)

> Or manually add this repository url as a patch source in Morphe: https://github.com/Polar-Zero/morphe-patches

### 🛠️ Building

To build this Patches,
you can follow the [Morphe documentation](https://github.com/MorpheApp/morphe-documentation).

## 📜 License

this Morphe Patches are licensed under the [GNU General Public License v3.0](LICENSE)


## 🚀 Get started

To start using this template, follow these steps:

1. [Setup](https://github.com/MorpheApp/morphe-documentation/blob/main/docs/morphe-development/README.md) your development environment including adding a GitHub PAT as described [here](https://github.com/MorpheApp/morphe-patcher/blob/main/docs/2_1_setup.md#-prepare-the-environment).
2. [Create a new repository using this template](https://github.com/new?template_name=morphe-patches-template&template_owner=MorpheApp). Select create a new repository, and **enable 'Include all branches'** 
3. Enable "Allow GitHub Actions to create and approve pull requests" in your repo Settings > Actions > General > Workflow permissions
4. Update the [build.gradle.kts](patches/build.gradle.kts) file (Specifically, the 
   [group of the project](patches/build.gradle.kts#L1), and the [About](patches/build.gradle.kts#L6-L11))
5. Update the [README.md](README.md) file to be specific of your repo, and update the links in the [issue templates](.github/ISSUE_TEMPLATE).
6. Choose a name for your patches project. Keep in mind you must use a name that does not 
   imply authorship by the Morphe open source project. If unsure, then simply name these
   patches after yourself ("UserXYZ Morphe patches"). See the [NOTICE](NOTICE) for details. 
7. (Optional): Add `patches-bundle.png` to the project if you want a custom icon to show in
   Morphe Manager instead of your GitHub profile avatar.

🎉 You are now ready to start creating patches!

## 🧑‍💻 Usage

To develop and release your Patches using this template:

- Do all development work in the `dev` branch.
- For local development work build your patches using the gradle task `./gradlew buildAndroid` to generate the mpp file found in `patches/build/libs/patches-*.mpp`. Apply your patches locally using Morphe CLI tool like any other patch bundle.
- Always use [Semantic commit](https://kapeli.com/cheat_sheets/Semantic_Commits.docset/Contents/Resources/Documents/index) messages for commits. To keep it simple use only 3 commit message types: `feat: Added a new feature`, `fix: Some problem now fixed`, `chore: Random change you do not want in the user facing changelog`
- Commits of `fix:` and `feat:` will automatically generate new pre-releases and `chore:` will not create a new release.
- Users can apply your dev branch releases by enabling `pre-release` in Morphe Manager patch sources.
- When your dev branch is ready and you want a stable release, merge dev branch to main (do not squash, and only merge).
- **Always use semantic release (release.yml)**. Do not manually upload or creating releases by hand because many files must be updated and release.yml handles everything.

## 🤓 Tips
- See the [patcher documentation](https://github.com/MorpheApp/morphe-patcher/blob/main/docs/1_patcher_intro.md)
  for more examples of creating patches and fingerprints.
- Do not manually edit any generated files such as: `patches-list.json`, `patches-bundle.json`, `CHANGELOG.md`.
  These files will be automatically updated in the release action.
- Do not force push any semantic release commits or you will break the release. To 'redo' the last release then:
  - Git drop the last dev/main semantic release commit you want to redo.
  - Delete the release from the release area of this repo and delete the tag   
  - Make any other changes you wish to do
  - Force push dev/main branch
  - A new replacement release will be created by `release.yml`

