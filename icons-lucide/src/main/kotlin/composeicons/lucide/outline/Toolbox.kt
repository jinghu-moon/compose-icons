package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Toolbox: ImageVector
    get() {
        if (_toolbox != null) return _toolbox!!
        _toolbox = lucideOutlineIcon(
            name = "Toolbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 12v4")
            addPathData("M16 6c.53 0 1.039 .211 1.414 .586l4 4c.375 .375 .586 .884 .586 1.414v7c0 1.105-.895 2-2 2h-16C2.895 21 2 20.105 2 19v-7c0-.53 .211-1.039 .586-1.414l4-4C6.961 6.211 7.47 6 8 6Z")
            addPathData("M16 6v-2C16 2.895 15.105 2 14 2h-4C8.895 2 8 2.895 8 4v2")
            addPathData("M2 14h20")
            addPathData("M8 12v4")
        }
        return _toolbox!!
    }

private var _toolbox: ImageVector? = null
