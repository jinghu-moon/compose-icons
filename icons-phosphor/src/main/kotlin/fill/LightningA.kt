package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LightningA: ImageVector
    get() {
        if (_lightningA != null) return _lightningA!!
        _lightningA = phosphorFillIcon(
            name = "LightningA",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 173.870 118.580 L 78.670 221.430 C 76.204 224.114 72.236 224.792 69.019 223.079 C 65.802 221.365 64.149 217.694 65.000 214.150 L 78.670 156.590 L 28.670 134.150 C 26.322 133.094 24.625 130.972 24.112 128.449 C 23.599 125.926 24.331 123.310 26.080 121.420 L 121.280 18.570 C 123.734 15.830 127.740 15.116 130.989 16.840 C 134.238 18.564 135.893 22.282 135.000 25.850 L 121.310 83.410 L 171.310 105.840 C 173.662 106.895 175.361 109.019 175.875 111.545 C 176.388 114.071 175.653 116.690 173.900 118.580 ZM 235.580 223.150 C 234.470 223.711 233.244 224.002 232.000 224.000 C 228.969 224.002 226.197 222.291 224.840 219.580 L 215.050 200.000 L 176.940 200.000 L 167.150 219.580 C 165.173 223.532 160.367 225.132 156.415 223.155 C 152.463 221.178 150.863 216.372 152.840 212.420 L 188.840 140.420 C 190.195 137.710 192.965 135.999 195.995 135.999 C 199.025 135.999 201.795 137.710 203.150 140.420 L 239.150 212.420 C 241.125 216.369 239.527 221.171 235.580 223.150 ZM 207.050 184.000 L 196.000 161.890 L 184.940 184.000 Z"),
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
        return _lightningA!!
    }

private var _lightningA: ImageVector? = null
