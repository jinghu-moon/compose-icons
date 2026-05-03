package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CoinVertical: ImageVector
    get() {
        if (_coinVertical != null) return _coinVertical!!
        _coinVertical = phosphorLightIcon(
            name = "CoinVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 196.780 57.090 C 185.080 37.000 169.180 26.000 152.000 26.000 L 104.000 26.000 C 86.820 26.000 70.920 37.000 59.220 57.090 C 48.120 76.130 42.000 101.310 42.000 128.000 C 42.000 154.690 48.120 179.870 59.220 198.910 C 70.920 219.000 86.820 230.000 104.000 230.000 L 152.000 230.000 C 169.180 230.000 185.080 219.000 196.780 198.910 C 207.880 179.910 214.000 154.690 214.000 128.000 C 214.000 101.310 207.880 76.130 196.780 57.090 ZM 201.880 122.000 L 165.880 122.000 C 165.230 103.160 161.510 85.270 155.140 70.000 L 190.000 70.000 C 197.060 84.740 201.160 102.770 201.880 122.000 ZM 152.000 38.000 C 163.310 38.000 174.220 45.060 183.140 58.000 L 149.280 58.000 L 148.780 57.090 C 144.736 49.951 139.574 43.506 133.490 38.000 ZM 69.580 192.860 C 59.540 175.630 54.000 152.600 54.000 128.000 C 54.000 103.400 59.540 80.370 69.580 63.140 C 79.000 46.930 91.260 38.000 104.000 38.000 C 116.740 38.000 129.000 46.930 138.420 63.140 C 148.460 80.370 154.000 103.400 154.000 128.000 C 154.000 152.600 148.460 175.630 138.420 192.860 C 129.000 209.070 116.740 218.000 104.000 218.000 C 91.260 218.000 79.000 209.070 69.580 192.860 ZM 152.000 218.000 L 133.490 218.000 C 139.574 212.494 144.736 206.049 148.780 198.910 L 149.280 198.000 L 183.140 198.000 C 174.220 210.940 163.310 218.000 152.000 218.000 ZM 190.000 186.000 L 155.140 186.000 C 161.510 170.730 165.230 152.840 165.880 134.000 L 201.880 134.000 C 201.160 153.230 197.060 171.260 190.000 186.000 Z"),
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
        return _coinVertical!!
    }

private var _coinVertical: ImageVector? = null
