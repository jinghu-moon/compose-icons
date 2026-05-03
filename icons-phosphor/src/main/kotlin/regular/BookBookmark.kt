package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BookBookmark: ImageVector
    get() {
        if (_bookBookmark != null) return _bookBookmark!!
        _bookBookmark = phosphorRegularIcon(
            name = "BookBookmark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 208.000 24.000 L 72.000 24.000 C 54.327 24.000 40.000 38.327 40.000 56.000 L 40.000 224.000 C 40.000 228.418 43.582 232.000 48.000 232.000 L 192.000 232.000 C 196.418 232.000 200.000 228.418 200.000 224.000 C 200.000 219.582 196.418 216.000 192.000 216.000 L 56.000 216.000 C 56.000 207.163 63.163 200.000 72.000 200.000 L 208.000 200.000 C 212.418 200.000 216.000 196.418 216.000 192.000 L 216.000 32.000 C 216.000 27.582 212.418 24.000 208.000 24.000 ZM 120.000 40.000 L 168.000 40.000 L 168.000 112.000 L 148.790 97.600 C 145.946 95.467 142.034 95.467 139.190 97.600 L 120.000 112.000 ZM 200.000 184.000 L 72.000 184.000 C 66.381 183.992 60.861 185.472 56.000 188.290 L 56.000 56.000 C 56.000 47.163 63.163 40.000 72.000 40.000 L 104.000 40.000 L 104.000 128.000 C 104.000 131.030 105.712 133.800 108.422 135.155 C 111.133 136.511 114.376 136.218 116.800 134.400 L 144.000 114.000 L 171.210 134.400 C 172.592 135.437 174.272 135.998 176.000 136.000 C 180.418 136.000 184.000 132.418 184.000 128.000 L 184.000 40.000 L 200.000 40.000 Z"),
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
        return _bookBookmark!!
    }

private var _bookBookmark: ImageVector? = null
