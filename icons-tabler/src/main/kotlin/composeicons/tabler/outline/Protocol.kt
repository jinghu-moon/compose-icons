package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Protocol: ImageVector
    get() {
        if (_protocol != null) return _protocol!!
        _protocol = tablerOutlineIcon(
            name = "Protocol",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 6 8 18")
            addPathData("M20 6 13 18")
            addPathData("M5 14v.015")
            addPathData("M5 10.015v.015")
        }
        return _protocol!!
    }

private var _protocol: ImageVector? = null
