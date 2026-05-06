package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AirConditioningDisabled: ImageVector
    get() {
        if (_airConditioningDisabled != null) return _airConditioningDisabled!!
        _airConditioningDisabled = tablerOutlineIcon(
            name = "AirConditioningDisabled",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 10C3 8.895 3.895 8 5 8h14c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2h-14C3.895 16 3 15.105 3 14v-4")
            addPathData("M7 16v-3c0-.552 .448-1 1-1h8c.552 0 1 .448 1 1v3")
        }
        return _airConditioningDisabled!!
    }

private var _airConditioningDisabled: ImageVector? = null
