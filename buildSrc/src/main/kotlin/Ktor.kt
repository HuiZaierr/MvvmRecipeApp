/**
 * TODO：用于Android和IOS的网络请求库
 */
object Ktor {
    private const val ktorVersion = "1.5.2"
    const val core = "io.ktor:ktor-client-core:${ktorVersion}"
    const val clientSerialization = "io.ktor:ktor-client-serialization:${ktorVersion}"
    const val android = "io.ktor:ktor-client-android:${ktorVersion}"
    const val ios = "io.ktor:ktor-client-ios:${ktorVersion}"
}