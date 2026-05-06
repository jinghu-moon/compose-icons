package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowDownRightCircle: ImageVector
    get() {
        if (_arrowDownRightCircle != null) return _arrowDownRightCircle!!
        _arrowDownRightCircle = tablerOutlineIcon(
            name = "ArrowDownRightCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8.464 8.464 18 18")
            addPathData("M14 18h4v-4")
            addPathData("M8.414 8.414c.52-.502 .728-1.246 .545-1.945C8.776 5.77 8.23 5.224 7.531 5.041 6.832 4.858 6.088 5.066 5.586 5.586c-.758 .785-.747 2.032 .024 2.804 .771 .771 2.019 .782 2.804 .024")
        }
        return _arrowDownRightCircle!!
    }

private var _arrowDownRightCircle: ImageVector? = null
