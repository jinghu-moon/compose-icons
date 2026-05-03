package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CloudArrowUp: ImageVector
    get() {
        if (_cloudArrowUp != null) return _cloudArrowUp!!
        _cloudArrowUp = phosphorFillIcon(
            name = "CloudArrowUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 247.930 124.520 C 246.110 77.540 207.070 40.000 160.060 40.000 C 126.707 40.005 96.217 58.844 81.290 88.670 L 81.290 88.670 C 75.207 100.794 72.027 114.166 72.000 127.730 C 72.065 132.005 68.827 135.609 64.570 136.000 C 62.351 136.158 60.167 135.386 58.541 133.868 C 56.915 132.351 55.994 130.224 56.000 128.000 C 55.992 116.810 57.795 105.693 61.340 95.080 C 61.816 93.694 61.495 92.158 60.505 91.078 C 59.514 89.998 58.012 89.546 56.590 89.900 C 28.069 97.009 8.040 122.607 8.000 152.000 C 8.000 187.190 37.750 216.000 73.000 216.000 L 160.000 216.000 C 183.935 215.974 206.828 206.210 223.414 188.955 C 240.001 171.699 248.851 148.437 247.930 124.520 ZM 197.660 133.660 C 196.159 135.162 194.123 136.006 192.000 136.006 C 189.877 136.006 187.841 135.162 186.340 133.660 L 168.000 115.310 L 168.000 176.000 C 168.000 180.418 164.418 184.000 160.000 184.000 C 155.582 184.000 152.000 180.418 152.000 176.000 L 152.000 115.310 L 133.660 133.660 C 130.534 136.786 125.466 136.786 122.340 133.660 C 119.214 130.534 119.214 125.466 122.340 122.340 L 154.340 90.340 C 155.841 88.838 157.877 87.994 160.000 87.994 C 162.123 87.994 164.159 88.838 165.660 90.340 L 197.660 122.340 C 199.162 123.841 200.006 125.877 200.006 128.000 C 200.006 130.123 199.162 132.159 197.660 133.660 Z"),
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
        return _cloudArrowUp!!
    }

private var _cloudArrowUp: ImageVector? = null
