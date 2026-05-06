package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Umbrella2: ImageVector
    get() {
        if (_umbrella2 != null) return _umbrella2!!
        _umbrella2 = tablerOutlineIcon(
            name = "Umbrella2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5.343 7.343c3.124-3.124 8.19-3.124 11.314 0 3.124 3.124 3.124 8.19 0 11.314L5.343 7.343")
            addPathData("M10.828 13.34 6.586 17.583c-.52 .502-.728 1.246-.545 1.945 .183 .699 .729 1.245 1.428 1.428 .699 .183 1.443-.025 1.945-.545")
        }
        return _umbrella2!!
    }

private var _umbrella2: ImageVector? = null
