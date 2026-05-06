package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Typeface: ImageVector
    get() {
        if (_typeface != null) return _typeface!!
        _typeface = tablerOutlineIcon(
            name = "Typeface",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 5C3 3.895 3.895 3 5 3h14c1.105 0 2 .895 2 2v14c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-14")
            addPathData("M17 17c-1.105 0-2-.895-2-2v-8h-5C8.895 7 8 7.895 8 9")
            addPathData("M7 17c1.194-0 2.254-.764 2.632-1.897L10 14c.658-1.973 1.766-3.765 3.236-5.236L15 7")
            addPathData("M10 14h5")
        }
        return _typeface!!
    }

private var _typeface: ImageVector? = null
