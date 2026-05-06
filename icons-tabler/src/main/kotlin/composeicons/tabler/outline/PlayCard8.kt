package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlayCard8: ImageVector
    get() {
        if (_playCard8 != null) return _playCard8!!
        _playCard8 = tablerOutlineIcon(
            name = "PlayCard8",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M19 5v14c0 1.105-.895 2-2 2h-10C5.895 21 5 20.105 5 19v-14C5 3.895 5.895 3 7 3h10c1.105 0 2 .895 2 2")
            addPathData("M8 6h.01")
            addPathData("M16 18h.01")
            addPathData("M12 12h-1c-.552 0-1-.448-1-1v-1c0-.552 .448-1 1-1h2c.552 0 1 .448 1 1v1c0 .552-.448 1-1 1h-1")
            addPathData("M12 12h-1c-.552 0-1 .448-1 1v1c0 .552 .448 1 1 1h2c.552 0 1-.448 1-1v-1c0-.552-.448-1-1-1")
        }
        return _playCard8!!
    }

private var _playCard8: ImageVector? = null
