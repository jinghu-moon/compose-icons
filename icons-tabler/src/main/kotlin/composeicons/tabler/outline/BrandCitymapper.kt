package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandCitymapper: ImageVector
    get() {
        if (_brandCitymapper != null) return _brandCitymapper!!
        _brandCitymapper = tablerOutlineIcon(
            name = "BrandCitymapper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 11c.551 0 .998 .445 1 .996 .002 .551-.441 .999-.991 1.004C2.458 13.005 2.007 12.564 2 12.013c0-.552 .448-1 1-1v-.013")
            addPathData("M21 11c.551 0 .998 .445 1 .996 .002 .551-.441 .999-.991 1.004-.551 .005-1.001-.436-1.009-.987 0-.552 .448-1 1-1v-.013")
            addPathData("M8 12h8")
            addPathData("M13 9l3 3-3 3")
        }
        return _brandCitymapper!!
    }

private var _brandCitymapper: ImageVector? = null
