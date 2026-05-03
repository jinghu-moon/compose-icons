package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.EyeClosed: ImageVector
    get() {
        if (_eyeClosed != null) return _eyeClosed!!
        _eyeClosed = phosphorFillIcon(
            name = "EyeClosed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 230.940 164.000 C 233.149 167.836 231.831 172.736 227.995 174.945 C 224.159 177.154 219.259 175.836 217.050 172.000 L 198.050 138.800 C 187.013 146.266 174.838 151.892 162.000 155.460 L 167.870 190.680 C 168.220 192.774 167.723 194.921 166.489 196.649 C 165.255 198.376 163.384 199.542 161.290 199.890 C 160.863 199.960 160.432 199.997 160.000 200.000 C 156.092 199.994 152.760 197.165 152.120 193.310 L 146.350 158.730 C 134.182 160.423 121.838 160.423 109.670 158.730 L 103.900 193.310 C 103.259 197.173 99.916 200.004 96.000 200.000 C 95.558 199.998 95.116 199.961 94.680 199.890 C 92.586 199.542 90.715 198.376 89.481 196.649 C 88.247 194.921 87.750 192.774 88.100 190.680 L 94.000 155.460 C 81.156 151.884 68.978 146.247 57.940 138.770 L 39.000 172.000 C 36.791 175.849 31.879 177.179 28.030 174.970 C 24.181 172.761 22.851 167.849 25.060 164.000 L 45.060 129.000 C 38.032 122.933 31.572 116.239 25.760 109.000 C 23.388 106.066 23.388 101.874 25.760 98.940 C 44.560 75.720 77.550 48.000 128.000 48.000 C 178.450 48.000 211.440 75.720 230.220 99.000 C 232.592 101.934 232.592 106.126 230.220 109.060 C 224.408 116.299 217.948 122.993 210.920 129.060 Z"),
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
        return _eyeClosed!!
    }

private var _eyeClosed: ImageVector? = null
