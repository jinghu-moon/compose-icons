package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Number33Small: ImageVector
    get() {
        if (_number33Small != null) return _number33Small!!
        _number33Small = tablerOutlineIcon(
            name = "Number33Small",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M14 8h2.5C17.328 8 18 8.672 18 9.5v1C18 11.328 17.328 12 16.5 12h-1.5 1.5c.828 0 1.5 .672 1.5 1.5v1C18 15.328 17.328 16 16.5 16h-2.5")
            addPathData("M6 8h2.5C9.328 8 10 8.672 10 9.5v1C10 11.328 9.328 12 8.5 12h-1.5 1.5c.828 0 1.5 .672 1.5 1.5v1C10 15.328 9.328 16 8.5 16h-2.5")
        }
        return _number33Small!!
    }

private var _number33Small: ImageVector? = null
