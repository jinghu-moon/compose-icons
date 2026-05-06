package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HomeHand: ImageVector
    get() {
        if (_homeHand != null) return _homeHand!!
        _homeHand = tablerOutlineIcon(
            name = "HomeHand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18 9 12 3 3 12h2v7c0 1.105 .895 2 2 2h3.5")
            addPathData("M9 21v-6c0-1.105 .895-2 2-2h2")
            addPathData("M16 17.5l-.585-.578c-.572-.502-1.428-.502-2 0-.477 .433-.551 1.112-.177 1.622L15 21c.37 .506 1.331 1 2 1h3c1.009 0 1.497-.683 1.622-1.593C21.874 19.469 22 18.667 22 18c0-1-.939-1.843-2-2h-1v-2.636C19 12.61 18.328 12 17.5 12 16.672 12 16 12.61 16 13.364v4.136")
        }
        return _homeHand!!
    }

private var _homeHand: ImageVector? = null
