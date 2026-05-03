package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PaypalLogo: ImageVector
    get() {
        if (_paypalLogo != null) return _paypalLogo!!
        _paypalLogo = phosphorBoldIcon(
            name = "PaypalLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 223.270 91.080 C 218.009 84.324 211.360 78.775 203.770 74.810 C 201.078 43.803 175.123 20.003 144.000 20.000 L 84.000 20.000 C 74.824 20.001 66.825 26.247 64.600 35.150 L 28.600 179.150 C 27.107 185.124 28.449 191.453 32.238 196.307 C 36.028 201.161 41.842 203.999 48.000 204.000 L 70.390 204.000 L 68.600 211.150 C 67.107 217.124 68.449 223.453 72.238 228.307 C 76.028 233.161 81.842 235.999 88.000 236.000 L 119.500 236.000 C 128.676 235.999 136.675 229.753 138.900 220.850 L 147.130 188.000 L 176.000 188.000 C 198.934 187.998 219.861 174.922 229.917 154.311 C 239.974 133.699 237.402 109.158 223.290 91.080 ZM 87.130 44.000 L 144.000 44.000 C 155.093 43.968 165.572 49.084 172.370 57.850 C 174.786 60.927 176.688 64.375 178.000 68.060 C 177.340 68.060 176.690 68.000 176.000 68.000 L 120.000 68.000 C 110.824 68.001 102.825 74.247 100.600 83.150 L 76.390 180.000 L 53.130 180.000 ZM 177.890 92.050 C 172.812 106.410 159.231 116.007 144.000 116.000 L 117.130 116.000 L 123.130 92.000 L 176.000 92.000 C 176.620 92.000 177.260 92.000 177.890 92.050 ZM 210.890 136.730 C 206.906 152.756 192.514 164.005 176.000 164.000 L 144.000 164.000 C 134.824 164.001 126.825 170.247 124.600 179.150 L 116.390 212.000 L 93.130 212.000 L 111.130 140.000 L 144.000 140.000 C 168.945 140.027 191.295 124.589 200.100 101.250 C 209.968 110.180 214.125 123.813 210.920 136.730 Z"),
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
        return _paypalLogo!!
    }

private var _paypalLogo: ImageVector? = null
