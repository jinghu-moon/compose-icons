package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Tournament: ImageVector
    get() {
        if (_tournament != null) return _tournament!!
        _tournament = tablerOutlineIcon(
            name = "Tournament",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 4c0 1.105 .895 2 2 2C5.105 6 6 5.105 6 4 6 2.895 5.105 2 4 2 2.895 2 2 2.895 2 4")
            addPathData("M18 10c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C22 8.895 21.105 8 20 8c-1.105 0-2 .895-2 2")
            addPathData("M2 12c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C6 10.895 5.105 10 4 10c-1.105 0-2 .895-2 2")
            addPathData("M2 20c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C6 18.895 5.105 18 4 18c-1.105 0-2 .895-2 2")
            addPathData("M6 12h3c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-3")
            addPathData("M6 4h7c.552 0 1 .448 1 1v10c0 .552-.448 1-1 1h-2")
            addPathData("M14 10h4")
        }
        return _tournament!!
    }

private var _tournament: ImageVector? = null
