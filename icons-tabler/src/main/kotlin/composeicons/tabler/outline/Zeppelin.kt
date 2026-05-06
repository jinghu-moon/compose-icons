package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Zeppelin: ImageVector
    get() {
        if (_zeppelin != null) return _zeppelin!!
        _zeppelin = tablerOutlineIcon(
            name = "Zeppelin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.5 4C18.194 4 22 6.686 22 10c0 3.314-3.806 6-8.5 6C11.37 16 8.916 15.074 6.136 13.223L4 15v-3.33C3.318 11.132 2.651 10.575 2 10 2.651 9.425 3.318 8.868 4 8.33v-3.33L6.135 6.778C8.915 4.926 11.37 4 13.5 4")
            addPathData("M10 15.5v4.5h6v-4")
        }
        return _zeppelin!!
    }

private var _zeppelin: ImageVector? = null
