package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GoogleChromeLogo: ImageVector
    get() {
        if (_googleChromeLogo != null) return _googleChromeLogo!!
        _googleChromeLogo = phosphorLightIcon(
            name = "GoogleChromeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 38.000 C 159.731 38.009 189.112 54.727 205.330 82.000 L 128.000 82.000 C 106.395 82.030 87.713 97.070 83.070 118.170 L 56.910 72.870 C 73.937 50.876 100.185 38.001 128.000 38.000 ZM 162.000 128.000 C 162.000 146.778 146.778 162.000 128.000 162.000 C 109.222 162.000 94.000 146.778 94.000 128.000 C 94.000 109.222 109.222 94.000 128.000 94.000 C 146.778 94.000 162.000 109.222 162.000 128.000 ZM 38.000 128.000 C 37.976 112.587 41.938 97.430 49.500 84.000 L 88.160 151.000 C 88.220 151.100 88.290 151.180 88.350 151.270 C 99.213 169.840 121.509 178.385 142.000 171.830 L 115.830 217.170 C 71.271 211.032 38.058 172.980 38.000 128.000 ZM 129.160 218.000 L 167.840 151.000 L 168.050 150.590 C 178.626 131.929 174.869 108.432 159.000 94.000 L 211.370 94.000 C 222.618 121.562 219.511 152.902 203.068 177.718 C 186.626 202.534 158.976 217.614 129.210 218.000 Z"),
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
        return _googleChromeLogo!!
    }

private var _googleChromeLogo: ImageVector? = null
