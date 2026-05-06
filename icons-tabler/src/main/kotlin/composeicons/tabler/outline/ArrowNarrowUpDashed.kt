package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowNarrowUpDashed: ImageVector
    get() {
        if (_arrowNarrowUpDashed != null) return _arrowNarrowUpDashed!!
        _arrowNarrowUpDashed = tablerOutlineIcon(
            name = "ArrowNarrowUpDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 5v6M12 14v1.5M12 18.5v.5")
            addPathData("M16 9 12 5")
            addPathData("M8 9 12 5")
        }
        return _arrowNarrowUpDashed!!
    }

private var _arrowNarrowUpDashed: ImageVector? = null
