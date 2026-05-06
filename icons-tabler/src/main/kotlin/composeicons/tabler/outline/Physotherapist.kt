package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Physotherapist: ImageVector
    get() {
        if (_physotherapist != null) return _physotherapist!!
        _physotherapist = tablerOutlineIcon(
            name = "Physotherapist",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 15 8 12l4-2 4 1h3.5")
            addPathData("M3 19c0 .552 .448 1 1 1 .552 0 1-.448 1-1C5 18.448 4.552 18 4 18c-.552 0-1 .448-1 1")
            addPathData("M11 6c0 .552 .448 1 1 1 .552 0 1-.448 1-1C13 5.448 12.552 5 12 5c-.552 0-1 .448-1 1")
            addPathData("M12 17v-7")
            addPathData("M8 20h7l1-4 4-2")
            addPathData("M18 20h3")
        }
        return _physotherapist!!
    }

private var _physotherapist: ImageVector? = null
