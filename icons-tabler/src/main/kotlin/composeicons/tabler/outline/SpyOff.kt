package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SpyOff: ImageVector
    get() {
        if (_spyOff != null) return _spyOff!!
        _spyOff = tablerOutlineIcon(
            name = "SpyOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 11h8M15 11h6")
            addPathData("M5 11v-4C5 6.429 5.16 5.895 5.437 5.44M8 4h8c1.657 0 3 1.343 3 3v4")
            addPathData("M4 17c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C10 15.343 8.657 14 7 14 5.343 14 4 15.343 4 17")
            addPathData("M14.88 14.877c-1.173 1.171-1.175 3.07-.004 4.243 1.171 1.173 3.07 1.175 4.243 .004M19.709 15.71c-.298-.623-.801-1.125-1.425-1.422")
            addPathData("M10 17h4")
            addPathData("M3 3 21 21")
        }
        return _spyOff!!
    }

private var _spyOff: ImageVector? = null
