package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Radar: ImageVector
    get() {
        if (_radar != null) return _radar!!
        _radar = lucideOutlineIcon(
            name = "Radar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19.07 4.93C15.868 1.725 10.912 1.073 6.99 3.34")
            addPathData("M4 6h.01")
            addPathData("M2.29 9.62c-1.029 4.191 .747 8.57 4.405 10.86 3.658 2.29 8.372 1.975 11.693-.781 3.321-2.756 4.499-7.332 2.922-11.349")
            addPathData("M16.24 7.76C14.672 6.183 12.36 5.602 10.233 6.252 8.106 6.901 6.513 8.673 6.093 10.857c-.42 2.184 .402 4.421 2.137 5.813")
            addPathData("M12 18h.01")
            addPathData("M17.99 11.66c.11 1.93-.716 3.795-2.22 5.01")
            addPathData("M14 12c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2Z")
            addPathData("M13.41 10.59 19.07 4.93")
        }
        return _radar!!
    }

private var _radar: ImageVector? = null
