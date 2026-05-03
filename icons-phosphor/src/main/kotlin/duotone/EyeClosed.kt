package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.EyeClosed: ImageVector
    get() {
        if (_eyeClosed != null) return _eyeClosed!!
        _eyeClosed = phosphorDuotoneIcon(
            name = "EyeClosed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 224.000 104.000 C 207.190 124.810 176.370 152.000 128.000 152.000 C 79.630 152.000 48.810 124.810 32.000 104.000 C 48.810 83.190 79.630 56.000 128.000 56.000 C 176.370 56.000 207.190 83.190 224.000 104.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 228.000 175.000 C 226.155 176.052 223.966 176.327 221.918 175.765 C 219.869 175.202 218.129 173.847 217.080 172.000 L 198.080 138.800 C 187.034 146.269 174.849 151.895 162.000 155.460 L 167.870 190.680 C 168.220 192.774 167.723 194.921 166.489 196.649 C 165.255 198.376 163.384 199.542 161.290 199.890 C 160.863 199.960 160.432 199.997 160.000 200.000 C 156.092 199.994 152.760 197.165 152.120 193.310 L 146.350 158.730 C 134.182 160.423 121.838 160.423 109.670 158.730 L 103.900 193.310 C 103.259 197.173 99.916 200.004 96.000 200.000 C 95.558 199.998 95.116 199.961 94.680 199.890 C 92.586 199.542 90.715 198.376 89.481 196.649 C 88.247 194.921 87.750 192.774 88.100 190.680 L 94.000 155.460 C 81.156 151.884 68.978 146.247 57.940 138.770 L 39.000 172.000 C 36.791 175.849 31.879 177.179 28.030 174.970 C 24.181 172.761 22.851 167.849 25.060 164.000 L 45.060 129.000 C 38.035 122.931 31.575 116.237 25.760 109.000 C 23.784 106.794 23.189 103.677 24.212 100.898 C 25.236 98.119 27.710 96.133 30.645 95.735 C 33.580 95.337 36.494 96.594 38.220 99.000 C 54.820 119.540 83.860 144.000 128.000 144.000 C 172.140 144.000 201.180 119.510 217.780 99.000 C 219.487 96.543 222.422 95.244 225.388 95.633 C 228.355 96.021 230.856 98.032 231.873 100.846 C 232.890 103.659 232.252 106.805 230.220 109.000 C 224.405 116.237 217.945 122.931 210.920 129.000 L 230.920 164.000 C 232.004 165.843 232.306 168.043 231.757 170.110 C 231.209 172.177 229.856 173.938 228.000 175.000 Z"),
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
