package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NetworkSlash: ImageVector
    get() {
        if (_networkSlash != null) return _networkSlash!!
        _networkSlash = phosphorThinIcon(
            name = "NetworkSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M100 54v-14c0-6.627 5.373-12 12-12h32c6.627 0 12 5.373 12 12v32c0 6.627-5.373 12-12 12h-16.39c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h16.39c2.209 0 4-1.791 4-4v-32c0-2.209-1.791-4-4-4h-32c-2.209 0-4 1.791-4 4v14c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4ZM211 213.31c.982 1.054 1.32 2.555 .887 3.929-.433 1.374-1.572 2.408-2.981 2.709-1.409 .3-2.87-.18-3.826-1.258L119 124h-51v40h12c6.627 0 12 5.373 12 12v32c0 6.627-5.373 12-12 12h-32c-6.627 0-12-5.373-12-12v-32c0-6.627 5.373-12 12-12h12v-40h-36c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h87.68L45 42.69C43.514 41.033 43.653 38.486 45.31 37c1.657-1.486 4.204-1.347 5.69 .31ZM80 172h-32c-2.209 0-4 1.791-4 4v32c0 2.209 1.791 4 4 4h32c2.209 0 4-1.791 4-4v-32c0-2.209-1.791-4-4-4ZM232 116h-68c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h24v26.83c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-26.83h36c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4Z"),
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
        return _networkSlash!!
    }

private var _networkSlash: ImageVector? = null
