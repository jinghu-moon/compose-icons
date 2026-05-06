package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PerspectiveOff: ImageVector
    get() {
        if (_perspectiveOff != null) return _perspectiveOff!!
        _perspectiveOff = tablerOutlineIcon(
            name = "PerspectiveOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8.511 4.502l9.63 1.375c.493 .07 .859 .492 .859 .99v8.133M18.141 18.123 6.141 19.837c-.287 .041-.577-.045-.796-.235C5.126 19.412 5 19.137 5 18.847v-13.694c0-.046 .004-.092 .01-.137")
            addPathData("M3 3 21 21")
        }
        return _perspectiveOff!!
    }

private var _perspectiveOff: ImageVector? = null
