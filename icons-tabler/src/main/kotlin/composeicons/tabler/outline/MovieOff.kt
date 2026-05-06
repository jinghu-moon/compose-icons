package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MovieOff: ImageVector
    get() {
        if (_movieOff != null) return _movieOff!!
        _movieOff = tablerOutlineIcon(
            name = "MovieOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 4h10c1.105 0 2 .895 2 2v10M19.408 19.42C19.046 19.779 18.549 20 18 20h-12C4.895 20 4 19.105 4 18v-12C4 5.461 4.213 4.972 4.56 4.612")
            addPathData("M8 8v12")
            addPathData("M16 4v8M16 16v4")
            addPathData("M4 8h4")
            addPathData("M4 16h4")
            addPathData("M4 12h8M16 12h4")
            addPathData("M16 8h4")
            addPathData("M3 3 21 21")
        }
        return _movieOff!!
    }

private var _movieOff: ImageVector? = null
