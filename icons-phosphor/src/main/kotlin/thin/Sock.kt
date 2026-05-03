package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Sock: ImageVector
    get() {
        if (_sock != null) return _sock!!
        _sock = phosphorThinIcon(
            name = "Sock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 192.000 20.000 L 104.000 20.000 C 97.373 20.000 92.000 25.373 92.000 32.000 L 92.000 110.340 L 52.080 150.260 C 30.635 171.705 30.635 206.475 52.080 227.920 C 73.525 249.365 108.295 249.365 129.740 227.920 L 198.140 159.510 C 201.905 155.770 204.015 150.677 204.000 145.370 L 204.000 32.000 C 204.000 25.373 198.627 20.000 192.000 20.000 ZM 104.000 28.000 L 192.000 28.000 C 194.209 28.000 196.000 29.791 196.000 32.000 L 196.000 52.000 L 100.000 52.000 L 100.000 32.000 C 100.000 29.791 101.791 28.000 104.000 28.000 ZM 124.080 222.260 C 112.249 234.205 94.929 238.905 78.682 234.579 C 62.436 230.254 49.746 217.564 45.421 201.318 C 41.095 185.071 45.795 167.751 57.740 155.920 L 98.830 114.830 C 99.580 114.079 100.001 113.061 100.000 112.000 L 100.000 60.000 L 196.000 60.000 L 196.000 108.170 C 168.931 110.283 148.032 132.848 148.000 160.000 C 147.953 170.454 151.092 180.675 157.000 189.300 ZM 192.480 153.860 L 162.820 183.530 C 158.339 176.502 155.972 168.335 156.000 160.000 C 156.032 137.263 173.360 118.285 196.000 116.190 L 196.000 145.370 C 196.009 148.557 194.741 151.614 192.480 153.860 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _sock!!
    }

private var _sock: ImageVector? = null
