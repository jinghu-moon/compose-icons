package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Scaling: ImageVector
    get() {
        if (_scaling != null) return _scaling!!
        _scaling = lucideOutlineIcon(
            name = "Scaling",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 3h-7C3.895 3 3 3.895 3 5v14c0 1.105 .895 2 2 2h14c1.105 0 2-.895 2-2v-7")
            addPathData("M14 15h-5v-5")
            addPathData("M16 3h5v5")
            addPathData("M21 3 9 15")
        }
        return _scaling!!
    }

private var _scaling: ImageVector? = null
