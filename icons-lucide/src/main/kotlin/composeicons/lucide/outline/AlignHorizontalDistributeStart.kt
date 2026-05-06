package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.AlignHorizontalDistributeStart: ImageVector
    get() {
        if (_alignHorizontalDistributeStart != null) return _alignHorizontalDistributeStart!!
        _alignHorizontalDistributeStart = lucideOutlineIcon(
            name = "AlignHorizontalDistributeStart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 5h2c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-2C4.895 19 4 18.105 4 17v-10C4 5.895 4.895 5 6 5Z")
            addPathData("M16 7h2c1.105 0 2 .895 2 2v6c0 1.105-.895 2-2 2h-2c-1.105 0-2-.895-2-2v-6c0-1.105 .895-2 2-2Z")
            addPathData("M4 2v20")
            addPathData("M14 2v20")
        }
        return _alignHorizontalDistributeStart!!
    }

private var _alignHorizontalDistributeStart: ImageVector? = null
