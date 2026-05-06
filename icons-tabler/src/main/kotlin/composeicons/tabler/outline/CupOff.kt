package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CupOff: ImageVector
    get() {
        if (_cupOff != null) return _cupOff!!
        _cupOff = tablerOutlineIcon(
            name = "CupOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 8h-3v3h6M15 11h4v-3h-7")
            addPathData("M17.5 11l-.323 2.154M16.652 16.651 16 21h-8L6.5 11")
            addPathData("M6 8v-1c0-.296 .064-.577 .18-.83M9 5h7c1.105 0 2 .895 2 2v1")
            addPathData("M15 5v-2")
            addPathData("M3 3 21 21")
        }
        return _cupOff!!
    }

private var _cupOff: ImageVector? = null
