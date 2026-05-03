package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Lighthouse: ImageVector
    get() {
        if (_lighthouse != null) return _lighthouse!!
        _lighthouse = phosphorLightIcon(
            name = "Lighthouse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 82.000 C 204.686 82.000 202.000 84.686 202.000 88.000 L 202.000 106.000 L 187.000 106.000 L 182.000 55.400 C 181.844 53.901 181.130 52.516 180.000 51.520 L 137.110 13.370 L 136.960 13.250 C 131.769 8.926 124.231 8.926 119.040 13.250 L 118.890 13.370 L 76.000 51.520 C 74.870 52.516 74.156 53.901 74.000 55.400 L 69.000 106.000 L 54.000 106.000 L 54.000 88.000 C 54.000 84.686 51.314 82.000 48.000 82.000 C 44.686 82.000 42.000 84.686 42.000 88.000 L 42.000 112.000 C 42.000 115.314 44.686 118.000 48.000 118.000 L 67.750 118.000 L 58.060 214.670 C 57.685 218.597 58.985 222.500 61.639 225.419 C 64.293 228.337 68.055 230.001 72.000 230.000 L 184.000 230.000 C 187.949 229.999 191.714 228.330 194.367 225.405 C 197.020 222.480 198.314 218.570 197.930 214.640 L 188.250 118.000 L 208.000 118.000 C 211.314 118.000 214.000 115.314 214.000 112.000 L 214.000 88.000 C 214.000 84.686 211.314 82.000 208.000 82.000 ZM 126.770 22.420 C 127.493 21.856 128.507 21.856 129.230 22.420 L 160.230 50.000 L 95.770 50.000 ZM 85.430 62.000 L 170.570 62.000 L 175.000 106.000 L 134.000 106.000 L 134.000 88.000 C 134.000 84.686 131.314 82.000 128.000 82.000 C 124.686 82.000 122.000 84.686 122.000 88.000 L 122.000 106.000 L 81.000 106.000 ZM 185.430 217.350 C 185.062 217.753 184.545 217.987 184.000 218.000 L 72.000 218.000 C 71.441 218.002 70.906 217.769 70.526 217.359 C 70.146 216.948 69.955 216.398 70.000 215.840 L 74.200 174.000 L 181.800 174.000 L 186.000 215.810 C 186.052 216.374 185.864 216.933 185.480 217.350 ZM 180.600 162.000 L 75.400 162.000 L 79.810 118.000 L 176.190 118.000 Z"),
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
        return _lighthouse!!
    }

private var _lighthouse: ImageVector? = null
