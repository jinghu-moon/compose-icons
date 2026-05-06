package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AirConditioning: ImageVector
    get() {
        if (_airConditioning != null) return _airConditioning!!
        _airConditioning = tablerOutlineIcon(
            name = "AirConditioning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 16c0 1.657-1.343 3-3 3")
            addPathData("M16 16c0 1.657 1.343 3 3 3")
            addPathData("M12 16v4")
            addPathData("M3 7C3 5.895 3.895 5 5 5h14c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2h-14C3.895 13 3 12.105 3 11v-4")
            addPathData("M7 13v-3C7 9.448 7.448 9 8 9h8c.552 0 1 .448 1 1v3")
        }
        return _airConditioning!!
    }

private var _airConditioning: ImageVector? = null
