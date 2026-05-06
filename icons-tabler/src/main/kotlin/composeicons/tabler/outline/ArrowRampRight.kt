package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowRampRight: ImageVector
    get() {
        if (_arrowRampRight != null) return _arrowRampRight!!
        _arrowRampRight = tablerOutlineIcon(
            name = "ArrowRampRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 3v8.707")
            addPathData("M11 7 7 3 3 7")
            addPathData("M17 14l4-4L17 6")
            addPathData("M7 21C7 14.925 11.925 10 18 10h3")
        }
        return _arrowRampRight!!
    }

private var _arrowRampRight: ImageVector? = null
