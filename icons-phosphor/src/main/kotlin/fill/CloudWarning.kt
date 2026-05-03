package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CloudWarning: ImageVector
    get() {
        if (_cloudWarning != null) return _cloudWarning!!
        _cloudWarning = phosphorFillIcon(
            name = "CloudWarning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 247.930 124.520 C 246.110 77.540 207.070 40.000 160.060 40.000 C 126.707 40.005 96.217 58.844 81.290 88.670 L 81.290 88.670 C 75.207 100.794 72.027 114.166 72.000 127.730 C 72.065 132.005 68.827 135.609 64.570 136.000 C 62.351 136.158 60.167 135.386 58.541 133.868 C 56.915 132.351 55.994 130.224 56.000 128.000 C 55.992 116.810 57.795 105.693 61.340 95.080 C 61.816 93.694 61.495 92.158 60.505 91.078 C 59.514 89.998 58.012 89.546 56.590 89.900 C 28.069 97.009 8.040 122.607 8.000 152.000 C 8.000 187.190 37.750 216.000 73.000 216.000 L 160.000 216.000 C 183.935 215.974 206.828 206.210 223.414 188.955 C 240.001 171.699 248.851 148.437 247.930 124.520 ZM 152.000 88.000 C 152.000 83.582 155.582 80.000 160.000 80.000 C 164.418 80.000 168.000 83.582 168.000 88.000 L 168.000 128.000 C 168.000 132.418 164.418 136.000 160.000 136.000 C 155.582 136.000 152.000 132.418 152.000 128.000 ZM 160.000 176.000 C 153.373 176.000 148.000 170.627 148.000 164.000 C 148.000 157.373 153.373 152.000 160.000 152.000 C 166.627 152.000 172.000 157.373 172.000 164.000 C 172.000 170.627 166.627 176.000 160.000 176.000 Z"),
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
        return _cloudWarning!!
    }

private var _cloudWarning: ImageVector? = null
