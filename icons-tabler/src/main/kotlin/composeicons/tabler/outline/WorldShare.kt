package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.WorldShare: ImageVector
    get() {
        if (_worldShare != null) return _worldShare!!
        _worldShare = tablerOutlineIcon(
            name = "WorldShare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.94 13.045C21.374 9.336 19.472 5.744 16.16 4.019 12.848 2.293 8.815 2.792 6.023 5.272 3.231 7.753 2.261 11.699 3.586 15.191c1.324 3.492 4.667 5.803 8.401 5.809")
            addPathData("M3.6 9h16.8")
            addPathData("M3.6 15h9.4")
            addPathData("M11.5 3c-3.437 5.508-3.437 12.492 0 18")
            addPathData("M12.5 3c1.919 3.074 2.805 6.681 2.529 10.294")
            addPathData("M16 22l5-5")
            addPathData("M21 21.5v-4.5h-4.5")
        }
        return _worldShare!!
    }

private var _worldShare: ImageVector? = null
