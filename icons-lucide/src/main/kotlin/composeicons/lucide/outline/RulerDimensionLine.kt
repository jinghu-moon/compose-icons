package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.RulerDimensionLine: ImageVector
    get() {
        if (_rulerDimensionLine != null) return _rulerDimensionLine!!
        _rulerDimensionLine = lucideOutlineIcon(
            name = "RulerDimensionLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 15v-3")
            addPathData("M14 15v-3")
            addPathData("M18 15v-3")
            addPathData("M2 8v-4")
            addPathData("M22 6h-20")
            addPathData("M22 8v-4")
            addPathData("M6 15v-3")
            addPathData("M4 12h16c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2h-16C2.895 20 2 19.105 2 18v-4c0-1.105 .895-2 2-2Z")
        }
        return _rulerDimensionLine!!
    }

private var _rulerDimensionLine: ImageVector? = null
