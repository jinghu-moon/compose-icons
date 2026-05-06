package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TypographyOff: ImageVector
    get() {
        if (_typographyOff != null) return _typographyOff!!
        _typographyOff = tablerOutlineIcon(
            name = "TypographyOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 20h3")
            addPathData("M14 20h6")
            addPathData("M6.9 15h6.9")
            addPathData("M13 13l3 7")
            addPathData("M5 20 9.09 9.094")
            addPathData("M10.181 6.183 11 4h2l3.904 8.924")
            addPathData("M3 3 21 21")
        }
        return _typographyOff!!
    }

private var _typographyOff: ImageVector? = null
