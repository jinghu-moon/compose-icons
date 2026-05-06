package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Tooltip: ImageVector
    get() {
        if (_tooltip != null) return _tooltip!!
        _tooltip = tablerOutlineIcon(
            name = "Tooltip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 18c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M12 13 10.293 11.293c-.187-.188-.442-.293-.707-.293h-2.586C5.895 11 5 10.105 5 9v-3C5 4.895 5.895 4 7 4h10c1.105 0 2 .895 2 2v3c0 1.105-.895 2-2 2h-2.586c-.265 0-.52 .105-.707 .293L12 13")
        }
        return _tooltip!!
    }

private var _tooltip: ImageVector? = null
