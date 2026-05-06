package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Deselect: ImageVector
    get() {
        if (_deselect != null) return _deselect!!
        _deselect = tablerOutlineIcon(
            name = "Deselect",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 8h3c.552 0 1 .448 1 1v3")
            addPathData("M16 16h-7C8.448 16 8 15.552 8 15v-7")
            addPathData("M12 20v.01")
            addPathData("M16 20v.01")
            addPathData("M8 20v.01")
            addPathData("M4 20v.01")
            addPathData("M4 16v.01")
            addPathData("M4 12v.01")
            addPathData("M4 8v.01")
            addPathData("M8 4v.01")
            addPathData("M12 4v.01")
            addPathData("M16 4v.01")
            addPathData("M20 4v.01")
            addPathData("M20 8v.01")
            addPathData("M20 12v.01")
            addPathData("M20 16v.01")
            addPathData("M3 3 21 21")
        }
        return _deselect!!
    }

private var _deselect: ImageVector? = null
