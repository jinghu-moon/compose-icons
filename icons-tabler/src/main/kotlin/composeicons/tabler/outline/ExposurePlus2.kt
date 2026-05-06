package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ExposurePlus2: ImageVector
    get() {
        if (_exposurePlus2 != null) return _exposurePlus2!!
        _exposurePlus2 = tablerOutlineIcon(
            name = "ExposurePlus2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 9C12 6.791 13.791 5 16 5c2.209 0 4 1.791 4 4 0 1.098-.564 2.025-1.159 2.815L12 19h8")
            addPathData("M3 12h6")
            addPathData("M6 9v6")
        }
        return _exposurePlus2!!
    }

private var _exposurePlus2: ImageVector? = null
