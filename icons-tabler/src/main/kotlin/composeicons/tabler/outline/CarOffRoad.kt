package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CarOffRoad: ImageVector
    get() {
        if (_carOffRoad != null) return _carOffRoad!!
        _carOffRoad = tablerOutlineIcon(
            name = "CarOffRoad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 17h6")
            addPathData("M9 17c0 1.105-.895 2-2 2C5.895 19 5 18.105 5 17c0-1.105 .895-2 2-2 1.105 0 2 .895 2 2")
            addPathData("M19 17c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2")
            addPathData("M17 10 15 7")
            addPathData("M19 17h2v-5c0-1.105-.895-2-2-2h-5v2h-2.586c-.265-0-.52-.105-.707-.293L9.586 10.586C9.211 10.211 8.702 10 8.172 10h-4.172c-.552 0-1 .448-1 1v6h2")
        }
        return _carOffRoad!!
    }

private var _carOffRoad: ImageVector? = null
