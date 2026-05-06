package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ContainerOff: ImageVector
    get() {
        if (_containerOff != null) return _containerOff!!
        _containerOff = tablerOutlineIcon(
            name = "ContainerOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 4v.01")
            addPathData("M20 20v.01")
            addPathData("M20 16v.01")
            addPathData("M20 12v.01")
            addPathData("M20 8v.01")
            addPathData("M8.297 4.289C8.484 4.104 8.737 4 9 4h6c.552 0 1 .448 1 1v7M16 16v3c0 .552-.448 1-1 1h-6C8.448 20 8 19.552 8 19v-11")
            addPathData("M4 4v.01")
            addPathData("M4 20v.01")
            addPathData("M4 16v.01")
            addPathData("M4 12v.01")
            addPathData("M4 8v.01")
            addPathData("M3 3 21 21")
        }
        return _containerOff!!
    }

private var _containerOff: ImageVector? = null
