package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Firetruck: ImageVector
    get() {
        if (_firetruck != null) return _firetruck!!
        _firetruck = tablerOutlineIcon(
            name = "Firetruck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 17c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C7 15.895 6.105 15 5 15c-1.105 0-2 .895-2 2")
            addPathData("M15 17c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2")
            addPathData("M7 18h8M19 18h2v-6C21 9.239 18.761 7 16 7h-1l1.5 5h4.5")
            addPathData("M12 18v-11h3")
            addPathData("M3 17v-5h9")
            addPathData("M3 9 21 3")
            addPathData("M6 12v-4")
        }
        return _firetruck!!
    }

private var _firetruck: ImageVector? = null
