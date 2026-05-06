package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TableRowsSplit: ImageVector
    get() {
        if (_tableRowsSplit != null) return _tableRowsSplit!!
        _tableRowsSplit = lucideOutlineIcon(
            name = "TableRowsSplit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 10h2")
            addPathData("M15 22v-8")
            addPathData("M15 2v4")
            addPathData("M2 10h2")
            addPathData("M20 10h2")
            addPathData("M3 19h18")
            addPathData("M3 22v-6c0-1.105 .895-2 2-2h14c1.105 0 2 .895 2 2v6")
            addPathData("M3 2v2c0 1.105 .895 2 2 2h14c1.105 0 2-.895 2-2v-2")
            addPathData("M8 10h2")
            addPathData("M9 22v-8")
            addPathData("M9 2v4")
        }
        return _tableRowsSplit!!
    }

private var _tableRowsSplit: ImageVector? = null
