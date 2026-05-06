package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BowArrow: ImageVector
    get() {
        if (_bowArrow != null) return _bowArrow!!
        _bowArrow = lucideOutlineIcon(
            name = "BowArrow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 3h4v4")
            addPathData("M18.575 11.082c1.424 2.785 1.796 5.99 1.048 9.027-.097 .399-.396 .717-.788 .84-.392 .122-.819 .03-1.126-.243L14 17")
            addPathData("M7 10 3.29 6.29C3.019 5.983 2.929 5.556 3.052 5.166c.123-.391 .441-.689 .838-.786 3.038-.748 6.244-.375 9.03 1.05")
            addPathData("M7 14c-.453-.001-.887 .179-1.207 .5L3.147 17.146c-.143 .143-.186 .358-.109 .545 .077 .187 .26 .309 .462 .309h1.5c.552 0 1 .448 1 1v1.5c-0 .203 .121 .385 .309 .463 .187 .078 .402 .035 .545-.109L9.5 18.207c.321-.32 .501-.754 .5-1.207v-2c0-.552-.448-1-1-1Z")
            addPathData("M9.707 14.293 21 3")
        }
        return _bowArrow!!
    }

private var _bowArrow: ImageVector? = null
