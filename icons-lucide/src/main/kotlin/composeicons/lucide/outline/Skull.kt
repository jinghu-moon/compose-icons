package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Skull: ImageVector
    get() {
        if (_skull != null) return _skull!!
        _skull = lucideOutlineIcon(
            name = "Skull",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.5 17 12 16l-.5 1h1Z")
            addPathData("M15 22c.552 0 1-.448 1-1v-1c.769-0 1.469-.442 1.802-1.135 .333-.693 .239-1.515-.242-2.115 2.344-2.266 3.079-5.728 1.857-8.751C18.195 4.977 15.26 2.998 12 2.998 8.74 2.998 5.805 4.977 4.583 7.999c-1.222 3.023-.488 6.485 1.857 8.751-.48 .6-.574 1.422-.242 2.115C6.531 19.558 7.231 20 8 20v1c0 .552 .448 1 1 1Z")
            addPathData("M16 12c0 .552-.448 1-1 1-.552 0-1-.448-1-1 0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
            addPathData("M10 12c0 .552-.448 1-1 1C8.448 13 8 12.552 8 12c0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
        }
        return _skull!!
    }

private var _skull: ImageVector? = null
