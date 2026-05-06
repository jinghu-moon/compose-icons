package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HeadingOff: ImageVector
    get() {
        if (_headingOff != null) return _headingOff!!
        _headingOff = tablerOutlineIcon(
            name = "HeadingOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 12h5M16 12h1")
            addPathData("M7 7v12")
            addPathData("M17 5v8M17 17v2")
            addPathData("M15 19h4")
            addPathData("M15 5h4")
            addPathData("M5 19h4")
            addPathData("M3 3 21 21")
        }
        return _headingOff!!
    }

private var _headingOff: ImageVector? = null
