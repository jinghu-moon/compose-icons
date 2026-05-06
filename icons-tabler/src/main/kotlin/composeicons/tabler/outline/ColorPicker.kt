package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ColorPicker: ImageVector
    get() {
        if (_colorPicker != null) return _colorPicker!!
        _colorPicker = tablerOutlineIcon(
            name = "ColorPicker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 7l6 6")
            addPathData("M4 16 15.7 4.3c.389-.381 1.011-.381 1.4 0l2.6 2.6c.381 .389 .381 1.011 0 1.4L8 20h-4v-4")
        }
        return _colorPicker!!
    }

private var _colorPicker: ImageVector? = null
