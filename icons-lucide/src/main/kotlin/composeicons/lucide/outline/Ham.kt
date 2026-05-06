package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Ham: ImageVector
    get() {
        if (_ham != null) return _ham!!
        _ham = lucideOutlineIcon(
            name = "Ham",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.144 21.144c4.079-4.079 5.083-9.69 2.242-12.53C12.546 5.773 6.935 6.777 2.856 10.856")
            addPathData("M13.144 21.144c1.705-1.705 .784-5.39-2.057-8.231C8.246 10.072 4.561 9.151 2.856 10.856c-1.705 1.705-.784 5.39 2.057 8.231 2.841 2.841 6.526 3.762 8.231 2.057")
            addPathData("M16.565 10.435 18.6 8.4c.868 .481 1.939 .403 2.728-.198 .789-.602 1.148-1.613 .915-2.578C22.009 4.659 21.227 3.924 20.25 3.75 20.059 2.788 19.323 2.027 18.368 1.803c-.955-.224-1.952 .132-2.551 .909-.598 .777-.687 1.832-.227 2.698L13.566 7.435")
            addPathData("M8.5 16.5l-1-1")
        }
        return _ham!!
    }

private var _ham: ImageVector? = null
