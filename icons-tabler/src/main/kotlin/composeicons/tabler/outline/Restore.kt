package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Restore: ImageVector
    get() {
        if (_restore != null) return _restore!!
        _restore = tablerOutlineIcon(
            name = "Restore",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3.06 13c.508 4.541 4.339 7.981 8.909 7.999 4.57 .018 8.428-3.391 8.972-7.929C21.484 8.534 18.542 4.309 14.097 3.246 9.653 2.184 5.117 4.62 3.55 8.913")
            addPathData("M3 4.001v5h5")
            addPathData("M11 12c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
        }
        return _restore!!
    }

private var _restore: ImageVector? = null
