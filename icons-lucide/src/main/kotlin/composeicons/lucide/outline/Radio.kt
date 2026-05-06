package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Radio: ImageVector
    get() {
        if (_radio != null) return _radio!!
        _radio = lucideOutlineIcon(
            name = "Radio",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16.247 7.761c2.338 2.342 2.338 6.136 0 8.478")
            addPathData("M19.075 4.933c3.9 3.904 3.9 10.23 0 14.134")
            addPathData("M4.925 19.067C1.025 15.163 1.025 8.837 4.925 4.933")
            addPathData("M7.753 16.239C5.415 13.897 5.415 10.103 7.753 7.761")
            addPathData("M14 12c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
        }
        return _radio!!
    }

private var _radio: ImageVector? = null
