package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CloudLightning: ImageVector
    get() {
        if (_cloudLightning != null) return _cloudLightning!!
        _cloudLightning = phosphorDuotoneIcon(
            name = "CloudLightning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 92.000 C 224.000 129.555 193.555 160.000 156.000 160.000 L 76.000 160.000 C 58.556 159.983 42.769 149.663 35.755 133.690 C 28.742 117.718 31.826 99.111 43.618 86.256 C 55.411 73.401 73.683 68.727 90.200 74.340 L 90.200 74.450 C 99.038 41.473 130.940 20.146 164.791 24.587 C 198.642 29.027 223.966 57.859 224.000 92.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 156.000 16.000 C 124.507 16.003 96.261 35.380 84.920 64.760 C 81.973 64.257 78.989 64.003 76.000 64.000 C 47.281 64.000 24.000 87.281 24.000 116.000 C 24.000 144.719 47.281 168.000 76.000 168.000 L 113.870 168.000 L 97.140 195.880 C 95.655 198.352 95.615 201.431 97.035 203.941 C 98.456 206.450 101.117 208.001 104.000 208.000 L 129.870 208.000 L 113.140 235.880 C 110.865 239.669 112.091 244.585 115.880 246.860 C 119.669 249.135 124.585 247.909 126.860 244.120 L 150.860 204.120 C 152.345 201.648 152.385 198.569 150.965 196.059 C 149.544 193.550 146.883 191.999 144.000 192.000 L 118.130 192.000 L 132.530 168.000 L 156.000 168.000 C 197.974 168.000 232.000 133.974 232.000 92.000 C 232.000 50.026 197.974 16.000 156.000 16.000 ZM 156.000 152.000 L 76.000 152.000 C 56.118 152.000 40.000 135.882 40.000 116.000 C 40.000 96.118 56.118 80.000 76.000 80.000 C 77.598 80.003 79.195 80.107 80.780 80.310 Q 80.220 83.880 80.010 87.540 C 79.756 91.958 83.132 95.746 87.550 96.000 C 91.968 96.254 95.756 92.878 96.010 88.460 C 97.906 55.801 125.590 30.666 158.280 31.924 C 190.969 33.183 216.639 60.372 216.018 93.080 C 215.397 125.788 188.714 151.983 156.000 152.000 Z"),
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
        return _cloudLightning!!
    }

private var _cloudLightning: ImageVector? = null
