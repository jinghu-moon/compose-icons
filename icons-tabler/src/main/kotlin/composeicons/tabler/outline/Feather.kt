package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Feather: ImageVector
    get() {
        if (_feather != null) return _feather!!
        _feather = tablerOutlineIcon(
            name = "Feather",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 20 14 10 14 5v5h5M10 9v5h5M6 13v5h5M6 13 10 9 14 5")
            addPathData("M19 10c.638-.636 1-1.515 1-2.486C20 6.582 19.629 5.687 18.969 5.028 18.31 4.369 17.415 3.999 16.483 4 15.513 4 14.636 4.367 14 5M11 18l4-4 4-4")
        }
        return _feather!!
    }

private var _feather: ImageVector? = null
