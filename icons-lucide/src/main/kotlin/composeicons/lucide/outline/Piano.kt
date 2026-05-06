package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Piano: ImageVector
    get() {
        if (_piano != null) return _piano!!
        _piano = lucideOutlineIcon(
            name = "Piano",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18.5 8C17.1 8 15.9 7.2 15.3 6 14.125 2.74 10.706 .866 7.326 1.629 3.945 2.391 1.662 5.551 2 9v11c0 1.105 .895 2 2 2h16c1.105 0 2-.895 2-2v-8.5C22 9.6 20.4 8 18.5 8")
            addPathData("M2 14h20")
            addPathData("M6 14v4")
            addPathData("M10 14v4")
            addPathData("M14 14v4")
            addPathData("M18 14v4")
        }
        return _piano!!
    }

private var _piano: ImageVector? = null
