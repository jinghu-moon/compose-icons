package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BoomBox: ImageVector
    get() {
        if (_boomBox != null) return _boomBox!!
        _boomBox = lucideOutlineIcon(
            name = "BoomBox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 9v-4C4 3.895 4.895 3 6 3h12c1.105 0 2 .895 2 2v4")
            addPathData("M8 8v1")
            addPathData("M12 8v1")
            addPathData("M16 8v1")
            addPathData("M4 9h16c1.105 0 2 .895 2 2v8c0 1.105-.895 2-2 2h-16C2.895 21 2 20.105 2 19v-8C2 9.895 2.895 9 4 9Z")
            addPathData("M10 15c0 1.105-.895 2-2 2C6.895 17 6 16.105 6 15c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M18 15c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
        }
        return _boomBox!!
    }

private var _boomBox: ImageVector? = null
