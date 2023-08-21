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
    操作符：
        ```
        map：对 Flow 中的每个元素进行转换操作。
        filter：对 Flow 中的元素进行过滤操作。
        reduce：对 Flow 中的元素进行累加操作。
        take：从 Flow 中获取指定数量的元素。
        distinctUntilChanged：去除 Flow 中连续重复的元素。
        zip：将两个 Flow 中的元素进行配对操作。
        flatMapConcat：将 Flow 中的每个元素转换为另一个 Flow，并将这些 Flow 连接起来。
        flatMapMerge：将 Flow 中的每个元素转换为另一个 Flow，并将这些 Flow 合并起来。
        flatMapLatest：将 Flow 中的每个元素转换为另一个 Flow，并只保留最新的 Flow 中的元素。
        catch：捕获 Flow 中的异常，并返回一个新的 Flow。
        onCompletion：在 Flow 完成时执行一些操作。
        onEach：对 Flow 中的每个元素执行一些操作，不会改变元素的值。
        flowOn：指定 Flow 执行的线程。
        buffer：缓存 Flow 中的元素，以便更快地处理它们。
        ```