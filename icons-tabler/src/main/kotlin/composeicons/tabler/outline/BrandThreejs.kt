package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandThreejs: ImageVector
    get() {
        if (_brandThreejs != null) return _brandThreejs!!
        _brandThreejs = tablerOutlineIcon(
            name = "BrandThreejs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 22 3 3 22 8.5 8 22")
            addPathData("M12.573 17.58 6.421 16.004 15.217 6.538l1.914 6.64")
            addPathData("M12.573 17.58 11 11l6.13 2.179")
            addPathData("M9.527 4.893 11 11 4.69 9.436 9.527 4.893")
        }
        return _brandThreejs!!
    }

private var _brandThreejs: ImageVector? = null
