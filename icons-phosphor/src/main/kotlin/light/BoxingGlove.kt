package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BoxingGlove: ImageVector
    get() {
        if (_boxingGlove != null) return _boxingGlove!!
        _boxingGlove = phosphorLightIcon(
            name = "BoxingGlove",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 168.000 18.000 L 120.000 18.000 C 90.190 18.033 66.033 42.190 66.000 72.000 L 66.000 74.000 L 56.000 74.000 C 39.431 74.000 26.000 87.431 26.000 104.000 L 26.000 133.190 C 26.000 136.371 27.082 139.457 29.070 141.940 C 29.216 142.123 29.373 142.297 29.540 142.460 L 66.000 178.460 L 66.000 216.000 C 66.000 223.732 72.268 230.000 80.000 230.000 L 192.000 230.000 C 199.732 230.000 206.000 223.732 206.000 216.000 L 206.000 176.840 L 221.460 122.730 C 221.819 121.478 222.001 120.182 222.000 118.880 L 222.000 72.000 C 221.967 42.190 197.810 18.033 168.000 18.000 ZM 210.000 118.880 C 209.999 119.066 209.972 119.251 209.920 119.430 L 194.230 174.350 C 194.079 174.887 194.001 175.442 194.000 176.000 L 194.000 216.000 C 194.000 217.105 193.105 218.000 192.000 218.000 L 80.000 218.000 C 78.895 218.000 78.000 217.105 78.000 216.000 L 78.000 176.000 C 78.001 174.396 77.360 172.858 76.220 171.730 L 38.300 134.250 C 38.103 133.932 37.999 133.564 38.000 133.190 L 38.000 104.000 C 38.000 94.059 46.059 86.000 56.000 86.000 L 66.000 86.000 L 66.000 104.000 C 66.000 107.314 68.686 110.000 72.000 110.000 C 75.314 110.000 78.000 107.314 78.000 104.000 L 78.000 72.000 C 78.000 48.804 96.804 30.000 120.000 30.000 L 168.000 30.000 C 191.196 30.000 210.000 48.804 210.000 72.000 ZM 170.680 165.370 L 149.420 176.000 L 170.680 186.630 C 173.646 188.110 174.850 191.714 173.370 194.680 C 171.890 197.646 168.286 198.850 165.320 197.370 L 136.000 182.710 L 106.680 197.370 C 103.714 198.850 100.110 197.646 98.630 194.680 C 97.150 191.714 98.354 188.110 101.320 186.630 L 122.580 176.000 L 101.320 165.370 C 98.354 163.890 97.150 160.286 98.630 157.320 C 100.110 154.354 103.714 153.150 106.680 154.630 L 136.000 169.290 L 165.320 154.630 C 168.286 153.150 171.890 154.354 173.370 157.320 C 174.850 160.286 173.646 163.890 170.680 165.370 Z"),
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
        return _boxingGlove!!
    }

private var _boxingGlove: ImageVector? = null
