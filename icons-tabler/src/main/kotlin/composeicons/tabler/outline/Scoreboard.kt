package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Scoreboard: ImageVector
    get() {
        if (_scoreboard != null) return _scoreboard!!
        _scoreboard = tablerOutlineIcon(
            name = "Scoreboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 7C3 5.895 3.895 5 5 5h14c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-14C3.895 19 3 18.105 3 17v-10")
            addPathData("M12 5v2")
            addPathData("M12 10v1")
            addPathData("M12 14v1")
            addPathData("M12 18v1")
            addPathData("M7 3v2")
            addPathData("M17 3v2")
            addPathData("M15 10.5v3c0 .828 .672 1.5 1.5 1.5C17.328 15 18 14.328 18 13.5v-3C18 9.672 17.328 9 16.5 9 15.672 9 15 9.672 15 10.5")
            addPathData("M6 9h1.5C8.328 9 9 9.672 9 10.5 9 11.328 8.328 12 7.5 12h-.5 .5C8.328 12 9 12.672 9 13.5 9 14.328 8.328 15 7.5 15h-1.5")
        }
        return _scoreboard!!
    }

private var _scoreboard: ImageVector? = null
