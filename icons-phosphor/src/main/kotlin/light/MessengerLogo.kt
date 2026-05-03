package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MessengerLogo: ImageVector
    get() {
        if (_messengerLogo != null) return _messengerLogo!!
        _messengerLogo = phosphorLightIcon(
            name = "MessengerLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 180.240 107.760 C 182.580 110.103 182.580 113.897 180.240 116.240 L 148.240 148.240 C 145.897 150.580 142.103 150.580 139.760 148.240 L 112.000 120.490 L 84.240 148.240 C 81.876 150.443 78.192 150.378 75.907 148.093 C 73.622 145.808 73.557 142.124 75.760 139.760 L 107.760 107.760 C 110.103 105.420 113.897 105.420 116.240 107.760 L 144.000 135.510 L 171.760 107.760 C 174.103 105.420 177.897 105.420 180.240 107.760 ZM 230.000 128.000 C 230.008 163.972 211.066 197.289 180.151 215.681 C 149.236 234.073 110.919 234.822 79.310 217.650 L 44.440 229.270 C 39.409 230.948 33.862 229.639 30.111 225.889 C 26.361 222.138 25.052 216.591 26.730 211.560 L 38.350 176.690 C 18.056 139.294 23.107 93.230 51.021 61.120 C 78.935 29.010 123.848 17.599 163.704 32.492 C 203.559 47.385 229.984 85.453 230.000 128.000 ZM 218.000 128.000 C 217.991 90.161 194.315 56.369 158.754 43.439 C 123.194 30.509 83.343 41.203 59.032 70.199 C 34.722 99.195 31.144 140.300 50.080 173.060 C 50.943 174.549 51.125 176.337 50.580 177.970 L 38.120 215.350 C 37.880 216.069 38.067 216.861 38.603 217.397 C 39.139 217.933 39.931 218.120 40.650 217.880 L 78.000 205.420 C 78.613 205.218 79.254 205.114 79.900 205.110 C 80.953 205.116 81.987 205.395 82.900 205.920 C 110.749 222.046 145.089 222.076 172.965 205.998 C 200.842 189.920 218.013 160.181 218.000 128.000 Z"),
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
        return _messengerLogo!!
    }

private var _messengerLogo: ImageVector? = null
