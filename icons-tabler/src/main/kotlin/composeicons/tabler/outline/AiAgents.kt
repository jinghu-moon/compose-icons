package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AiAgents: ImageVector
    get() {
        if (_aiAgents != null) return _aiAgents!!
        _aiAgents = tablerOutlineIcon(
            name = "AiAgents",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 19c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M3 19c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C7 17.895 6.105 17 5 17c-1.105 0-2 .895-2 2")
            addPathData("M10 5c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C14 3.895 13.105 3 12 3c-1.105 0-2 .895-2 2")
            addPathData("M6 5C6 4.448 5.552 4 5 4 4.448 4 4 4.448 4 5c0 .552 .448 1 1 1C5.552 6 6 5.552 6 5")
            addPathData("M18 5c0 .552 .448 1 1 1 .552 0 1-.448 1-1C20 4.448 19.552 4 19 4c-.552 0-1 .448-1 1")
            addPathData("M4 12c0 .552 .448 1 1 1 .552 0 1-.448 1-1C6 11.448 5.552 11 5 11c-.552 0-1 .448-1 1")
            addPathData("M11 12c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M18 12c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M11 19c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
        }
        return _aiAgents!!
    }

private var _aiAgents: ImageVector? = null
