package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ThermometerCold: ImageVector
    get() {
        if (_thermometerCold != null) return _thermometerCold!!
        _thermometerCold = phosphorDuotoneIcon(
            name = "ThermometerCold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 152.000 138.000 L 152.000 48.000 C 152.000 30.327 137.673 16.000 120.000 16.000 C 102.327 16.000 88.000 30.327 88.000 48.000 L 88.000 138.000 C 67.920 151.982 59.243 177.381 66.570 200.726 C 73.897 224.071 95.532 239.956 120.000 239.956 C 144.468 239.956 166.103 224.071 173.430 200.726 C 180.757 177.381 172.080 151.982 152.000 138.000 ZM 120.000 208.000 C 106.745 208.000 96.000 197.255 96.000 184.000 C 96.000 170.745 106.745 160.000 120.000 160.000 C 133.255 160.000 144.000 170.745 144.000 184.000 C 144.000 197.255 133.255 208.000 120.000 208.000 Z"),
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
                pathData = parseSvgPathData("M 248.910 77.720 L 228.910 84.210 L 241.250 101.210 C 243.025 103.517 243.408 106.606 242.248 109.276 C 241.089 111.946 238.570 113.776 235.672 114.053 C 232.775 114.330 229.955 113.012 228.310 110.610 L 216.000 93.610 L 203.660 110.610 C 201.018 114.043 196.123 114.749 192.618 112.203 C 189.114 109.657 188.272 104.784 190.720 101.210 L 203.060 84.210 L 183.060 77.720 C 178.857 76.356 176.556 71.843 177.920 67.640 C 179.284 63.437 183.797 61.136 188.000 62.500 L 208.000 69.000 L 208.000 48.000 C 208.000 43.582 211.582 40.000 216.000 40.000 C 220.418 40.000 224.000 43.582 224.000 48.000 L 224.000 69.000 L 244.000 62.510 C 248.203 61.143 252.718 63.442 254.085 67.645 C 255.452 71.848 253.153 76.363 248.950 77.730 ZM 152.000 184.000 C 151.992 200.627 139.250 214.478 122.681 215.871 C 106.112 217.265 91.237 205.736 88.452 189.344 C 85.667 172.951 95.901 157.157 112.000 153.000 L 112.000 120.000 C 112.000 115.582 115.582 112.000 120.000 112.000 C 124.418 112.000 128.000 115.582 128.000 120.000 L 128.000 153.000 C 142.122 156.668 151.986 169.409 152.000 184.000 ZM 136.000 184.000 C 136.000 175.163 128.837 168.000 120.000 168.000 C 111.163 168.000 104.000 175.163 104.000 184.000 C 104.000 192.837 111.163 200.000 120.000 200.000 C 128.837 200.000 136.000 192.837 136.000 184.000 ZM 184.000 184.000 C 183.981 213.839 163.345 239.706 134.256 246.352 C 105.166 252.999 75.344 238.661 62.368 211.791 C 49.392 184.921 56.707 152.649 80.000 134.000 L 80.000 48.000 C 80.000 25.909 97.909 8.000 120.000 8.000 C 142.091 8.000 160.000 25.909 160.000 48.000 L 160.000 134.000 C 175.172 146.162 184.000 164.555 184.000 184.000 ZM 168.000 184.000 C 167.987 168.294 160.304 153.584 147.420 144.600 C 145.265 143.095 143.987 140.628 144.000 138.000 L 144.000 48.000 C 144.000 34.745 133.255 24.000 120.000 24.000 C 106.745 24.000 96.000 34.745 96.000 48.000 L 96.000 138.000 C 96.000 140.614 94.723 143.063 92.580 144.560 C 73.883 157.573 66.907 181.936 75.884 202.873 C 84.861 223.809 107.318 235.553 129.634 230.980 C 151.951 226.408 167.980 206.780 168.000 184.000 Z"),
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
        return _thermometerCold!!
    }

private var _thermometerCold: ImageVector? = null
