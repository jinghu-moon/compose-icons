package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CloudCheck: ImageVector
    get() {
        if (_cloudCheck != null) return _cloudCheck!!
        _cloudCheck = phosphorFillIcon(
            name = "CloudCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 247.930 124.520 C 246.110 77.540 207.070 40.000 160.060 40.000 C 126.707 40.005 96.217 58.844 81.290 88.670 L 81.290 88.670 C 75.207 100.794 72.027 114.166 72.000 127.730 C 72.065 132.005 68.827 135.609 64.570 136.000 C 62.351 136.158 60.167 135.386 58.541 133.868 C 56.915 132.351 55.994 130.224 56.000 128.000 C 55.992 116.810 57.795 105.693 61.340 95.080 C 61.816 93.694 61.495 92.158 60.505 91.078 C 59.514 89.998 58.012 89.546 56.590 89.900 C 28.069 97.009 8.040 122.607 8.000 152.000 C 8.000 187.190 37.750 216.000 73.000 216.000 L 160.000 216.000 C 183.935 215.974 206.828 206.210 223.414 188.955 C 240.001 171.699 248.851 148.437 247.930 124.520 ZM 197.660 117.660 L 149.660 165.660 C 148.159 167.162 146.123 168.006 144.000 168.006 C 141.877 168.006 139.841 167.162 138.340 165.660 L 114.340 141.660 C 111.214 138.534 111.214 133.466 114.340 130.340 C 117.466 127.214 122.534 127.214 125.660 130.340 L 144.000 148.690 L 186.340 106.340 C 189.466 103.214 194.534 103.214 197.660 106.340 C 200.786 109.466 200.786 114.534 197.660 117.660 Z"),
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
        return _cloudCheck!!
    }

private var _cloudCheck: ImageVector? = null
