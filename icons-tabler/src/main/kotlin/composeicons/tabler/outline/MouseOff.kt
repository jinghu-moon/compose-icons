package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MouseOff: ImageVector
    get() {
        if (_mouseOff != null) return _mouseOff!!
        _mouseOff = tablerOutlineIcon(
            name = "MouseOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7.733 3.704C8.4 3.244 9.19 2.999 10 3h4c2.209 0 4 1.791 4 4v7M17.9 17.895C17.483 19.713 15.865 21.001 14 21h-4C7.791 21 6 19.209 6 17v-10c0-.3 .033-.593 .096-.874")
            addPathData("M12 7v1")
            addPathData("M3 3 21 21")
        }
        return _mouseOff!!
    }

private var _mouseOff: ImageVector? = null
