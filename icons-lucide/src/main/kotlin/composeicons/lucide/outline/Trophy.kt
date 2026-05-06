package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Trophy: ImageVector
    get() {
        if (_trophy != null) return _trophy!!
        _trophy = lucideOutlineIcon(
            name = "Trophy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 14.66v1.626c-.008 .697-.377 1.339-.976 1.696C7.757 18.92 7.007 20.401 7 21.978")
            addPathData("M14 14.66v1.626c.008 .697 .377 1.339 .976 1.696 1.267 .938 2.017 2.419 2.024 3.996")
            addPathData("M18 9h1.5C20.881 9 22 7.881 22 6.5 22 5.119 20.881 4 19.5 4h-1.5")
            addPathData("M4 22h16")
            addPathData("M6 9c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-6C18 2.448 17.552 2 17 2h-10C6.448 2 6 2.448 6 3Z")
            addPathData("M6 9h-1.5C3.119 9 2 7.881 2 6.5 2 5.119 3.119 4 4.5 4h1.5")
        }
        return _trophy!!
    }

private var _trophy: ImageVector? = null
