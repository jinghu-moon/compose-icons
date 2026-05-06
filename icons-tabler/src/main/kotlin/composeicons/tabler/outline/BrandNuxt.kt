package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandNuxt: ImageVector
    get() {
        if (_brandNuxt != null) return _brandNuxt!!
        _brandNuxt = tablerOutlineIcon(
            name = "BrandNuxt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12.146 8.583 10.846 6.493c-.193-.31-.533-.496-.898-.493-.365 .003-.701 .197-.888 .51L3.15 16.418c-.193 .323-.197 .725-.012 1.052 .186 .327 .533 .53 .909 .53h3.913")
            addPathData("M20.043 18c.743 0 1.201-.843 .82-1.505L16.819 9.482C16.654 9.184 16.341 8.999 16 8.999c-.341 0-.654 .185-.819 .483l-4.043 7.013c-.382 .662 .076 1.505 .819 1.505h8.086")
        }
        return _brandNuxt!!
    }

private var _brandNuxt: ImageVector? = null
