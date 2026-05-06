package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.StairsDown: ImageVector
    get() {
        if (_stairsDown != null) return _stairsDown!!
        _stairsDown = tablerOutlineIcon(
            name = "StairsDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 21h-5v-5h-5v-5h-5v-5h-5")
            addPathData("M18 3v7")
            addPathData("M15 7l3 3L21 7")
        }
        return _stairsDown!!
    }

private var _stairsDown: ImageVector? = null
