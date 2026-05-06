package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowUpRightCircle: ImageVector
    get() {
        if (_arrowUpRightCircle != null) return _arrowUpRightCircle!!
        _arrowUpRightCircle = tablerOutlineIcon(
            name = "ArrowUpRightCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8.464 15.536 18 6")
            addPathData("M18 10v-4h-4")
            addPathData("M8.414 15.586c-.502-.52-1.246-.728-1.945-.545-.699 .183-1.245 .729-1.428 1.428-.183 .699 .025 1.443 .545 1.945 .785 .758 2.032 .747 2.804-.024 .771-.771 .782-2.019 .024-2.804")
        }
        return _arrowUpRightCircle!!
    }

private var _arrowUpRightCircle: ImageVector? = null
