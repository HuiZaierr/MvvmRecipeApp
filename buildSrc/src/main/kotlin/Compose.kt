/**
 * TODO：
 *   https://developer.android.google.cn/jetpack/compose/bom/bom-mapping?hl=zh-cn
 */
object Compose {

    //Bom的映射
    const val composeBom = "androidx.compose:compose-bom:2022.10.00"

    const val animation = "androidx.compose.animation:animation"
    const val animationCore = "androidx.compose.animation:animation-core"
    const val animationGraphics = "androidx.compose.animation:animation-graphics"
    //基本的 UI 组件和工具，例如布局组件、手势处理、动画和绘图工具
    const val foundation = "androidx.compose.foundation:foundation"
    const val foundationLayout = "androidx.compose.foundation:foundation-layout"
    const val material = "androidx.compose.material:material"
    const val materialIconsCore = "androidx.compose.material:material-icons-core"
    const val materialIconsExtended = "androidx.compose.material:material-icons-extended"
    const val materialRipple = "androidx.compose.material:material-ripple"
    const val material3 = "androidx.compose.material3:material3"
    const val material3WindowSizeClass = "androidx.compose.material3:material3-window-size-class"
    const val runtime = "androidx.compose.runtime:runtime"
    const val runtimeLiveData = "androidx.compose.runtime:runtime-livedata"
    const val rxjava2 = "androidx.compose.runtime:runtime-rxjava2"
    const val rxjava3 = "androidx.compose.runtime:runtime-rxjava3"
    const val saveable = "androidx.compose.runtime:runtime-saveable"
    const val ui = "androidx.compose.ui:ui"
    const val uiGeometry = "androidx.compose.ui:ui-geometry"
    const val uiGraphics = "androidx.compose.ui:ui-graphics"
    const val uiTest = "androidx.compose.ui:ui-test"
    const val uiTestJunit4 = "androidx.compose.ui:ui-test-junit4"
    const val uiTestManifest = "androidx.compose.ui:ui-test-manifest"
    const val uiText = "androidx.compose.ui:ui-text"
    const val uiTestGoogleFonts = "androidx.compose.ui:ui-text-google-fonts"
    const val uiTooling = "androidx.compose.ui:ui-tooling"
    const val uiToolingData = "androidx.compose.ui:ui-tooling-data"
    const val uiToolingPreview = "androidx.compose.ui:ui-tooling-preview"
    const val uiUnit = "androidx.compose.ui:ui-unit"
    const val uiUtil = "androidx.compose.ui:ui-util"
    const val uiViewbinding = "androidx.compose.ui:ui-viewbinding"

    //Compose其他
    private const val constraintLayoutComposeVersion = "1.0.1"
    private const val composeActivitiesVersion = ":1.5.1"
    private const val composeCompilerVersion = ":1.5.0"
    private const val composeNavigationVerson = "2.7.0"

    const val constraintLayout = "androidx.constraintlayout:constraintlayout-compose:${constraintLayoutComposeVersion}"
    const val activity = "androidx.activity:activity-compose:${composeActivitiesVersion}"
    //Jetpack Compose 编译器插件
    const val compiler = "androidx.compose.compiler:compiler:${composeCompilerVersion}"
    const val navigation = "androidx.navigation:navigation-compose:${composeNavigationVerson}"
}