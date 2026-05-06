package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Radar: ImageVector
    get() {
        if (_radar != null) return _radar!!
        _radar = tablerOutlineIcon(
            name = "Radar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M21 12h-8c0-.552-.448-1-1-1-.552 0-1 .448-1 1 0 .552 .448 1 1 1v8c4.971 0 9-4.029 9-9")
            addPathData("M16 9C14.826 7.435 12.847 6.698 10.936 7.115 9.024 7.531 7.531 9.024 7.115 10.936 6.698 12.847 7.435 14.826 9 16")
            addPathData("M20.486 9C19.085 5.051 15.143 2.591 10.98 3.068 6.817 3.545 3.534 6.832 3.061 10.996c-.472 4.164 1.992 8.102 5.943 9.499")
        }
        return _radar!!
    }

private var _radar: ImageVector? = null
