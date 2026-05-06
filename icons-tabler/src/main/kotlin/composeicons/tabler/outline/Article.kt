package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Article: ImageVector
    get() {
        if (_article != null) return _article!!
        _article = tablerOutlineIcon(
            name = "Article",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 6C3 4.895 3.895 4 5 4h14c1.105 0 2 .895 2 2v12c0 1.105-.895 2-2 2h-14C3.895 20 3 19.105 3 18v-12")
            addPathData("M7 8h10")
            addPathData("M7 12h10")
            addPathData("M7 16h10")
        }
        return _article!!
    }

private var _article: ImageVector? = null
