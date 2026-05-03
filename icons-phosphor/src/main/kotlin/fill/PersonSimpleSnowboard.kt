package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PersonSimpleSnowboard: ImageVector
    get() {
        if (_personSimpleSnowboard != null) return _personSimpleSnowboard!!
        _personSimpleSnowboard = phosphorFillIcon(
            name = "PersonSimpleSnowboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 136.000 52.000 C 136.000 36.536 148.536 24.000 164.000 24.000 C 179.464 24.000 192.000 36.536 192.000 52.000 C 192.000 67.464 179.464 80.000 164.000 80.000 C 148.536 80.000 136.000 67.464 136.000 52.000 ZM 223.670 122.250 C 222.424 126.489 217.979 128.915 213.740 127.670 L 134.670 104.410 L 126.890 116.080 L 162.220 126.310 C 164.673 127.020 166.639 128.858 167.513 131.258 C 168.386 133.657 168.062 136.329 166.640 138.450 L 146.890 167.890 L 197.780 182.640 C 208.530 185.780 215.941 195.610 216.000 206.810 C 215.951 220.709 204.689 231.962 190.790 232.000 C 188.375 232.001 185.972 231.665 183.650 231.000 L 26.210 185.350 C 15.463 182.206 8.058 172.377 8.000 161.180 C 8.017 153.238 11.769 145.767 18.130 141.012 C 24.490 136.256 32.718 134.770 40.340 137.000 L 85.070 150.000 L 118.590 99.720 L 77.740 87.720 C 73.501 86.472 71.077 82.024 72.325 77.785 C 73.573 73.546 78.021 71.122 82.260 72.370 L 218.260 112.370 C 222.469 113.621 224.884 118.030 223.670 122.250 ZM 117.580 130.000 L 101.180 154.600 L 130.760 163.180 L 147.250 138.590 Z"),
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
        return _personSimpleSnowboard!!
    }

private var _personSimpleSnowboard: ImageVector? = null
