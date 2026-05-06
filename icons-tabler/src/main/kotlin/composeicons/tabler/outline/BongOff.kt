package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BongOff: ImageVector
    get() {
        if (_bongOff != null) return _bongOff!!
        _bongOff = tablerOutlineIcon(
            name = "BongOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 5v-2h4v6M14.5 10.5 17 8l2 2-2.5 2.5M16 16.005c-.003 2.496-1.847 4.608-4.321 4.947C9.206 21.291 6.862 19.754 6.186 17.351 5.511 14.948 6.712 12.415 9 11.416v-2.416")
            addPathData("M8 3h6")
            addPathData("M6.1 17h9.8")
            addPathData("M3 3 21 21")
        }
        return _bongOff!!
    }

private var _bongOff: ImageVector? = null
