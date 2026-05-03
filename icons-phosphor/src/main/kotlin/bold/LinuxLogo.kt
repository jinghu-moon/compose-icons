package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LinuxLogo: ImageVector
    get() {
        if (_linuxLogo != null) return _linuxLogo!!
        _linuxLogo = phosphorBoldIcon(
            name = "LinuxLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 231.490 217.380 C 229.000 219.373 225.820 220.292 222.651 219.936 C 219.482 219.579 216.585 217.976 214.600 215.480 C 213.190 213.720 180.000 171.240 180.000 88.000 C 180.000 59.281 156.719 36.000 128.000 36.000 C 99.281 36.000 76.000 59.281 76.000 88.000 C 76.000 171.240 42.790 213.720 41.380 215.480 C 37.252 220.666 29.701 221.523 24.515 217.395 C 19.329 213.267 18.472 205.716 22.600 200.530 C 23.000 200.000 52.000 162.060 52.000 88.000 C 52.000 46.026 86.026 12.000 128.000 12.000 C 169.974 12.000 204.000 46.026 204.000 88.000 C 204.000 162.190 233.100 200.160 233.400 200.540 C 237.514 205.720 236.659 213.253 231.490 217.380 ZM 104.000 120.000 C 112.837 120.000 120.000 112.837 120.000 104.000 C 120.000 95.163 112.837 88.000 104.000 88.000 C 95.163 88.000 88.000 95.163 88.000 104.000 C 88.000 112.837 95.163 120.000 104.000 120.000 ZM 168.000 104.000 C 168.000 95.163 160.837 88.000 152.000 88.000 C 143.163 88.000 136.000 95.163 136.000 104.000 C 136.000 112.837 143.163 120.000 152.000 120.000 C 160.837 120.000 168.000 112.837 168.000 104.000 ZM 95.260 155.000 L 123.260 167.000 C 126.277 168.293 129.693 168.293 132.710 167.000 L 160.710 155.000 C 166.323 152.119 168.746 145.385 166.256 139.588 C 163.766 133.791 157.213 130.913 151.260 133.000 L 127.990 143.000 L 104.720 133.000 C 98.762 130.892 92.190 133.766 89.693 139.572 C 87.197 145.378 89.631 152.126 95.260 155.000 ZM 128.000 184.000 C 113.669 184.021 99.870 189.429 89.340 199.150 C 84.455 203.632 84.128 211.225 88.610 216.110 C 93.092 220.995 100.685 221.322 105.570 216.840 C 118.196 205.052 137.794 205.052 150.420 216.840 C 155.305 221.322 162.898 220.995 167.380 216.110 C 171.862 211.225 171.535 203.632 166.650 199.150 C 156.124 189.430 142.328 184.022 128.000 184.000 Z"),
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
        return _linuxLogo!!
    }

private var _linuxLogo: ImageVector? = null
