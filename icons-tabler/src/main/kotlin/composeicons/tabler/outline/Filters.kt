package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Filters: ImageVector
    get() {
        if (_filters != null) return _filters!!
        _filters = tablerOutlineIcon(
            name = "Filters",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 8c0 2.761 2.239 5 5 5 2.761 0 5-2.239 5-5C17 5.239 14.761 3 12 3 9.239 3 7 5.239 7 8")
            addPathData("M8 11c-2.319 0-4.334 1.595-4.866 3.852-.532 2.257 .557 4.584 2.632 5.621 2.075 1.036 4.59 .51 6.075-1.272 1.485-1.781 1.55-4.35 .157-6.205")
            addPathData("M12.002 19.003c1.412 1.88 3.942 2.522 6.08 1.543 2.137-.979 3.304-3.314 2.803-5.611C20.384 12.638 18.351 11 16 11")
        }
        return _filters!!
    }

private var _filters: ImageVector? = null
