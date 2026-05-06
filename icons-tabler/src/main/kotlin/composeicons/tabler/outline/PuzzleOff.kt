package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PuzzleOff: ImageVector
    get() {
        if (_puzzleOff != null) return _puzzleOff!!
        _puzzleOff = tablerOutlineIcon(
            name = "PuzzleOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8.18 4.171C8.57 3.315 9.505 2.846 10.424 3.046 11.344 3.245 12 4.059 12 5v1c0 .552 .448 1 1 1h3c.552 0 1 .448 1 1v3c0 .552 .448 1 1 1h1c.944-0 1.759 .659 1.957 1.581 .198 .923-.277 1.858-1.138 2.244M17 17v3c0 .552-.448 1-1 1h-3c-.552 0-1-.448-1-1v-1c0-1.105-.895-2-2-2-1.105 0-2 .895-2 2v1c0 .552-.448 1-1 1h-3C3.448 21 3 20.552 3 20v-3c0-.552 .448-1 1-1h1c1.105 0 2-.895 2-2C7 12.895 6.105 12 5 12h-1C3.448 12 3 11.552 3 11v-3C3 7.448 3.448 7 4 7h3")
            addPathData("M3 3 21 21")
        }
        return _puzzleOff!!
    }

private var _puzzleOff: ImageVector? = null
