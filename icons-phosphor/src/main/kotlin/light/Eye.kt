package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Eye: ImageVector
    get() {
        if (_eye != null) return _eye!!
        _eye = phosphorLightIcon(
            name = "Eye",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 245.480 125.570 C 245.140 124.790 236.820 106.340 218.240 87.760 C 201.000 70.540 171.380 50.000 128.000 50.000 C 84.620 50.000 55.000 70.540 37.760 87.760 C 19.180 106.340 10.860 124.760 10.520 125.570 C 9.829 127.123 9.829 128.897 10.520 130.450 C 10.860 131.220 19.180 149.670 37.760 168.250 C 55.000 185.470 84.620 206.000 128.000 206.000 C 171.380 206.000 201.000 185.470 218.240 168.250 C 236.820 149.670 245.140 131.250 245.480 130.450 C 246.171 128.897 246.171 127.123 245.480 125.570 ZM 128.000 194.000 C 96.620 194.000 69.220 182.580 46.550 160.070 C 37.047 150.625 29.005 139.817 22.690 128.000 C 29.003 116.185 37.045 105.379 46.550 95.940 C 69.220 73.420 96.620 62.000 128.000 62.000 C 159.380 62.000 186.780 73.420 209.450 95.940 C 218.955 105.379 226.997 116.185 233.310 128.000 C 226.940 140.210 195.000 194.000 128.000 194.000 ZM 128.000 82.000 C 102.595 82.000 82.000 102.595 82.000 128.000 C 82.000 153.405 102.595 174.000 128.000 174.000 C 153.405 174.000 174.000 153.405 174.000 128.000 C 173.967 102.609 153.391 82.033 128.000 82.000 ZM 128.000 162.000 C 109.222 162.000 94.000 146.778 94.000 128.000 C 94.000 109.222 109.222 94.000 128.000 94.000 C 146.778 94.000 162.000 109.222 162.000 128.000 C 162.000 146.778 146.778 162.000 128.000 162.000 Z"),
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
        return _eye!!
    }

private var _eye: ImageVector? = null
