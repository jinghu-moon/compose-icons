package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Notebook: ImageVector
    get() {
        if (_notebook != null) return _notebook!!
        _notebook = lucideOutlineIcon(
            name = "Notebook",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 6h4")
            addPathData("M2 10h4")
            addPathData("M2 14h4")
            addPathData("M2 18h4")
            addPathData("M6 2h12c1.105 0 2 .895 2 2v16c0 1.105-.895 2-2 2h-12C4.895 22 4 21.105 4 20v-16C4 2.895 4.895 2 6 2Z")
            addPathData("M16 2v20")
        }
        return _notebook!!
    }

private var _notebook: ImageVector? = null
