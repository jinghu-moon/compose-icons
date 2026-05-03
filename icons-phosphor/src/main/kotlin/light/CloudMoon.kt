package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CloudMoon: ImageVector
    get() {
        if (_cloudMoon != null) return _cloudMoon!!
        _cloudMoon = phosphorLightIcon(
            name = "CloudMoon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 172.000 74.000 C 167.244 73.999 162.499 74.455 157.830 75.360 C 155.793 44.549 133.808 18.712 103.720 11.770 C 101.698 11.302 99.577 11.913 98.114 13.385 C 96.650 14.857 96.051 16.980 96.530 19.000 C 100.977 38.471 95.104 58.860 80.982 72.982 C 66.860 87.104 46.471 92.977 27.000 88.530 C 24.986 88.068 22.876 88.674 21.415 90.135 C 19.954 91.596 19.348 93.706 19.810 95.720 C 24.205 114.669 36.263 130.946 53.110 140.670 C 41.061 155.655 38.674 176.223 46.969 193.570 C 55.264 210.917 72.772 221.970 92.000 222.000 L 172.000 222.000 C 212.869 222.000 246.000 188.869 246.000 148.000 C 246.000 107.131 212.869 74.000 172.000 74.000 ZM 34.220 101.760 Q 37.100 102.000 40.000 102.000 C 78.642 101.956 109.956 70.642 110.000 32.000 C 110.000 30.060 109.920 28.120 109.760 26.200 C 131.309 34.812 145.592 55.507 146.000 78.710 C 125.619 86.348 109.610 102.535 102.200 123.000 C 98.843 122.321 95.425 121.986 92.000 122.000 C 81.235 121.988 70.758 125.469 62.140 131.920 C 49.477 125.594 39.552 114.872 34.220 101.760 ZM 172.000 210.000 L 92.000 210.000 C 77.579 209.989 64.407 201.816 57.993 188.900 C 51.580 175.984 53.030 160.550 61.738 149.055 C 70.445 137.560 84.910 131.984 99.080 134.660 C 98.544 137.636 98.187 140.641 98.010 143.660 C 97.817 146.974 100.346 149.817 103.660 150.010 C 106.974 150.203 109.817 147.674 110.010 144.360 C 110.263 140.223 110.933 136.122 112.010 132.120 C 112.010 131.970 112.090 131.830 112.120 131.690 C 120.540 100.656 151.269 81.194 182.924 86.846 C 214.579 92.499 236.673 121.394 233.832 153.423 C 230.991 185.453 204.155 210.008 172.000 210.000 Z"),
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
        return _cloudMoon!!
    }

private var _cloudMoon: ImageVector? = null
