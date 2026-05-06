package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HandGrab: ImageVector
    get() {
        if (_handGrab != null) return _handGrab!!
        _handGrab = tablerOutlineIcon(
            name = "HandGrab",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 11v-3.5C8 6.672 8.672 6 9.5 6 10.328 6 11 6.672 11 7.5v2.5")
            addPathData("M11 9.5v-3C11 5.672 11.672 5 12.5 5 13.328 5 14 5.672 14 6.5v3.5")
            addPathData("M14 7.5C14 6.672 14.672 6 15.5 6 16.328 6 17 6.672 17 7.5v2.5")
            addPathData("M17 9.5C17 8.672 17.672 8 18.5 8 19.328 8 20 8.672 20 9.5v4.5c0 3.314-2.686 6-6 6h-2 .208C10.19 20 8.306 18.986 7.196 17.3L7 17C6.688 16.521 5.593 14.612 3.714 11.272 3.316 10.564 3.553 9.668 4.25 9.25c.734-.441 1.674-.325 2.28 .28L8 11")
        }
        return _handGrab!!
    }

private var _handGrab: ImageVector? = null
