package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Click: ImageVector
    get() {
        if (_click != null) return _click!!
        _click = tablerOutlineIcon(
            name = "Click",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 12h3")
            addPathData("M12 3v3")
            addPathData("M7.8 7.8 5.6 5.6")
            addPathData("M16.2 7.8 18.4 5.6")
            addPathData("M7.8 16.2 5.6 18.4")
            addPathData("M12 12l9 3-4 2-2 4L12 12")
        }
        return _click!!
    }

private var _click: ImageVector? = null
