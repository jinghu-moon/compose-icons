package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BotId: ImageVector
    get() {
        if (_botId != null) return _botId!!
        _botId = tablerOutlineIcon(
            name = "BotId",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 10.5C7 9.672 7.746 9 8.667 9h6.666C16.253 9 17 9.672 17 10.5v3C17 14.328 16.254 15 15.333 15h-6.666C7.747 15 7 14.328 7 13.5v-3")
            addPathData("M12 7v2")
            addPathData("M10 12v.01")
            addPathData("M14 12v.01")
            addPathData("M4 8v-2C4 4.895 4.895 4 6 4h2")
            addPathData("M4 16v2c0 1.105 .895 2 2 2h2")
            addPathData("M16 4h2c1.105 0 2 .895 2 2v2")
            addPathData("M16 20h2c1.105 0 2-.895 2-2v-2")
        }
        return _botId!!
    }

private var _botId: ImageVector? = null
