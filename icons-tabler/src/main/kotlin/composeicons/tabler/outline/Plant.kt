package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Plant: ImageVector
    get() {
        if (_plant != null) return _plant!!
        _plant = tablerOutlineIcon(
            name = "Plant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 15h10v4c0 1.105-.895 2-2 2h-6C7.895 21 7 20.105 7 19v-4")
            addPathData("M12 9C12 5.686 9.314 3 6 3h-3v2c0 3.314 2.686 6 6 6h3")
            addPathData("M12 11C12 7.686 14.686 5 18 5h3v1c0 3.314-2.686 6-6 6h-3")
            addPathData("M12 15v-6")
        }
        return _plant!!
    }

private var _plant: ImageVector? = null
