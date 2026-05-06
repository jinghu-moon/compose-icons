package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LightbulbOff: ImageVector
    get() {
        if (_lightbulbOff != null) return _lightbulbOff!!
        _lightbulbOff = lucideOutlineIcon(
            name = "LightbulbOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16.8 11.2C17.6 10.3 18 9.2 18 8 17.996 5.795 16.783 3.77 14.841 2.726 12.899 1.682 10.541 1.787 8.7 3")
            addPathData("M2 2 22 22")
            addPathData("M6.3 6.3c-.727 1.814-.249 3.888 1.2 5.2C8.2 12.2 8.8 13 9 14")
            addPathData("M9 18h6")
            addPathData("M10 22h4")
        }
        return _lightbulbOff!!
    }

private var _lightbulbOff: ImageVector? = null
