package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Confucius: ImageVector
    get() {
        if (_confucius != null) return _confucius!!
        _confucius = tablerOutlineIcon(
            name = "Confucius",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 19l3 2v-18")
            addPathData("M4 10 12 8")
            addPathData("M4 18 12 8")
            addPathData("M20 18 12 10 20 6")
        }
        return _confucius!!
    }

private var _confucius: ImageVector? = null
