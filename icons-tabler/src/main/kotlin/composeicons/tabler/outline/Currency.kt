package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Currency: ImageVector
    get() {
        if (_currency != null) return _currency!!
        _currency = tablerOutlineIcon(
            name = "Currency",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 12c0 3.866 3.134 7 7 7 3.866 0 7-3.134 7-7C19 8.134 15.866 5 12 5 8.134 5 5 8.134 5 12")
            addPathData("M4 4 7 7")
            addPathData("M20 4 17 7")
            addPathData("M4 20 7 17")
            addPathData("M20 20 17 17")
        }
        return _currency!!
    }

private var _currency: ImageVector? = null
