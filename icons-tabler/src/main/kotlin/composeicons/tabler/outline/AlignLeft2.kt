package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AlignLeft2: ImageVector
    get() {
        if (_alignLeft2 != null) return _alignLeft2!!
        _alignLeft2 = tablerOutlineIcon(
            name = "AlignLeft2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 4v16")
            addPathData("M8 6h12")
            addPathData("M8 12h6")
            addPathData("M8 18h10")
        }
        return _alignLeft2!!
    }

private var _alignLeft2: ImageVector? = null
