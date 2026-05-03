package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.LightningA: ImageVector
    get() {
        if (_lightningA != null) return _lightningA!!
        _lightningA = phosphorRegularIcon(
            name = "LightningA",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 175.840 111.540 C 175.326 109.017 173.629 106.895 171.280 105.840 L 121.280 83.410 L 135.000 25.850 C 135.835 22.315 134.183 18.662 130.979 16.953 C 127.774 15.244 123.820 15.908 121.350 18.570 L 26.130 121.420 C 24.381 123.310 23.649 125.926 24.162 128.449 C 24.675 130.972 26.372 133.094 28.720 134.150 L 78.720 156.590 L 65.000 214.150 C 64.165 217.685 65.817 221.338 69.021 223.047 C 72.226 224.756 76.180 224.092 78.650 221.430 L 173.850 118.580 C 175.610 116.692 176.351 114.070 175.840 111.540 ZM 87.620 188.210 L 95.780 153.850 C 96.670 150.115 94.781 146.275 91.280 144.700 L 45.430 124.120 L 112.380 51.790 L 104.220 86.150 C 103.330 89.885 105.219 93.725 108.720 95.300 L 154.560 115.880 ZM 239.150 212.420 L 203.150 140.420 C 201.795 137.710 199.025 135.999 195.995 135.999 C 192.965 135.999 190.195 137.710 188.840 140.420 L 152.840 212.420 C 150.863 216.372 152.463 221.178 156.415 223.155 C 160.367 225.132 165.173 223.532 167.150 219.580 L 176.940 200.000 L 215.050 200.000 L 224.840 219.580 C 226.197 222.291 228.969 224.002 232.000 224.000 C 234.772 223.999 237.346 222.562 238.803 220.203 C 240.259 217.844 240.391 214.899 239.150 212.420 ZM 184.940 184.000 L 196.000 161.890 L 207.050 184.000 Z"),
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
        return _lightningA!!
    }

private var _lightningA: ImageVector? = null
