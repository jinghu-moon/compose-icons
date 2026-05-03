package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.RainbowCloud: ImageVector
    get() {
        if (_rainbowCloud != null) return _rainbowCloud!!
        _rainbowCloud = phosphorDuotoneIcon(
            name = "RainbowCloud",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 240.000 160.000 C 240.000 182.091 222.091 200.000 200.000 200.000 L 152.000 200.000 C 138.750 200.000 128.000 188.860 128.000 175.110 C 128.000 161.360 138.750 150.220 152.000 150.220 C 155.021 150.221 158.013 150.808 160.810 151.950 C 164.923 131.825 183.610 118.087 204.045 120.164 C 224.481 122.241 240.021 139.459 240.000 160.000 Z"),
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
        pathData = parseSvgPathData("M 200.000 112.000 C 180.298 112.049 162.611 124.088 155.340 142.400 C 154.231 142.280 153.116 142.220 152.000 142.220 C 134.350 142.220 120.000 156.980 120.000 175.110 C 120.000 193.240 134.350 208.000 152.000 208.000 L 200.000 208.000 C 226.510 208.000 248.000 186.510 248.000 160.000 C 248.000 133.490 226.510 112.000 200.000 112.000 ZM 200.000 192.000 L 152.000 192.000 C 143.180 192.000 136.000 184.420 136.000 175.110 C 136.000 165.800 143.180 158.220 152.000 158.220 C 153.983 158.214 155.948 158.602 157.780 159.360 C 159.986 160.263 162.479 160.135 164.581 159.012 C 166.684 157.888 168.175 155.886 168.650 153.550 C 172.043 137.063 187.628 126.023 204.307 128.292 C 220.986 130.562 233.056 145.364 231.920 162.159 C 230.785 178.953 216.833 191.996 200.000 192.000 ZM 24.000 160.000 L 24.000 176.000 C 24.000 180.418 20.418 184.000 16.000 184.000 C 11.582 184.000 8.000 180.418 8.000 176.000 L 8.000 160.000 C 8.001 118.202 33.026 80.466 71.530 64.201 C 110.033 47.936 154.533 56.302 184.500 85.440 C 187.555 88.539 187.572 93.512 184.539 96.632 C 181.506 99.753 176.534 99.876 173.350 96.910 C 147.993 72.252 110.338 65.171 77.756 78.935 C 45.175 92.698 23.999 124.631 24.000 160.000 ZM 56.000 160.000 L 56.000 176.000 C 56.000 180.418 52.418 184.000 48.000 184.000 C 43.582 184.000 40.000 180.418 40.000 176.000 L 40.000 160.000 C 40.017 132.871 55.282 108.055 79.487 95.804 C 103.693 83.554 132.729 85.949 154.600 102.000 C 156.986 103.661 158.283 106.485 157.988 109.377 C 157.694 112.269 155.854 114.773 153.182 115.919 C 150.511 117.064 147.428 116.670 145.130 114.890 C 128.120 102.408 105.537 100.546 86.712 110.074 C 67.887 119.601 56.015 138.901 56.000 160.000 ZM 117.570 136.650 C 110.425 134.945 102.892 136.607 97.126 141.159 C 91.361 145.712 87.998 152.654 88.000 160.000 L 88.000 176.000 C 88.000 180.418 84.418 184.000 80.000 184.000 C 75.582 184.000 72.000 180.418 72.000 176.000 L 72.000 160.000 C 71.997 147.759 77.600 136.191 87.205 128.603 C 96.811 121.015 109.362 118.243 121.270 121.080 C 125.570 122.102 128.227 126.415 127.205 130.715 C 126.183 135.015 121.870 137.672 117.570 136.650 Z"),
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
        return _rainbowCloud!!
    }

private var _rainbowCloud: ImageVector? = null
