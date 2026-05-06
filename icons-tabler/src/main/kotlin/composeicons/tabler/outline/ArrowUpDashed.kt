package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowUpDashed: ImageVector
    get() {
        if (_arrowUpDashed != null) return _arrowUpDashed!!
        _arrowUpDashed = tablerOutlineIcon(
            name = "ArrowUpDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 5v6M12 14v1.5M12 18.5v.5")
            addPathData("M18 11 12 5")
            addPathData("M6 11 12 5")
        }
        return _arrowUpDashed!!
    }

private var _arrowUpDashed: ImageVector? = null
