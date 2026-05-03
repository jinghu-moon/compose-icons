package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MapTrifold: ImageVector
    get() {
        if (_mapTrifold != null) return _mapTrifold!!
        _mapTrifold = phosphorRegularIcon(
            name = "MapTrifold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.920 49.690 C 226.978 48.177 224.448 47.642 222.060 48.240 L 160.930 63.520 L 99.580 32.840 C 97.871 31.987 95.913 31.775 94.060 32.240 L 30.060 48.240 C 26.499 49.130 24.001 52.329 24.000 56.000 L 24.000 200.000 C 24.000 202.463 25.135 204.789 27.077 206.305 C 29.019 207.820 31.550 208.357 33.940 207.760 L 95.070 192.480 L 156.420 223.160 C 157.534 223.709 158.758 223.996 160.000 224.000 C 160.654 224.000 161.306 223.919 161.940 223.760 L 225.940 207.760 C 229.501 206.870 231.999 203.671 232.000 200.000 L 232.000 56.000 C 232.001 53.534 230.864 51.206 228.920 49.690 ZM 104.000 52.940 L 152.000 76.940 L 152.000 203.060 L 104.000 179.060 ZM 40.000 62.250 L 88.000 50.250 L 88.000 177.750 L 40.000 189.750 ZM 216.000 193.750 L 168.000 205.750 L 168.000 78.250 L 216.000 66.250 Z"),
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
        return _mapTrifold!!
    }

private var _mapTrifold: ImageVector? = null
