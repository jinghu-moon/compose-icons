package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Matchstick: ImageVector
    get() {
        if (_matchstick != null) return _matchstick!!
        _matchstick = tablerOutlineIcon(
            name = "Matchstick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 21 17 12")
            addPathData("M16 12c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M17 3l3.62 7.29c.713 1.515 .408 3.314-.764 4.51-1.361 1.386-3.52 1.595-5.121 .494C13.135 14.194 12.556 12.103 13.363 10.336L17 3")
        }
        return _matchstick!!
    }

private var _matchstick: ImageVector? = null
