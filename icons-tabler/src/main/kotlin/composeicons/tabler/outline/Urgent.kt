package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Urgent: ImageVector
    get() {
        if (_urgent != null) return _urgent!!
        _urgent = tablerOutlineIcon(
            name = "Urgent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 16v-4C8 9.791 9.791 8 12 8c2.209 0 4 1.791 4 4v4")
            addPathData("M3 12h1M12 3v1M20 12h1M5.6 5.6l.7 .7M18.4 5.6l-.7 .7")
            addPathData("M6 17c0-.552 .448-1 1-1h10c.552 0 1 .448 1 1v2c0 .552-.448 1-1 1h-10C6.448 20 6 19.552 6 19v-2")
        }
        return _urgent!!
    }

private var _urgent: ImageVector? = null
