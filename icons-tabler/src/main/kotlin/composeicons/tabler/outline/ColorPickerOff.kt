package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ColorPickerOff: ImageVector
    get() {
        if (_colorPickerOff != null) return _colorPickerOff!!
        _colorPickerOff = tablerOutlineIcon(
            name = "ColorPickerOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 7l6 6")
            addPathData("M12 8 15.699 4.301c.389-.381 1.011-.381 1.4 0l2.6 2.6c.381 .389 .381 1.011 0 1.4l-3.702 3.702M13.997 14.003l-6 6h-4v-4l6-6")
            addPathData("M3 3 21 21")
        }
        return _colorPickerOff!!
    }

private var _colorPickerOff: ImageVector? = null
