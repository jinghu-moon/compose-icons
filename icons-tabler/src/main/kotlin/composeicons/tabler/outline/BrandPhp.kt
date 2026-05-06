package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandPhp: ImageVector
    get() {
        if (_brandPhp != null) return _brandPhp!!
        _brandPhp = tablerOutlineIcon(
            name = "BrandPhp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 12c0 4.971 4.477 9 10 9 5.523 0 10-4.029 10-9C22 7.029 17.523 3 12 3 6.477 3 2 7.029 2 12")
            addPathData("M5.5 15l.395-1.974L6.5 10h1.32c.294 0 .573 .129 .763 .354 .19 .224 .272 .521 .223 .81l-.167 1c-.08 .482-.497 .836-.986 .836h-1.653")
            addPathData("M15.5 15l.395-1.974L16.5 10h1.32c.294 0 .573 .129 .763 .354 .19 .224 .272 .521 .223 .81l-.167 1c-.08 .482-.497 .836-.986 .836h-1.653")
            addPathData("M12 7.5 11 13")
            addPathData("M11.6 10h2.4l-.5 3")
        }
        return _brandPhp!!
    }

private var _brandPhp: ImageVector? = null
