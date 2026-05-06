package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MapExclamation: ImageVector
    get() {
        if (_mapExclamation != null) return _mapExclamation!!
        _mapExclamation = tablerOutlineIcon(
            name = "MapExclamation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 20 9 17 3 20v-13L9 4l6 3L21 4v8.5")
            addPathData("M9 4v13")
            addPathData("M15 7v13")
            addPathData("M19 16v3")
            addPathData("M19 22v.01")
        }
        return _mapExclamation!!
    }

private var _mapExclamation: ImageVector? = null
