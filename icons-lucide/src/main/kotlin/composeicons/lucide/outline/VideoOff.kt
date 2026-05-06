package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.VideoOff: ImageVector
    get() {
        if (_videoOff != null) return _videoOff!!
        _videoOff = lucideOutlineIcon(
            name = "VideoOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.66 6h3.34c1.105 0 2 .895 2 2v2.5L21.248 7.438c.155-.09 .346-.091 .501-.002 .155 .089 .251 .255 .251 .434v8.196")
            addPathData("M16 16c0 1.105-.895 2-2 2h-10C2.895 18 2 17.105 2 16v-8C2 6.895 2.895 6 4 6h2")
            addPathData("M2 2 22 22")
        }
        return _videoOff!!
    }

private var _videoOff: ImageVector? = null
