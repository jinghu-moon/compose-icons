package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.AlignCenterHorizontal: ImageVector
    get() {
        if (_alignCenterHorizontal != null) return _alignCenterHorizontal!!
        _alignCenterHorizontal = lucideOutlineIcon(
            name = "AlignCenterHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 12h20")
            addPathData("M10 16v4c0 1.105-.895 2-2 2h-2C4.895 22 4 21.105 4 20v-4")
            addPathData("M10 8v-4C10 2.895 9.105 2 8 2h-2C4.895 2 4 2.895 4 4v4")
            addPathData("M20 16v1c0 1.105-.895 2-2 2h-2c-1.105 0-2-.895-2-2v-1")
            addPathData("M14 8v-1c0-1.1 .9-2 2-2h2c1.105 0 2 .895 2 2v1")
        }
        return _alignCenterHorizontal!!
    }

private var _alignCenterHorizontal: ImageVector? = null
