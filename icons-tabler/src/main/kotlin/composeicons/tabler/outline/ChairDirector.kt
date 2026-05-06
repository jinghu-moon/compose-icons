package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChairDirector: ImageVector
    get() {
        if (_chairDirector != null) return _chairDirector!!
        _chairDirector = tablerOutlineIcon(
            name = "ChairDirector",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 21 18 12")
            addPathData("M6 12l12 9")
            addPathData("M5 12h14")
            addPathData("M6 3v9")
            addPathData("M18 3v9")
            addPathData("M6 8h12")
            addPathData("M6 5h12")
        }
        return _chairDirector!!
    }

private var _chairDirector: ImageVector? = null
