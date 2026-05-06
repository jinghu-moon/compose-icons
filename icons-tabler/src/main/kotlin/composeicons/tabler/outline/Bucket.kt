package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bucket: ImageVector
    get() {
        if (_bucket != null) return _bucket!!
        _bucket = tablerOutlineIcon(
            name = "Bucket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 7c0 2.209 3.582 4 8 4 4.418 0 8-1.791 8-4C20 4.791 16.418 3 12 3 7.582 3 4 4.791 4 7")
            addPathData("M4 7c0 .664 .088 1.324 .263 1.965L7 19c.5 1.5 2.239 2 5 2 2.761 0 4.5-.5 5-2 .333-1 1.246-4.345 2.737-10.035C19.912 8.325 20 7.664 20 7")
        }
        return _bucket!!
    }

private var _bucket: ImageVector? = null
