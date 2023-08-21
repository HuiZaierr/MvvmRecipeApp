# 1.配置 build
https://developer.android.com/studio/build?hl=zh-cn</br>

# 2.Compose 与 Kotlin 的兼容性对应关系
https://developer.android.com/jetpack/androidx/releases/compose-kotlin?hl=zh-cn</br>

# 3.修饰符列表
https://developer.android.com/jetpack/compose/modifiers-list?hl=zh-cn</br>

# 4.Bom映射表
https://developer.android.google.cn/jetpack/compose/bom/bom-mapping?hl=zh-cn</br>

# 5.coil网络图片以及gif
https://coil-kt.github.io/coil/compose/</br>


Flow流：它分为冷流和热流
    冷流是指每次收集时都会重新执行流的操作，即每个收集器都会获得自己的流数据。这意味着，如果有多个收集器，每个收集器都会执行一次流的操作。冷流适用于处理静态数据，或者需要多次处理相同数据的场景。
    热流是指在流的生命周期内，数据会持续地产生并且被推送给所有的收集器。这意味着，如果有多个收集器，它们都会收到相同的数据。热流适用于处理动态数据，或者需要实时处理数据的场景。
        如果你想要创建热流，可以使用 SharedFlow 或 StateFlow。
            SharedFlow 是一种可变的热流，它可以通过 emit() 函数向流中添加元素。
            StateFlow 是一种不可变的热流，它可以通过 value 属性来获取当前的流数据，并且可以通过 emit() 函数来更新流数据。