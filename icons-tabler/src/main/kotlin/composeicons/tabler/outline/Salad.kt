package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Salad: ImageVector
    get() {
        if (_salad != null) return _salad!!
        _salad = tablerOutlineIcon(
            name = "Salad",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 11h16c.552 0 1 .448 1 1v.5C21 14 18.483 18.073 17 19v1c0 .552-.448 1-1 1h-8C7.448 21 7 20.552 7 20v-1C5.313 17.946 3 14 3 12.5v-.5c0-.552 .448-1 1-1")
            addPathData("M18.5 11C18.851 9.983 18.926 8.764 19 7.286v-1.286h-2.256c-2.83 0-4.616 .804-5.64 2.076")
            addPathData("M5.255 11.008C5.115 10.347 5.029 9.675 5 9v-1h1.755c.98 0 1.801 .124 2.479 .35")
            addPathData("M8 8 9 4l4 2.5")
            addPathData("M13 11v-.5C13 9.119 11.881 8 10.5 8 9.119 8 8 9.119 8 10.5v.5")
        }
        return _salad!!
    }

private var _salad: ImageVector? = null
