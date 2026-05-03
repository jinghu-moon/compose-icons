package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PersonSimpleSnowboard: ImageVector
    get() {
        if (_personSimpleSnowboard != null) return _personSimpleSnowboard!!
        _personSimpleSnowboard = phosphorRegularIcon(
            name = "PersonSimpleSnowboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 164.000 80.000 C 179.464 80.000 192.000 67.464 192.000 52.000 C 192.000 36.536 179.464 24.000 164.000 24.000 C 148.536 24.000 136.000 36.536 136.000 52.000 C 136.000 67.464 148.536 80.000 164.000 80.000 ZM 164.000 40.000 C 170.627 40.000 176.000 45.373 176.000 52.000 C 176.000 58.627 170.627 64.000 164.000 64.000 C 157.373 64.000 152.000 58.627 152.000 52.000 C 152.000 45.373 157.373 40.000 164.000 40.000 ZM 218.250 112.320 L 82.250 72.320 C 78.011 71.072 73.563 73.496 72.315 77.735 C 71.067 81.974 73.491 86.422 77.730 87.670 L 118.580 99.670 L 85.070 150.000 L 40.340 137.000 C 26.991 133.098 13.007 140.756 9.105 154.105 C 5.203 167.454 12.861 181.438 26.210 185.340 L 183.650 231.000 C 185.972 231.665 188.375 232.001 190.790 232.000 C 203.343 232.022 213.993 222.793 215.756 210.364 C 217.518 197.936 209.854 186.109 197.790 182.640 L 146.900 167.890 L 166.650 138.450 C 168.072 136.329 168.396 133.657 167.523 131.258 C 166.649 128.858 164.683 127.020 162.230 126.310 L 126.900 116.080 L 134.680 104.410 L 213.750 127.670 C 217.968 128.854 222.353 126.426 223.588 122.223 C 224.823 118.020 222.448 113.606 218.260 112.320 ZM 200.000 206.810 C 200.004 209.688 198.642 212.397 196.330 214.110 C 193.983 215.887 190.933 216.443 188.110 215.610 L 30.670 170.000 C 26.746 168.864 24.033 165.285 24.000 161.200 C 23.992 158.324 25.350 155.614 27.660 153.900 C 30.008 152.119 33.064 151.562 35.890 152.400 L 193.330 198.000 C 197.260 199.134 199.974 202.720 200.000 206.810 ZM 147.250 138.630 L 130.760 163.220 L 101.180 154.640 L 117.580 130.040 Z"),
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
