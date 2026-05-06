package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandCodesandbox: ImageVector
    get() {
        if (_brandCodesandbox != null) return _brandCodesandbox!!
        _brandCodesandbox = tablerOutlineIcon(
            name = "BrandCodesandbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 7.5v9l-4 2.25L12 21 8 18.75 4 16.5v-9L8 5.25 12 3l4 2.25 4 2.25")
            addPathData("M12 12 16 9.75 20 7.5")
            addPathData("M12 12v9")
            addPathData("M12 12 8 9.75 4 7.5")
            addPathData("M20 12l-4 2v4.75")
            addPathData("M4 12l4 2v4.75")
            addPathData("M8 5.25l4 2.25L16 5.25")
        }
        return _brandCodesandbox!!
    }

private var _brandCodesandbox: ImageVector? = null
