package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowBarToDownDashed: ImageVector
    get() {
        if (_arrowBarToDownDashed != null) return _arrowBarToDownDashed!!
        _arrowBarToDownDashed = tablerOutlineIcon(
            name = "ArrowBarToDownDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 14v-10")
            addPathData("M12 14l4-4")
            addPathData("M12 14 8 10")
            addPathData("M4 20h3M20 20h-3M13.5 20h-3")
        }
        return _arrowBarToDownDashed!!
    }

private var _arrowBarToDownDashed: ImageVector? = null
