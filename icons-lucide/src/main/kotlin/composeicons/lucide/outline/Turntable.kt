package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Turntable: ImageVector
    get() {
        if (_turntable != null) return _turntable!!
        _turntable = lucideOutlineIcon(
            name = "Turntable",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 12.01h.01")
            addPathData("M18 8v4c.001 1.404-.368 2.784-1.07 4")
            addPathData("M14 12c0 2.209-1.791 4-4 4C7.791 16 6 14.209 6 12 6 9.791 7.791 8 10 8c2.209 0 4 1.791 4 4Z")
            addPathData("M4 4h16c1.105 0 2 .895 2 2v12c0 1.105-.895 2-2 2h-16C2.895 20 2 19.105 2 18v-12C2 4.895 2.895 4 4 4Z")
        }
        return _turntable!!
    }

private var _turntable: ImageVector? = null
