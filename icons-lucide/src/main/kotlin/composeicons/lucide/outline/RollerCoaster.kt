package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.RollerCoaster: ImageVector
    get() {
        if (_rollerCoaster != null) return _rollerCoaster!!
        _rollerCoaster = lucideOutlineIcon(
            name = "RollerCoaster",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 19v-14")
            addPathData("M10 19v-12.2")
            addPathData("M14 19v-7.8")
            addPathData("M18 5v4")
            addPathData("M18 19v-6")
            addPathData("M22 19v-10")
            addPathData("M2 19v-10C2 6.791 3.791 5 6 5c2 0 4 1.33 6 4 2 2.67 4 4 6 4 1.84-.002 3.442-1.259 3.881-3.046C22.32 8.166 21.482 6.31 19.852 5.457 18.222 4.603 16.219 4.971 15 6.35")
        }
        return _rollerCoaster!!
    }

private var _rollerCoaster: ImageVector? = null
