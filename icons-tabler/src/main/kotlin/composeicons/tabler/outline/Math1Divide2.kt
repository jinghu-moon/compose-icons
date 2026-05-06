package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Math1Divide2: ImageVector
    get() {
        if (_math1Divide2 != null) return _math1Divide2!!
        _math1Divide2 = tablerOutlineIcon(
            name = "Math1Divide2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 12h14")
            addPathData("M10 15h3c.552 0 1 .448 1 1v1c0 .552-.448 1-1 1h-2c-.552 0-1 .448-1 1v1c0 .552 .448 1 1 1h3")
            addPathData("M10 5 12 3v6")
        }
        return _math1Divide2!!
    }

private var _math1Divide2: ImageVector? = null
