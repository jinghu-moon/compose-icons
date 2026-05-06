package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Ad2: ImageVector
    get() {
        if (_ad2 != null) return _ad2!!
        _ad2 = tablerOutlineIcon(
            name = "Ad2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.933 5h-6.933v16h13v-8")
            addPathData("M14 17h-5")
            addPathData("M9 13h5v-4h-5v4")
            addPathData("M15 5v-2")
            addPathData("M18 6 20 4")
            addPathData("M19 9h2")
        }
        return _ad2!!
    }

private var _ad2: ImageVector? = null
