package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number10Small: ImageVector
    get() {
        if (_number10Small != null) return _number10Small!!
        _number10Small = tablerOutlineIcon(
            name = "Number10Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 8h1v8")
            addPathData("M14 10v4c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2v-4C18 8.895 17.105 8 16 8c-1.105 0-2 .895-2 2")
        }
        return _number10Small!!
    }

private var _number10Small: ImageVector? = null
