package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TiktokLogo: ImageVector
    get() {
        if (_tiktokLogo != null) return _tiktokLogo!!
        _tiktokLogo = phosphorThinIcon(
            name = "TiktokLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 76C195.295 75.967 172.033 52.705 172 24c0-2.209-1.791-4-4-4h-40c-2.209 0-4 1.791-4 4v132c-.002 11.892-8.711 21.989-20.474 23.736C91.764 181.484 80.495 174.354 77.037 162.976c-3.458-11.378 1.937-23.572 12.683-28.666 1.396-.665 2.283-2.074 2.28-3.62v-42.69c.001-1.184-.523-2.307-1.43-3.067-.907-.76-2.104-1.08-3.27-.873C53.49 90.08 28 121 28 156c0 39.764 32.235 72 72 72 39.764 0 72-32.236 72-72v-46.56c15.655 9.566 33.654 14.605 52 14.56 2.209 0 4-1.791 4-4v-40c0-2.209-1.791-4-4-4ZM220 115.92c-17.879-.738-35.147-6.712-49.66-17.18-1.22-.88-2.831-1.001-4.169-.313-1.338 .688-2.177 2.069-2.171 3.573v54c0 35.346-28.654 64-64 64C64.654 220 36 191.346 36 156 36 126.48 56.32 100.21 84 93v35.31c-13.451 7.766-19.383 24.07-14.068 38.665 5.316 14.594 20.344 23.264 35.639 20.559C120.867 184.83 132.011 171.532 132 156v-128h32.13c2.049 29.967 25.903 53.821 55.87 55.87Z"),
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
        return _tiktokLogo!!
    }

private var _tiktokLogo: ImageVector? = null
