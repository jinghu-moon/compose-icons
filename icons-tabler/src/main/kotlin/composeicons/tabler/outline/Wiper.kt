package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Wiper: ImageVector
    get() {
        if (_wiper != null) return _wiper!!
        _wiper = tablerOutlineIcon(
            name = "Wiper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11 18c0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1-.552 0-1 .448-1 1")
            addPathData("M3 9l5.5 5.5c1.944-1.906 5.056-1.906 7 0L21 9C18.722 6.417 15.444 4.937 12 4.937 8.556 4.937 5.278 6.417 3 9")
            addPathData("M12 18 9.8 5.2")
        }
        return _wiper!!
    }

private var _wiper: ImageVector? = null
