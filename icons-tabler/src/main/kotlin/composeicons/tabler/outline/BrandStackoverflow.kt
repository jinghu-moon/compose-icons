package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandStackoverflow: ImageVector
    get() {
        if (_brandStackoverflow != null) return _brandStackoverflow!!
        _brandStackoverflow = tablerOutlineIcon(
            name = "BrandStackoverflow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 17v1c0 1.105 .895 2 2 2h12c1.105 0 2-.895 2-2v-1")
            addPathData("M8 16h8")
            addPathData("M8.322 12.582l7.956 .836")
            addPathData("M8.787 9.168l7.826 1.664")
            addPathData("M10.096 5.764l7.608 2.472")
        }
        return _brandStackoverflow!!
    }

private var _brandStackoverflow: ImageVector? = null
