package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Backspace: ImageVector
    get() {
        if (_backspace != null) return _backspace!!
        _backspace = tablerOutlineIcon(
            name = "Backspace",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 6c.552 0 1 .448 1 1v10c0 .552-.448 1-1 1h-11L4 13c-.509-.569-.509-1.431 0-2L9 6h11")
            addPathData("M12 10l4 4M16 10l-4 4")
        }
        return _backspace!!
    }

private var _backspace: ImageVector? = null
