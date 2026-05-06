package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BadgesOff: ImageVector
    get() {
        if (_badgesOff != null) return _badgesOff!!
        _badgesOff = tablerOutlineIcon(
            name = "BadgesOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14.505 14.497 12 16 7 13v4l5 3 5-3")
            addPathData("M13.873 9.876 17 8v-4L12 7 9.508 5.505M7 7v1L9.492 9.495")
            addPathData("M3 3 21 21")
        }
        return _badgesOff!!
    }

private var _badgesOff: ImageVector? = null
