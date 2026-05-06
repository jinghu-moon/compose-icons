package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandPowershell: ImageVector
    get() {
        if (_brandPowershell != null) return _brandPowershell!!
        _brandPowershell = tablerOutlineIcon(
            name = "BrandPowershell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4.887 20h11.868c.893 0 1.664-.665 1.847-1.592L20.96 6.408C21.172 5.327 20.518 4.268 19.498 4.042 19.372 4.014 19.242 4 19.113 4h-11.868C6.352 4 5.581 4.665 5.398 5.592L3.04 17.592c-.212 1.081 .442 2.14 1.462 2.366 .127 .028 .256 .042 .385 .042")
            addPathData("M9 8l4 4L7 16")
            addPathData("M12 16h3")
        }
        return _brandPowershell!!
    }

private var _brandPowershell: ImageVector? = null
