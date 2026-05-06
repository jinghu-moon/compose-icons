package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TrianglePlus2: ImageVector
    get() {
        if (_trianglePlus2 != null) return _trianglePlus2!!
        _trianglePlus2 = tablerOutlineIcon(
            name = "TrianglePlus2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18.69 12.027 13.636 3.59c-.347-.573-.968-.922-1.637-.922-.669 0-1.29 .35-1.637 .922L2.257 17.125c-.34 .589-.342 1.314-.005 1.905 .337 .591 .962 .959 1.641 .966h8.107")
            addPathData("M16 19h6")
            addPathData("M19 16v6")
        }
        return _trianglePlus2!!
    }

private var _trianglePlus2: ImageVector? = null
