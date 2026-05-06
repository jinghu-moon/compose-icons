package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SignpostBig: ImageVector
    get() {
        if (_signpostBig != null) return _signpostBig!!
        _signpostBig = lucideOutlineIcon(
            name = "SignpostBig",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 9h-6L2 7 4 5h6")
            addPathData("M14 5h6l2 2L20 9h-6")
            addPathData("M10 22v-18c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2v18")
            addPathData("M8 22h8")
        }
        return _signpostBig!!
    }

private var _signpostBig: ImageVector? = null
