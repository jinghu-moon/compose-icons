package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CloudArrowDown: ImageVector
    get() {
        if (_cloudArrowDown != null) return _cloudArrowDown!!
        _cloudArrowDown = phosphorFillIcon(
            name = "CloudArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 247.930 124.520 C 246.110 77.540 207.070 40.000 160.060 40.000 C 126.707 40.005 96.217 58.844 81.290 88.670 L 81.290 88.670 C 75.207 100.794 72.027 114.166 72.000 127.730 C 72.065 132.005 68.827 135.609 64.570 136.000 C 62.351 136.158 60.167 135.386 58.541 133.868 C 56.915 132.351 55.994 130.224 56.000 128.000 C 55.992 116.810 57.795 105.693 61.340 95.080 C 61.816 93.694 61.495 92.158 60.505 91.078 C 59.514 89.998 58.012 89.546 56.590 89.900 C 28.069 97.009 8.040 122.607 8.000 152.000 C 8.000 187.190 37.750 216.000 73.000 216.000 L 160.000 216.000 C 183.935 215.974 206.828 206.210 223.414 188.955 C 240.001 171.699 248.851 148.437 247.930 124.520 ZM 197.660 149.660 L 165.660 181.660 C 164.159 183.162 162.123 184.006 160.000 184.006 C 157.877 184.006 155.841 183.162 154.340 181.660 L 122.340 149.660 C 119.214 146.534 119.214 141.466 122.340 138.340 C 125.466 135.214 130.534 135.214 133.660 138.340 L 152.000 156.690 L 152.000 96.000 C 152.000 91.582 155.582 88.000 160.000 88.000 C 164.418 88.000 168.000 91.582 168.000 96.000 L 168.000 156.690 L 186.340 138.340 C 189.466 135.214 194.534 135.214 197.660 138.340 C 200.786 141.466 200.786 146.534 197.660 149.660 Z"),
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
        return _cloudArrowDown!!
    }

private var _cloudArrowDown: ImageVector? = null
