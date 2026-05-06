package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TramFront: ImageVector
    get() {
        if (_tramFront != null) return _tramFront!!
        _tramFront = lucideOutlineIcon(
            name = "TramFront",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 3h12c1.105 0 2 .895 2 2v12c0 1.105-.895 2-2 2h-12C4.895 19 4 18.105 4 17v-12C4 3.895 4.895 3 6 3Z")
            addPathData("M4 11h16")
            addPathData("M12 3v8")
            addPathData("M8 19 6 22")
            addPathData("M18 22 16 19")
            addPathData("M8 15h.01")
            addPathData("M16 15h.01")
        }
        return _tramFront!!
    }

private var _tramFront: ImageVector? = null
