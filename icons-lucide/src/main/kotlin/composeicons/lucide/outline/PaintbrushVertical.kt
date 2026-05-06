package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PaintbrushVertical: ImageVector
    get() {
        if (_paintbrushVertical != null) return _paintbrushVertical!!
        _paintbrushVertical = lucideOutlineIcon(
            name = "PaintbrushVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 2v2")
            addPathData("M14 2v4")
            addPathData("M17 2c.552 0 1 .448 1 1v9h-12v-9C6 2.448 6.448 2 7 2Z")
            addPathData("M6 12c-.552 0-1 .448-1 1v1c0 1.105 .895 2 2 2h2c.552 0 1 .448 1 1v2.9c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2v-2.9c0-.552 .448-1 1-1h2c1.105 0 2-.895 2-2v-1c0-.552-.448-1-1-1")
        }
        return _paintbrushVertical!!
    }

private var _paintbrushVertical: ImageVector? = null
