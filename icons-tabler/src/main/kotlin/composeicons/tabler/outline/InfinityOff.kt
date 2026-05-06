package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.InfinityOff: ImageVector
    get() {
        if (_infinityOff != null) return _infinityOff!!
        _infinityOff = tablerOutlineIcon(
            name = "InfinityOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8.165 8.174C6.953 7.805 5.637 8.032 4.618 8.786 3.6 9.54 2.999 10.733 2.999 12c-0 1.618 .975 3.077 2.47 3.696 1.495 .619 3.216 .277 4.359-.868C10.716 14.023 11.451 13.065 12 12M13.677 9.653c.159-.166 .325-.326 .495-.481 1.069-1.07 2.649-1.446 4.085-.972 1.436 .474 2.482 1.718 2.702 3.214 .221 1.496-.421 2.989-1.659 3.858M15.78 15.809c-.606-.194-1.158-.531-1.608-.981C13.284 14.023 12.549 13.065 12 12")
            addPathData("M3 3 21 21")
        }
        return _infinityOff!!
    }

private var _infinityOff: ImageVector? = null
