package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.IconsOff: ImageVector
    get() {
        if (_iconsOff != null) return _iconsOff!!
        _iconsOff = tablerOutlineIcon(
            name = "IconsOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4.01 4.041C3.018 5.045 2.727 6.547 3.271 7.849 3.815 9.152 5.089 10 6.5 10 7.475 10 8.365 9.643 9 9M9.958 5.956C9.721 4.459 8.549 3.284 7.053 3.044")
            addPathData("M2.5 21h8l-4-7-4 7")
            addPathData("M14 3l7 7")
            addPathData("M14 10 21 3")
            addPathData("M18 14h3v3M21 21h-7v-7")
            addPathData("M3 3 21 21")
        }
        return _iconsOff!!
    }

private var _iconsOff: ImageVector? = null
