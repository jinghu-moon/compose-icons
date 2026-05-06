package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ClearFormatting: ImageVector
    get() {
        if (_clearFormatting != null) return _clearFormatting!!
        _clearFormatting = tablerOutlineIcon(
            name = "ClearFormatting",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 15l4 4M21 15l-4 4")
            addPathData("M7 6v-1h11v1")
            addPathData("M7 19h4")
            addPathData("M13 5 9 19")
        }
        return _clearFormatting!!
    }

private var _clearFormatting: ImageVector? = null
