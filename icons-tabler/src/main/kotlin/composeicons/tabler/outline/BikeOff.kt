package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BikeOff: ImageVector
    get() {
        if (_bikeOff != null) return _bikeOff!!
        _bikeOff = tablerOutlineIcon(
            name = "BikeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 18c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3C8 16.343 6.657 15 5 15 3.343 15 2 16.343 2 18")
            addPathData("M16.437 16.44c-.72 1.182-.538 2.704 .44 3.683 .979 .979 2.5 1.161 3.683 .44M22 18c0-1.657-1.343-3-3-3")
            addPathData("M12 19v-4L9 12l1.665-1.332M12.88 8.896 14 8l2 3h3")
            addPathData("M16 5c0 .552 .448 1 1 1 .552 0 1-.448 1-1C18 4.448 17.552 4 17 4c-.552 0-1 .448-1 1")
            addPathData("M3 3 21 21")
        }
        return _bikeOff!!
    }

private var _bikeOff: ImageVector? = null
