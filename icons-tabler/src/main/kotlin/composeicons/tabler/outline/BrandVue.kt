package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandVue: ImageVector
    get() {
        if (_brandVue != null) return _brandVue!!
        _brandVue = tablerOutlineIcon(
            name = "BrandVue",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M16.5 4 12 12 7.5 4")
            addPathData("M3 4l9 16L21 4")
        }
        return _brandVue!!
    }

private var _brandVue: ImageVector? = null
