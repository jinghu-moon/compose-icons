package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Barbell: ImageVector
    get() {
        if (_barbell != null) return _barbell!!
        _barbell = tablerOutlineIcon(
            name = "Barbell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 12h1")
            addPathData("M6 8h-2C3.448 8 3 8.448 3 9v6c0 .552 .448 1 1 1h2")
            addPathData("M6 7v10c0 .552 .448 1 1 1h1c.552 0 1-.448 1-1v-10C9 6.448 8.552 6 8 6h-1C6.448 6 6 6.448 6 7")
            addPathData("M9 12h6")
            addPathData("M15 7v10c0 .552 .448 1 1 1h1c.552 0 1-.448 1-1v-10C18 6.448 17.552 6 17 6h-1c-.552 0-1 .448-1 1")
            addPathData("M18 8h2c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-2")
            addPathData("M22 12h-1")
        }
        return _barbell!!
    }

private var _barbell: ImageVector? = null
