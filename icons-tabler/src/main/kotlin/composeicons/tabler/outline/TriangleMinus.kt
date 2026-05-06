package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TriangleMinus: ImageVector
    get() {
        if (_triangleMinus != null) return _triangleMinus!!
        _triangleMinus = tablerOutlineIcon(
            name = "TriangleMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10.363 3.591 2.257 17.125c-.34 .589-.342 1.314-.005 1.905 .337 .591 .962 .959 1.641 .966h16.214c.68-.008 1.304-.376 1.641-.966 .337-.59 .335-1.315-.005-1.904L13.637 3.59C13.29 3.017 12.669 2.668 12 2.668c-.669 0-1.29 .35-1.637 .922v.001")
            addPathData("M9 13h6")
        }
        return _triangleMinus!!
    }

private var _triangleMinus: ImageVector? = null
