package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Bird: ImageVector
    get() {
        if (_bird != null) return _bird!!
        _bird = phosphorLightIcon(
            name = "Bird",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 174.000 68.000 C 174.000 73.523 169.523 78.000 164.000 78.000 C 158.477 78.000 154.000 73.523 154.000 68.000 C 154.000 62.477 158.477 58.000 164.000 58.000 C 169.523 58.000 174.000 62.477 174.000 68.000 ZM 238.000 80.000 C 238.003 82.009 237.001 83.885 235.330 85.000 L 214.000 99.210 L 214.000 120.000 C 213.934 176.306 168.306 221.934 112.000 222.000 L 24.000 222.000 C 18.617 222.000 13.711 218.915 11.380 214.063 C 9.049 209.211 9.706 203.452 13.070 199.250 L 13.140 199.160 L 98.000 97.350 L 98.000 76.890 C 98.000 44.570 123.890 18.150 155.720 18.000 L 156.000 18.000 C 181.541 17.992 204.081 34.693 211.510 59.130 L 235.330 75.000 C 237.001 76.115 238.003 77.991 238.000 80.000 ZM 221.180 80.000 L 203.000 67.880 C 201.774 67.064 200.892 65.825 200.520 64.400 C 195.240 44.137 176.940 29.997 156.000 30.000 L 155.770 30.000 C 130.530 30.120 110.000 51.160 110.000 76.890 L 110.000 99.520 C 110.002 100.927 109.510 102.289 108.610 103.370 L 22.430 206.780 C 21.967 207.382 21.884 208.194 22.217 208.877 C 22.550 209.559 23.241 209.994 24.000 210.000 L 51.860 210.000 L 123.390 124.160 C 125.519 121.645 129.278 121.318 131.809 123.427 C 134.341 125.536 134.699 129.291 132.610 131.840 L 67.480 210.000 L 112.000 210.000 C 161.683 209.945 201.945 169.683 202.000 120.000 L 202.000 96.000 C 201.997 93.991 202.999 92.115 204.670 91.000 Z"),
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
        return _bird!!
    }

private var _bird: ImageVector? = null
