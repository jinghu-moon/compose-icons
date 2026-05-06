package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RefreshOff: ImageVector
    get() {
        if (_refreshOff != null) return _refreshOff!!
        _refreshOff = tablerOutlineIcon(
            name = "RefreshOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 11C19.651 8.488 18.145 6.284 15.932 5.046 13.718 3.808 11.052 3.678 8.729 4.695M6.319 6.319C5.538 7.081 4.919 7.993 4.5 9M4 5v4h4")
            addPathData("M4 13c.42 3.024 2.506 5.556 5.394 6.547 2.888 .991 6.088 .274 8.277-1.856M20 16v-1h-1")
            addPathData("M3 3 21 21")
        }
        return _refreshOff!!
    }

private var _refreshOff: ImageVector? = null
