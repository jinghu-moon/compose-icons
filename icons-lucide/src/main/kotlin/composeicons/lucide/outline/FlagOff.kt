package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FlagOff: ImageVector
    get() {
        if (_flagOff != null) return _flagOff!!
        _flagOff = lucideOutlineIcon(
            name = "FlagOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 16C13 16 11 14 8 14c-1.476 0-2.9 .544-4 1.528")
            addPathData("M2 2 22 22")
            addPathData("M4 22v-18")
            addPathData("M7.656 2h.344c3 0 5 2 7.333 2q2 0 3.067-.8c.303-.227 .708-.264 1.047-.094C19.786 3.275 20 3.621 20 4v10.347")
        }
        return _flagOff!!
    }

private var _flagOff: ImageVector? = null
