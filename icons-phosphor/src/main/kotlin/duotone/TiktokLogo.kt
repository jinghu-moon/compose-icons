package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TiktokLogo: ImageVector
    get() {
        if (_tiktokLogo != null) return _tiktokLogo!!
        _tiktokLogo = phosphorDuotoneIcon(
            name = "TiktokLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 120.000 C 203.905 120.038 184.309 113.739 168.000 102.000 L 168.000 156.000 C 168.000 193.555 137.555 224.000 100.000 224.000 C 62.445 224.000 32.000 193.555 32.000 156.000 C 32.000 122.540 56.170 93.670 88.000 88.000 L 88.000 130.690 C 75.467 136.635 69.176 150.861 73.211 164.133 C 77.245 177.404 90.390 185.721 104.111 183.685 C 117.832 181.648 127.994 169.872 128.000 156.000 L 128.000 24.000 L 168.000 24.000 C 168.000 54.928 193.072 80.000 224.000 80.000 Z"),
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
                pathData = parseSvgPathData("M 224.000 72.000 C 197.502 71.972 176.028 50.498 176.000 24.000 C 176.000 19.582 172.418 16.000 168.000 16.000 L 128.000 16.000 C 123.582 16.000 120.000 19.582 120.000 24.000 L 120.000 156.000 C 119.995 165.908 112.737 174.320 102.935 175.774 C 93.134 177.229 83.746 171.287 80.864 161.807 C 77.983 152.327 82.477 142.166 91.430 137.920 C 94.222 136.595 96.001 133.780 96.000 130.690 L 96.000 88.000 C 96.001 85.633 94.954 83.387 93.139 81.866 C 91.325 80.345 88.931 79.706 86.600 80.120 C 50.910 86.480 24.000 119.100 24.000 156.000 C 24.000 197.974 58.026 232.000 100.000 232.000 C 141.974 232.000 176.000 197.974 176.000 156.000 L 176.000 116.290 C 190.817 124.020 207.288 128.039 224.000 128.000 C 228.418 128.000 232.000 124.418 232.000 120.000 L 232.000 80.000 C 232.000 75.582 228.418 72.000 224.000 72.000 ZM 216.000 111.640 C 200.366 110.255 185.397 104.675 172.670 95.490 C 170.231 93.737 167.016 93.497 164.344 94.870 C 161.672 96.243 159.995 98.996 160.000 102.000 L 160.000 156.000 C 160.000 189.137 133.137 216.000 100.000 216.000 C 66.863 216.000 40.000 189.137 40.000 156.000 C 40.000 130.100 56.640 106.870 80.000 98.400 L 80.000 126.070 C 65.719 135.612 60.168 153.913 66.741 169.780 C 73.314 185.648 90.180 194.663 107.025 191.311 C 123.870 187.960 136.002 173.175 136.000 156.000 L 136.000 32.000 L 160.500 32.000 C 164.200 60.981 187.019 83.800 216.000 87.500 Z"),
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
        return _tiktokLogo!!
    }

private var _tiktokLogo: ImageVector? = null
