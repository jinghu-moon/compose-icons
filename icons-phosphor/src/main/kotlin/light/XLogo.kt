package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.XLogo: ImageVector
    get() {
        if (_xLogo != null) return _xLogo!!
        _xLogo = phosphorLightIcon(
            name = "XLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 213.060 212.780 L 149.640 113.120 L 212.440 44.000 C 214.105 42.455 214.754 40.101 214.118 37.921 C 213.481 35.740 211.667 34.106 209.432 33.699 C 207.197 33.293 204.924 34.183 203.560 36.000 L 143.000 102.620 L 101.100 36.780 C 99.992 35.037 98.065 33.987 96.000 34.000 L 48.000 34.000 C 45.811 34.001 43.796 35.194 42.743 37.113 C 41.690 39.032 41.765 41.373 42.940 43.220 L 106.360 142.880 L 43.560 212.000 C 41.695 214.484 42.034 217.981 44.342 220.060 C 46.650 222.139 50.163 222.113 52.440 220.000 L 113.000 153.380 L 154.900 219.220 C 156.008 220.963 157.935 222.013 160.000 222.000 L 208.000 222.000 C 210.189 221.999 212.204 220.806 213.257 218.887 C 214.310 216.968 214.235 214.627 213.060 212.780 ZM 163.290 210.000 L 58.930 46.000 L 92.710 46.000 L 197.070 210.000 Z"),
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
        return _xLogo!!
    }

private var _xLogo: ImageVector? = null
