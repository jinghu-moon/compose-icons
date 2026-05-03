package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.RainbowCloud: ImageVector
    get() {
        if (_rainbowCloud != null) return _rainbowCloud!!
        _rainbowCloud = phosphorFillIcon(
            name = "RainbowCloud",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 248.000 160.000 C 247.972 186.498 226.498 207.972 200.000 208.000 L 152.000 208.000 C 134.350 208.000 120.000 193.250 120.000 175.110 C 120.000 156.970 134.350 142.220 152.000 142.220 C 153.116 142.220 154.231 142.280 155.340 142.400 C 163.791 120.946 186.303 108.532 208.957 112.835 C 231.611 117.138 248.004 136.941 248.000 160.000 ZM 112.000 72.000 C 134.922 71.954 156.948 80.897 173.350 96.910 C 176.534 99.876 181.506 99.753 184.539 96.632 C 187.572 93.512 187.555 88.539 184.500 85.440 C 154.533 56.302 110.033 47.936 71.530 64.201 C 33.026 80.466 8.001 118.202 8.000 160.000 L 8.000 176.000 C 8.000 180.418 11.582 184.000 16.000 184.000 C 20.418 184.000 24.000 180.418 24.000 176.000 L 24.000 160.000 C 24.055 111.422 63.422 72.055 112.000 72.000 ZM 112.000 104.000 C 123.920 103.967 135.535 107.768 145.130 114.840 C 147.405 116.799 150.586 117.319 153.366 116.187 C 156.147 115.055 158.060 112.462 158.320 109.471 C 158.580 106.480 157.144 103.595 154.600 102.000 C 132.729 85.949 103.693 83.554 79.487 95.804 C 55.282 108.055 40.017 132.871 40.000 160.000 L 40.000 176.000 C 40.000 180.418 43.582 184.000 48.000 184.000 C 52.418 184.000 56.000 180.418 56.000 176.000 L 56.000 160.000 C 56.033 129.086 81.086 104.033 112.000 104.000 ZM 127.210 130.710 C 127.700 128.645 127.349 126.471 126.235 124.665 C 125.121 122.859 123.335 121.569 121.270 121.080 C 109.362 118.243 96.811 121.015 87.205 128.603 C 77.600 136.191 71.997 147.759 72.000 160.000 L 72.000 176.000 C 72.000 180.418 75.582 184.000 80.000 184.000 C 84.418 184.000 88.000 180.418 88.000 176.000 L 88.000 160.000 C 87.998 152.654 91.361 145.712 97.126 141.159 C 102.892 136.607 110.425 134.945 117.570 136.650 C 119.636 137.143 121.813 136.793 123.622 135.679 C 125.430 134.565 126.721 132.777 127.210 130.710 Z"),
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
        return _rainbowCloud!!
    }

private var _rainbowCloud: ImageVector? = null
