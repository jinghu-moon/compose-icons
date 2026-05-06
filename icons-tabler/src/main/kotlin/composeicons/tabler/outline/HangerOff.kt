package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HangerOff: ImageVector
    get() {
        if (_hangerOff != null) return _hangerOff!!
        _hangerOff = tablerOutlineIcon(
            name = "HangerOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 6C14 4.895 13.105 4 12 4c-1.105 0-2 .895-2 2M16.506 12.506l3.461 1.922c.635 .353 1.029 1.022 1.029 1.749v.823M18.996 19h-14C3.891 19 2.996 18.105 2.996 17v-.823c-0-.727 .394-1.396 1.029-1.749l6.673-3.707")
            addPathData("M3 3 21 21")
        }
        return _hangerOff!!
    }

private var _hangerOff: ImageVector? = null
