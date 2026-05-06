package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NetworkX: ImageVector
    get() {
        if (_networkX != null) return _networkX!!
        _networkX = phosphorThinIcon(
            name = "NetworkX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 116h-100v-32h12c6.627 0 12-5.373 12-12v-32c0-6.627-5.373-12-12-12h-32c-6.627 0-12 5.373-12 12v32c0 6.627 5.373 12 12 12h12v32h-100c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h36v40h-12c-6.627 0-12 5.373-12 12v32c0 6.627 5.373 12 12 12h32c6.627 0 12-5.373 12-12v-32c0-6.627-5.373-12-12-12h-12v-40h120v20c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-20h36c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM108 72v-32c0-2.209 1.791-4 4-4h32c2.209 0 4 1.791 4 4v32c0 2.209-1.791 4-4 4h-32c-2.209 0-4-1.791-4-4ZM84 176v32c0 2.209-1.791 4-4 4h-32c-2.209 0-4-1.791-4-4v-32c0-2.209 1.791-4 4-4h32c2.209 0 4 1.791 4 4ZM218.83 170.83 197.66 192l21.17 21.17c1.563 1.563 1.563 4.097 0 5.66-1.563 1.563-4.097 1.563-5.66 0L192 197.66l-21.17 21.17c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66L186.34 192 165.17 170.83c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0L192 186.34l21.17-21.17c1.563-1.563 4.097-1.563 5.66 0 1.563 1.563 1.563 4.097 0 5.66Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _networkX!!
    }

private var _networkX: ImageVector? = null
