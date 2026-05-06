package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Import: ImageVector
    get() {
        if (_import != null) return _import!!
        _import = lucideOutlineIcon(
            name = "Import",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 3v12")
            addPathData("M8 11l4 4 4-4")
            addPathData("M8 5h-4C2.895 5 2 5.895 2 7v10c0 1.105 .895 2 2 2h16c1.105 0 2-.895 2-2v-10C22 5.895 21.105 5 20 5h-4")
        }
        return _import!!
    }

private var _import: ImageVector? = null
