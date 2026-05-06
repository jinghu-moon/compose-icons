package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandVlc: ImageVector
    get() {
        if (_brandVlc != null) return _brandVlc!!
        _brandVlc = tablerOutlineIcon(
            name = "BrandVlc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13.79 4.337l3.101 9.305c.33 .985-.113 2.07-1.02 2.499-2.453 1.146-5.289 1.146-7.742 0C7.222 15.713 6.779 14.627 7.109 13.642L10.209 4.337C10.476 3.537 11.194 3 12 3c.807 0 1.525 .537 1.79 1.337")
            addPathData("M7 14h-1.429c-.893-0-1.677 .592-1.923 1.45l-.571 2c-.173 .604-.052 1.253 .326 1.754 .378 .501 .969 .796 1.597 .796h13.998c.628 0 1.219-.295 1.597-.796 .378-.501 .499-1.151 .326-1.754l-.572-2C20.103 14.592 19.319 14 18.426 14h-1.426")
        }
        return _brandVlc!!
    }

private var _brandVlc: ImageVector? = null
