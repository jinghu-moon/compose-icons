package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TableColumnsSplit: ImageVector
    get() {
        if (_tableColumnsSplit != null) return _tableColumnsSplit!!
        _tableColumnsSplit = lucideOutlineIcon(
            name = "TableColumnsSplit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 14v2")
            addPathData("M14 20v2")
            addPathData("M14 2v2")
            addPathData("M14 8v2")
            addPathData("M2 15h8")
            addPathData("M2 3h6c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-6")
            addPathData("M2 9h8")
            addPathData("M22 15h-4")
            addPathData("M22 3h-2c-1.105 0-2 .895-2 2v14c0 1.105 .895 2 2 2h2")
            addPathData("M22 9h-4")
            addPathData("M5 3v18")
        }
        return _tableColumnsSplit!!
    }

private var _tableColumnsSplit: ImageVector? = null
