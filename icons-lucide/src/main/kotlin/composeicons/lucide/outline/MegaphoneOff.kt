package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MegaphoneOff: ImageVector
    get() {
        if (_megaphoneOff != null) return _megaphoneOff!!
        _megaphoneOff = lucideOutlineIcon(
            name = "MegaphoneOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.636 6c2.823-.065 5.549-1.048 7.764-2.8 .303-.227 .708-.264 1.047-.094C20.786 3.275 21 3.621 21 4v11.344")
            addPathData("M14.378 14.357C13.272 14.091 12.137 13.971 11 14h-6C3.895 14 3 13.105 3 12v-4C3 6.895 3.895 6 5 6h1")
            addPathData("M2 2 22 22")
            addPathData("M6 14c0 2.596 .842 5.123 2.4 7.2 .663 .884 1.916 1.063 2.8 .4 .884-.663 1.063-1.916 .4-2.8C10.561 17.415 10 15.731 10 14")
            addPathData("M8 8v6")
        }
        return _megaphoneOff!!
    }

private var _megaphoneOff: ImageVector? = null
