package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PaintRoller: ImageVector
    get() {
        if (_paintRoller != null) return _paintRoller!!
        _paintRoller = lucideOutlineIcon(
            name = "PaintRoller",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 2h12c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2h-12C2.895 8 2 7.105 2 6v-2C2 2.895 2.895 2 4 2Z")
            addPathData("M10 16v-2c0-1.105 .895-2 2-2h8c1.105 0 2-.895 2-2v-3C22 5.895 21.105 5 20 5h-2")
            addPathData("M9 16h2c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-2C8.448 22 8 21.552 8 21v-4c0-.552 .448-1 1-1Z")
        }
        return _paintRoller!!
    }

private var _paintRoller: ImageVector? = null
