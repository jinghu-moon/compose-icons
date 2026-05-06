package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ShirtSport: ImageVector
    get() {
        if (_shirtSport != null) return _shirtSport!!
        _shirtSport = tablerOutlineIcon(
            name = "ShirtSport",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 4l6 2v5h-3v8c0 .552-.448 1-1 1h-10C6.448 20 6 19.552 6 19v-8h-3v-5L9 4c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3")
            addPathData("M10.5 11h2.5l-1.5 5")
        }
        return _shirtSport!!
    }

private var _shirtSport: ImageVector? = null
