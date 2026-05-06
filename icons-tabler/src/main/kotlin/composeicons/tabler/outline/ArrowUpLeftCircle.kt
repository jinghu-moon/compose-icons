package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowUpLeftCircle: ImageVector
    get() {
        if (_arrowUpLeftCircle != null) return _arrowUpLeftCircle!!
        _arrowUpLeftCircle = tablerOutlineIcon(
            name = "ArrowUpLeftCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.536 15.536 6 6")
            addPathData("M10 6h-4v4")
            addPathData("M15.586 15.586c-.52 .502-.728 1.246-.545 1.945 .183 .699 .729 1.245 1.428 1.428 .699 .183 1.443-.025 1.945-.545 .758-.785 .747-2.032-.024-2.804-.771-.771-2.019-.782-2.804-.024")
        }
        return _arrowUpLeftCircle!!
    }

private var _arrowUpLeftCircle: ImageVector? = null
