package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CarSuspension: ImageVector
    get() {
        if (_carSuspension != null) return _carSuspension!!
        _carSuspension = tablerOutlineIcon(
            name = "CarSuspension",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 22C10.343 22 9 20.657 9 19c0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3")
            addPathData("M12 16v-12")
            addPathData("M13 2h-2v2h2v-2")
            addPathData("M9 11l6-1")
            addPathData("M9 14l6-1")
            addPathData("M9 8 15 7")
        }
        return _carSuspension!!
    }

private var _carSuspension: ImageVector? = null
