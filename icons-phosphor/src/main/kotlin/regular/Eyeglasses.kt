package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Eyeglasses: ImageVector
    get() {
        if (_eyeglasses != null) return _eyeglasses!!
        _eyeglasses = phosphorRegularIcon(
            name = "Eyeglasses",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 40.000 C 195.582 40.000 192.000 43.582 192.000 48.000 C 192.000 52.418 195.582 56.000 200.000 56.000 C 208.837 56.000 216.000 63.163 216.000 72.000 L 216.000 130.080 C 204.542 120.630 189.090 117.599 174.911 122.019 C 160.732 126.439 149.739 137.713 145.680 152.000 L 110.320 152.000 C 106.261 137.713 95.268 126.439 81.089 122.019 C 66.910 117.599 51.458 120.630 40.000 130.080 L 40.000 72.000 C 40.000 63.163 47.163 56.000 56.000 56.000 C 60.418 56.000 64.000 52.418 64.000 48.000 C 64.000 43.582 60.418 40.000 56.000 40.000 C 38.327 40.000 24.000 54.327 24.000 72.000 L 24.000 164.000 C 24.045 187.490 42.532 206.802 65.998 207.871 C 89.463 208.940 109.630 191.388 111.810 168.000 L 144.190 168.000 C 146.370 191.388 166.537 208.940 190.002 207.871 C 213.468 206.802 231.955 187.490 232.000 164.000 L 232.000 72.000 C 232.000 54.327 217.673 40.000 200.000 40.000 ZM 68.000 192.000 C 52.536 192.000 40.000 179.464 40.000 164.000 C 40.000 148.536 52.536 136.000 68.000 136.000 C 83.464 136.000 96.000 148.536 96.000 164.000 C 96.000 179.464 83.464 192.000 68.000 192.000 ZM 188.000 192.000 C 172.536 192.000 160.000 179.464 160.000 164.000 C 160.000 148.536 172.536 136.000 188.000 136.000 C 203.464 136.000 216.000 148.536 216.000 164.000 C 216.000 179.464 203.464 192.000 188.000 192.000 Z"),
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
        return _eyeglasses!!
    }

private var _eyeglasses: ImageVector? = null
