package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Binoculars: ImageVector
    get() {
        if (_binoculars != null) return _binoculars!!
        _binoculars = phosphorLightIcon(
            name = "Binoculars",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 233.000 147.240 L 191.430 52.600 C 191.131 51.918 190.707 51.297 190.180 50.770 C 178.465 39.059 159.475 39.059 147.760 50.770 C 146.637 51.892 146.004 53.413 146.000 55.000 L 146.000 82.000 L 110.000 82.000 L 110.000 55.000 C 110.001 53.406 109.368 51.877 108.240 50.750 C 96.525 39.039 77.535 39.039 65.820 50.750 C 65.293 51.277 64.869 51.898 64.570 52.580 L 23.000 147.240 C 14.362 164.222 17.086 184.771 29.851 198.915 C 42.615 213.060 62.778 217.871 80.555 211.014 C 98.331 204.158 110.040 187.053 110.000 168.000 L 110.000 94.000 L 146.000 94.000 L 146.000 168.000 C 145.960 187.053 157.669 204.158 175.445 211.014 C 193.222 217.871 213.385 213.060 226.149 198.915 C 238.914 184.771 241.638 164.222 233.000 147.240 ZM 64.000 202.000 C 45.222 202.000 30.000 186.778 30.000 168.000 C 30.000 149.222 45.222 134.000 64.000 134.000 C 82.778 134.000 98.000 149.222 98.000 168.000 C 98.000 186.778 82.778 202.000 64.000 202.000 ZM 64.000 122.000 C 57.611 121.998 51.292 123.333 45.450 125.920 L 75.060 58.540 C 81.515 52.791 91.146 52.442 98.000 57.710 L 98.000 137.000 C 89.289 127.430 76.941 121.982 64.000 122.000 ZM 158.000 57.720 C 164.854 52.452 174.485 52.801 180.940 58.550 L 210.550 125.920 C 192.475 117.911 171.303 122.375 158.000 137.000 ZM 192.000 202.000 C 173.222 202.000 158.000 186.778 158.000 168.000 C 158.000 149.222 173.222 134.000 192.000 134.000 C 210.778 134.000 226.000 149.222 226.000 168.000 C 226.000 186.778 210.778 202.000 192.000 202.000 Z"),
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
        return _binoculars!!
    }

private var _binoculars: ImageVector? = null
