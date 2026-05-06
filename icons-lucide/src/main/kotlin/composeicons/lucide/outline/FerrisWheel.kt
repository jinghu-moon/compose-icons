package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.FerrisWheel: ImageVector
    get() {
        if (_ferrisWheel != null) return _ferrisWheel!!
        _ferrisWheel = lucideOutlineIcon(
            name = "FerrisWheel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 12c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M12 2v4")
            addPathData("M6.8 15 3.3 17")
            addPathData("M20.7 7 17.2 9")
            addPathData("M6.8 9 3.3 7")
            addPathData("M20.7 17 17.2 15")
            addPathData("M9 22l3-8 3 8")
            addPathData("M8 22h8")
            addPathData("M18 18.7c2.781-2.488 3.739-6.434 2.408-9.92C19.076 5.294 15.732 2.992 12 2.992 8.268 2.992 4.924 5.294 3.592 8.78 2.261 12.266 3.219 16.212 6 18.7")
        }
        return _ferrisWheel!!
    }

private var _ferrisWheel: ImageVector? = null
