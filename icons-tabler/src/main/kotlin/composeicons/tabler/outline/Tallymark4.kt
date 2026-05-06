package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Tallymark4: ImageVector
    get() {
        if (_tallymark4 != null) return _tallymark4!!
        _tallymark4 = tablerOutlineIcon(
            name = "Tallymark4",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M6 5v14")
            addPathData("M10 5v14")
            addPathData("M14 5v14")
            addPathData("M18 5v14")
        }
        return _tallymark4!!
    }

private var _tallymark4: ImageVector? = null
