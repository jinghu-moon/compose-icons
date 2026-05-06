package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Binary: ImageVector
    get() {
        if (_binary != null) return _binary!!
        _binary = lucideOutlineIcon(
            name = "Binary",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 14h0c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2h0c-1.105 0-2-.895-2-2v-2c0-1.105 .895-2 2-2Z")
            addPathData("M8 4h0c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2h0C6.895 10 6 9.105 6 8v-2C6 4.895 6.895 4 8 4Z")
            addPathData("M6 20h4")
            addPathData("M14 10h4")
            addPathData("M6 14h2v6")
            addPathData("M14 4h2v6")
        }
        return _binary!!
    }

private var _binary: ImageVector? = null
