package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ScanLine: ImageVector
    get() {
        if (_scanLine != null) return _scanLine!!
        _scanLine = lucideOutlineIcon(
            name = "ScanLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 7v-2C3 3.895 3.895 3 5 3h2")
            addPathData("M17 3h2c1.105 0 2 .895 2 2v2")
            addPathData("M21 17v2c0 1.105-.895 2-2 2h-2")
            addPathData("M7 21h-2C3.895 21 3 20.105 3 19v-2")
            addPathData("M7 12h10")
        }
        return _scanLine!!
    }

private var _scanLine: ImageVector? = null
