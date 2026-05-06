package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Microwave: ImageVector
    get() {
        if (_microwave != null) return _microwave!!
        _microwave = lucideOutlineIcon(
            name = "Microwave",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 4h16c1.105 0 2 .895 2 2v11c0 1.105-.895 2-2 2h-16C2.895 19 2 18.105 2 17v-11C2 4.895 2.895 4 4 4Z")
            addPathData("M7 8h6c.552 0 1 .448 1 1v5c0 .552-.448 1-1 1h-6C6.448 15 6 14.552 6 14v-5C6 8.448 6.448 8 7 8Z")
            addPathData("M18 8v7")
            addPathData("M6 19v2")
            addPathData("M18 19v2")
        }
        return _microwave!!
    }

private var _microwave: ImageVector? = null
