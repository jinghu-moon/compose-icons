package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Filter2Spark: ImageVector
    get() {
        if (_filter2Spark != null) return _filter2Spark!!
        _filter2Spark = tablerOutlineIcon(
            name = "Filter2Spark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 6h16")
            addPathData("M6 12h9.5")
            addPathData("M9 18h2.5")
            addPathData("M19 21.5c.205-.849 .641-1.625 1.258-2.242 .617-.617 1.393-1.053 2.242-1.258-.849-.205-1.625-.641-2.242-1.258C19.641 16.125 19.205 15.349 19 14.5c-.205 .849-.641 1.625-1.258 2.242-.617 .617-1.393 1.053-2.242 1.258 .849 .205 1.625 .641 2.242 1.258 .617 .617 1.053 1.393 1.258 2.242")
        }
        return _filter2Spark!!
    }

private var _filter2Spark: ImageVector? = null
