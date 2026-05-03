package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BookOpenUser: ImageVector
    get() {
        if (_bookOpenUser != null) return _bookOpenUser!!
        _bookOpenUser = phosphorRegularIcon(
            name = "BookOpenUser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 232.000 72.000 L 160.000 72.000 C 147.410 72.000 135.554 77.928 128.000 88.000 C 120.446 77.928 108.590 72.000 96.000 72.000 L 24.000 72.000 C 19.582 72.000 16.000 75.582 16.000 80.000 L 16.000 200.000 C 16.000 204.418 19.582 208.000 24.000 208.000 L 96.000 208.000 C 109.255 208.000 120.000 218.745 120.000 232.000 C 120.000 236.418 123.582 240.000 128.000 240.000 C 132.418 240.000 136.000 236.418 136.000 232.000 C 136.000 218.745 146.745 208.000 160.000 208.000 L 232.000 208.000 C 236.418 208.000 240.000 204.418 240.000 200.000 L 240.000 80.000 C 240.000 75.582 236.418 72.000 232.000 72.000 ZM 96.000 192.000 L 32.000 192.000 L 32.000 88.000 L 96.000 88.000 C 109.255 88.000 120.000 98.745 120.000 112.000 L 120.000 200.000 C 113.083 194.795 104.657 191.986 96.000 192.000 ZM 224.000 192.000 L 160.000 192.000 C 151.343 191.986 142.917 194.795 136.000 200.000 L 136.000 112.000 C 136.000 98.745 146.745 88.000 160.000 88.000 L 224.000 88.000 ZM 89.600 43.190 C 98.665 31.103 112.892 23.990 128.000 23.990 C 143.108 23.990 157.335 31.103 166.400 43.190 C 169.056 46.722 168.347 51.739 164.815 54.395 C 161.283 57.051 156.266 56.342 153.610 52.810 C 147.567 44.744 138.078 39.997 128.000 39.997 C 117.922 39.997 108.433 44.744 102.390 52.810 C 99.734 56.342 94.717 57.051 91.185 54.395 C 87.653 51.739 86.944 46.722 89.600 43.190 Z"),
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
        return _bookOpenUser!!
    }

private var _bookOpenUser: ImageVector? = null
