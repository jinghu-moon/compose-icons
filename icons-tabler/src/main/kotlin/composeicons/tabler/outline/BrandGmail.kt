package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandGmail: ImageVector
    get() {
        if (_brandGmail != null) return _brandGmail!!
        _brandGmail = tablerOutlineIcon(
            name = "BrandGmail",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16 20h3c.552 0 1-.448 1-1v-14C20 4.448 19.552 4 19 4h-3v16")
            addPathData("M5 20h3v-16h-3C4.448 4 4 4.448 4 5v14c0 .552 .448 1 1 1")
            addPathData("M16 4 12 8 8 4")
            addPathData("M4 6.5 12 14 20 6.5")
        }
        return _brandGmail!!
    }

private var _brandGmail: ImageVector? = null
