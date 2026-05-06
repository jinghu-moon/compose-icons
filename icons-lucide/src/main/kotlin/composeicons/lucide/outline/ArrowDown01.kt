package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ArrowDown01: ImageVector
    get() {
        if (_arrowDown01 != null) return _arrowDown01!!
        _arrowDown01 = lucideOutlineIcon(
            name = "ArrowDown01",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 16l4 4 4-4")
            addPathData("M7 20v-16")
            addPathData("M17 4h0c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2h0C15.895 10 15 9.105 15 8v-2c0-1.105 .895-2 2-2Z")
            addPathData("M17 20v-6h-2")
            addPathData("M15 20h4")
        }
        return _arrowDown01!!
    }

private var _arrowDown01: ImageVector? = null
