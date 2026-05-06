package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Train: ImageVector
    get() {
        if (_train != null) return _train!!
        _train = tablerOutlineIcon(
            name = "Train",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 13C21 9.13 17.63 6 11 6h-8")
            addPathData("M3 15h16c1.105 0 2-.895 2-2")
            addPathData("M3 6v5h17.5")
            addPathData("M3 11v4")
            addPathData("M8 11v-5")
            addPathData("M13 11v-4.5")
            addPathData("M3 19h18")
        }
        return _train!!
    }

private var _train: ImageVector? = null
