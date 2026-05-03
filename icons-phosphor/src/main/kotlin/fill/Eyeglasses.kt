package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Eyeglasses: ImageVector
    get() {
        if (_eyeglasses != null) return _eyeglasses!!
        _eyeglasses = phosphorFillIcon(
            name = "Eyeglasses",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.000 72.000 L 232.000 164.000 C 231.955 187.490 213.468 206.802 190.002 207.871 C 166.537 208.940 146.370 191.388 144.190 168.000 L 111.810 168.000 C 109.630 191.388 89.463 208.940 65.998 207.871 C 42.532 206.802 24.045 187.490 24.000 164.000 L 24.000 72.000 C 24.000 54.327 38.327 40.000 56.000 40.000 C 60.418 40.000 64.000 43.582 64.000 48.000 C 64.000 52.418 60.418 56.000 56.000 56.000 C 47.163 56.000 40.000 63.163 40.000 72.000 L 40.000 130.080 C 51.458 120.630 66.910 117.599 81.089 122.019 C 95.268 126.439 106.261 137.713 110.320 152.000 L 145.680 152.000 C 149.739 137.713 160.732 126.439 174.911 122.019 C 189.090 117.599 204.542 120.630 216.000 130.080 L 216.000 72.000 C 216.000 63.163 208.837 56.000 200.000 56.000 C 195.582 56.000 192.000 52.418 192.000 48.000 C 192.000 43.582 195.582 40.000 200.000 40.000 C 217.673 40.000 232.000 54.327 232.000 72.000 Z"),
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
        return _eyeglasses!!
    }

private var _eyeglasses: ImageVector? = null
