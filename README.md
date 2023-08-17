# MvvmRecipeApp

### 注解：
@Preview：它用于预览函数
注意：该注解必须用于不接受参数的可组合函数

### 布局：
1. Colum：可让您垂直排列元素，相当于LinearLayout设置了android:orientation="vertical",但是不能滚动
2. Row：可让您水平排列元素，相当于LinearLayout设置了android:orientation="horizontal",但是不能滚动
3. Surface：用于装饰其他组件的组件，可以用于添加阴影、边框和背景色等效果
4. Box：它就是一个盒子,通过修饰符设置大小，背景等
5. Spacer：间隔符，用于填充一个空白的位置


### 修饰符：
**https://developer.android.com/jetpack/compose/modifiers-list?hl=zh-cn</br>**
1. size：设置组件的实际大小
2. align：设置其对齐方式
   1. 在一个Column列表中，子元素只能水平对齐
   2. 在一个Row行表中，子元素只能垂直对齐
   3. Column中想要将其子元素进行居中或者其他方式对齐只能通过在父组件上进行设置verticalArrangement
   4. Row中想要将其子元素进行居中或者其他方式对齐只能通过在父组件上进行设置horizontalArrangement
3. border：设置边框
4. requiredSize：设置组件所需的最小尺寸
5. padding：设置组件周围留出空间（padding 修饰符应用在 clickable后面否则无效）
6. paddingFromBaseline：可在基线的上下添加padding
7. offset：设置组件相对于其容易左上角偏移。可设置X和Y
8. fillMaxSize：组件的大小设置为其容器的最大尺寸（最大宽度和最大高度）
9. fillMaxWidth：设置最简最大宽度
10. fillMaxWidth：设置最简最大高度
11. matchParentSize：只能用于Spacer中，使某个子项与父项 Box 同样大
12. height：设置高度
13. width：设置宽度
14. weight：设置权重，单位为float，只能用于Row中
15. clip(CircleShape)：将图像剪辑成圆形
16. clickable：设置点击


### 存储可变状态
1. remember：用于在组件中存储可变状态。
2. mutableStateOf：用于创建一个可变状态。它返回一个包含可变状态的对象，可以在组件中使用。当可变状态的值发生变化时，Compose 会自动触发重组过程，重新计算组件的布局和绘制
3. mutableStateListOf：用于创建一个可变的列表。它返回一个包含可变列表的对象，可以在组件中使用。当列表的内容发生变化时，Compose 会自动触发重组过程，重新计算组件的布局和绘制

