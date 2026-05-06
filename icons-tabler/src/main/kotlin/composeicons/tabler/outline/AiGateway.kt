package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AiGateway: ImageVector
    get() {
        if (_aiGateway != null) return _aiGateway!!
        _aiGateway = tablerOutlineIcon(
            name = "AiGateway",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6.5C4 7.881 5.119 9 6.5 9 7.881 9 9 7.881 9 6.5 9 5.119 7.881 4 6.5 4 5.119 4 4 5.119 4 6.5")
            addPathData("M15 6.5C15 7.881 16.119 9 17.5 9 18.881 9 20 7.881 20 6.5 20 5.119 18.881 4 17.5 4 16.119 4 15 5.119 15 6.5")
            addPathData("M15 17.5C15 18.881 16.119 20 17.5 20 18.881 20 20 18.881 20 17.5 20 16.119 18.881 15 17.5 15 16.119 15 15 16.119 15 17.5")
            addPathData("M4 17.5C4 18.881 5.119 20 6.5 20 7.881 20 9 18.881 9 17.5 9 16.119 7.881 15 6.5 15 5.119 15 4 16.119 4 17.5")
            addPathData("M8.5 15.5l7-7")
        }
        return _aiGateway!!
    }

private var _aiGateway: ImageVector? = null
