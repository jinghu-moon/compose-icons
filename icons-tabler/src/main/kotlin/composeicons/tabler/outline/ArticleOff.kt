package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArticleOff: ImageVector
    get() {
        if (_articleOff != null) return _articleOff!!
        _articleOff = tablerOutlineIcon(
            name = "ArticleOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 4h11c1.105 0 2 .895 2 2v11M19.828 19.821c-.26 .118-.542 .179-.828 .179h-14C3.895 20 3 19.105 3 18v-12C3 5.222 3.451 4.514 4.156 4.186")
            addPathData("M7 8h1M12 8h5")
            addPathData("M7 12h5M16 12h1")
            addPathData("M7 16h9")
            addPathData("M3 3 21 21")
        }
        return _articleOff!!
    }

private var _articleOff: ImageVector? = null
