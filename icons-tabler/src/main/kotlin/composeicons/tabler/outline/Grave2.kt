package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Grave2: ImageVector
    get() {
        if (_grave2 != null) return _grave2!!
        _grave2 = tablerOutlineIcon(
            name = "Grave2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 16.17v-9.17C7 5.343 8.343 4 10 4h4c1.657 0 3 1.343 3 3v9.171")
            addPathData("M12 7v5")
            addPathData("M10 9h4")
            addPathData("M5 21v-2C5 17.343 6.343 16 8 16h8c1.657 0 3 1.343 3 3v2h-14")
        }
        return _grave2!!
    }

private var _grave2: ImageVector? = null
