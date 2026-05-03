package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CoatHanger: ImageVector
    get() {
        if (_coatHanger != null) return _coatHanger!!
        _coatHanger = phosphorLightIcon(
            name = "CoatHanger",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 240.370 172.800 L 138.000 96.000 L 163.590 76.800 C 165.105 75.669 165.998 73.890 166.000 72.000 C 166.000 51.013 148.987 34.000 128.000 34.000 C 107.013 34.000 90.000 51.013 90.000 72.000 C 90.000 75.314 92.686 78.000 96.000 78.000 C 99.314 78.000 102.000 75.314 102.000 72.000 C 102.090 58.267 112.844 46.972 126.557 46.210 C 140.269 45.447 152.209 55.481 153.820 69.120 L 124.500 91.120 L 124.290 91.280 L 15.630 172.800 C 10.814 176.412 8.846 182.699 10.744 188.413 C 12.641 194.127 17.979 197.987 24.000 198.000 L 232.000 198.000 C 238.024 197.996 243.370 194.138 245.273 188.422 C 247.176 182.707 245.209 176.415 240.390 172.800 ZM 233.870 184.630 C 233.646 185.469 232.868 186.039 232.000 186.000 L 24.000 186.000 C 23.141 185.996 22.381 185.443 22.111 184.628 C 21.841 183.812 22.123 182.915 22.810 182.400 L 128.000 103.500 L 233.170 182.400 C 233.903 182.883 234.195 183.815 233.870 184.630 Z"),
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
        return _coatHanger!!
    }

private var _coatHanger: ImageVector? = null
