package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoneybagEdit: ImageVector
    get() {
        if (_moneybagEdit != null) return _moneybagEdit!!
        _moneybagEdit = tablerOutlineIcon(
            name = "MoneybagEdit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9.5 3h5C15.328 3 16 3.672 16 4.5 16 6.433 14.433 8 12.5 8h-1C9.567 8 8 6.433 8 4.5 8 3.672 8.672 3 9.5 3")
            addPathData("M11 21h-3C5.791 21 4 19.209 4 17v-1C3.999 12.564 6.194 9.511 9.451 8.416c3.257-1.095 6.85 .012 8.925 2.751")
            addPathData("M18.42 15.61c.82-.82 2.15-.82 2.97 0 .82 .82 .82 2.15 0 2.97L18 22h-3v-3l3.42-3.39")
        }
        return _moneybagEdit!!
    }

private var _moneybagEdit: ImageVector? = null
