package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChessBishop: ImageVector
    get() {
        if (_chessBishop != null) return _chessBishop!!
        _chessBishop = tablerFilledIcon(
            name = "ChessBishop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 2c.816-0 1.551 .496 1.855 1.253 .305 .757 .119 1.623-.469 2.189 .646 .28 1.226 .62 1.74 1.017l-3.833 3.834-.083 .094c-.309 .398-.273 .964 .083 1.32 .356 .356 .922 .392 1.32 .083l.094-.083L16.521 7.894C17.498 9.244 18 10.964 18 13c0 1.913-1.178 3.722-3.089 3.973l-.2 .02L14.5 17h-5C7.374 17 6 15.076 6 13 6 9.32 7.57 6.745 10.613 5.44 10.026 4.874 9.841 4.008 10.146 3.252 10.451 2.496 11.185 2 12 2Z")
            addPathData("M12 5v1")
            addPathData("M18 18h-12c-.552 0-1 .448-1 1 0 1.105 .895 2 2 2h10c1.015 0 1.869-.76 1.987-1.768l.011-.174c.016-.275-.082-.544-.271-.744C18.538 18.114 18.275 18 18 18Z")
        }
        return _chessBishop!!
    }

private var _chessBishop: ImageVector? = null
