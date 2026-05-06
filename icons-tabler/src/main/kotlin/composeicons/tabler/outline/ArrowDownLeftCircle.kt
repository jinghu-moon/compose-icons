package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowDownLeftCircle: ImageVector
    get() {
        if (_arrowDownLeftCircle != null) return _arrowDownLeftCircle!!
        _arrowDownLeftCircle = tablerOutlineIcon(
            name = "ArrowDownLeftCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.536 8.464 6 18")
            addPathData("M6 14v4h4")
            addPathData("M15.586 8.414c.502 .52 1.246 .728 1.945 .545 .699-.183 1.245-.729 1.428-1.428 .183-.699-.025-1.443-.545-1.945-.785-.758-2.032-.747-2.804 .024-.771 .771-.782 2.019-.024 2.804")
        }
        return _arrowDownLeftCircle!!
    }

private var _arrowDownLeftCircle: ImageVector? = null
