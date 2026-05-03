package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HandbagSimple: ImageVector
    get() {
        if (_handbagSimple != null) return _handbagSimple!!
        _handbagSimple = phosphorLightIcon(
            name = "HandbagSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 237.900 198.360 L 223.650 78.360 C 222.789 71.288 216.774 65.978 209.650 66.000 L 174.000 66.000 L 174.000 64.000 C 174.000 38.595 153.405 18.000 128.000 18.000 C 102.595 18.000 82.000 38.595 82.000 64.000 L 82.000 66.000 L 46.330 66.000 C 39.206 65.978 33.191 71.288 32.330 78.360 L 18.080 198.360 C 17.610 202.348 18.874 206.346 21.552 209.338 C 24.231 212.330 28.065 214.028 32.080 214.000 L 223.920 214.000 C 227.935 214.028 231.769 212.330 234.448 209.338 C 237.126 206.346 238.390 202.348 237.920 198.360 ZM 94.000 64.000 C 94.000 45.222 109.222 30.000 128.000 30.000 C 146.778 30.000 162.000 45.222 162.000 64.000 L 162.000 66.000 L 94.000 66.000 ZM 225.500 201.300 C 225.101 201.753 224.524 202.008 223.920 202.000 L 32.080 202.000 C 31.476 202.008 30.899 201.753 30.500 201.300 C 30.121 200.886 29.942 200.327 30.010 199.770 L 44.270 79.770 C 44.389 78.733 45.287 77.962 46.330 78.000 L 209.670 78.000 C 210.713 77.962 211.611 78.733 211.730 79.770 L 225.990 199.770 C 226.058 200.327 225.879 200.886 225.500 201.300 Z"),
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
        return _handbagSimple!!
    }

private var _handbagSimple: ImageVector? = null
