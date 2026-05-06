package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.EggOff: ImageVector
    get() {
        if (_eggOff != null) return _eggOff!!
        _eggOff = tablerOutlineIcon(
            name = "EggOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17.927 17.934C16.716 19.792 14.576 20.887 12 21 7.8 21 5 18.237 5 14.083 5 11.515 5.753 8.943 6.91 6.925")
            addPathData("M8.642 4.628C9.676 3.608 10.838 2.998 12 3c3.5 .007 7 5.545 7 11.083 0 .298-.015 .587-.045 .868")
            addPathData("M3 3 21 21")
        }
        return _eggOff!!
    }

private var _eggOff: ImageVector? = null
