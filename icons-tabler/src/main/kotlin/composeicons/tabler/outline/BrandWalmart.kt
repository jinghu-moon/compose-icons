package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandWalmart: ImageVector
    get() {
        if (_brandWalmart != null) return _brandWalmart!!
        _brandWalmart = tablerOutlineIcon(
            name = "BrandWalmart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 8.04v-5.04")
            addPathData("M15.5 10 20 7.5")
            addPathData("M15.5 14 20 16.5")
            addPathData("M12 15.96v5.04")
            addPathData("M8.5 14 4 16.5")
            addPathData("M8.5 10 4 7.495")
        }
        return _brandWalmart!!
    }

private var _brandWalmart: ImageVector? = null
