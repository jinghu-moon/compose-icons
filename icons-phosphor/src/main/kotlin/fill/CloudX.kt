package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CloudX: ImageVector
    get() {
        if (_cloudX != null) return _cloudX!!
        _cloudX = phosphorFillIcon(
            name = "CloudX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 247.930 124.520 C 246.110 77.540 207.070 40.000 160.060 40.000 C 126.707 40.005 96.217 58.844 81.290 88.670 L 81.290 88.670 C 75.207 100.794 72.027 114.166 72.000 127.730 C 72.065 132.005 68.827 135.609 64.570 136.000 C 62.351 136.158 60.167 135.386 58.541 133.868 C 56.915 132.351 55.994 130.224 56.000 128.000 C 55.992 116.810 57.795 105.693 61.340 95.080 C 61.816 93.694 61.495 92.158 60.505 91.078 C 59.514 89.998 58.012 89.546 56.590 89.900 C 28.069 97.009 8.040 122.607 8.000 152.000 C 8.000 187.190 37.750 216.000 73.000 216.000 L 160.000 216.000 C 183.935 215.974 206.828 206.210 223.414 188.955 C 240.001 171.699 248.851 148.437 247.930 124.520 ZM 189.660 154.340 C 192.786 157.466 192.786 162.534 189.660 165.660 C 186.534 168.786 181.466 168.786 178.340 165.660 L 160.000 147.310 L 141.660 165.660 C 138.534 168.786 133.466 168.786 130.340 165.660 C 127.214 162.534 127.214 157.466 130.340 154.340 L 148.690 136.000 L 130.340 117.660 C 127.214 114.534 127.214 109.466 130.340 106.340 C 133.466 103.214 138.534 103.214 141.660 106.340 L 160.000 124.690 L 178.340 106.340 C 181.466 103.214 186.534 103.214 189.660 106.340 C 192.786 109.466 192.786 114.534 189.660 117.660 L 171.310 136.000 Z"),
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
        return _cloudX!!
    }

private var _cloudX: ImageVector? = null
