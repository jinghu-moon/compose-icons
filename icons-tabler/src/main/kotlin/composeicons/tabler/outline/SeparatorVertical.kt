package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SeparatorVertical: ImageVector
    get() {
        if (_separatorVertical != null) return _separatorVertical!!
        _separatorVertical = tablerOutlineIcon(
            name = "SeparatorVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 4v16")
            addPathData("M8 8 4 12l4 4")
            addPathData("M16 16l4-4L16 8")
        }
        return _separatorVertical!!
    }

private var _separatorVertical: ImageVector? = null
