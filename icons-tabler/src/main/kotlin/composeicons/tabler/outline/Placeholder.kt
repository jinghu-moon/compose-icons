package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Placeholder: ImageVector
    get() {
        if (_placeholder != null) return _placeholder!!
        _placeholder = tablerOutlineIcon(
            name = "Placeholder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 20.415c2.992 1.212 6.42 .506 8.69-1.789 2.27-2.295 2.939-5.73 1.695-8.709C19.141 6.938 16.228 4.999 13 5h-3")
            addPathData("M13 8 10 5 13 2")
            addPathData("M7 17l4-4L7 9 3 13l4 4")
        }
        return _placeholder!!
    }

private var _placeholder: ImageVector? = null
