package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number100Small: ImageVector
    get() {
        if (_number100Small != null) return _number100Small!!
        _number100Small = tablerOutlineIcon(
            name = "Number100Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 8h1v8")
            addPathData("M9 10v4c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2v-4C13 8.895 12.105 8 11 8 9.895 8 9 8.895 9 10")
            addPathData("M16 10v4c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2v-4C20 8.895 19.105 8 18 8c-1.105 0-2 .895-2 2")
        }
        return _number100Small!!
    }

private var _number100Small: ImageVector? = null
