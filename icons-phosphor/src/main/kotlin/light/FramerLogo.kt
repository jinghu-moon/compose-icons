package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FramerLogo: ImageVector
    get() {
        if (_framerLogo != null) return _framerLogo!!
        _framerLogo = phosphorLightIcon(
            name = "FramerLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 206.000 104.000 L 206.000 40.000 C 206.000 36.686 203.314 34.000 200.000 34.000 L 56.000 34.000 C 53.509 33.996 51.274 35.533 50.386 37.860 C 49.497 40.188 50.140 42.823 52.000 44.480 L 112.220 98.000 L 56.000 98.000 C 52.686 98.000 50.000 100.686 50.000 104.000 L 50.000 168.000 C 50.001 169.591 50.634 171.116 51.760 172.240 L 123.760 244.240 C 125.476 245.954 128.055 246.466 130.295 245.538 C 132.536 244.611 133.998 242.425 134.000 240.000 L 134.000 174.000 L 200.000 174.000 C 202.491 174.004 204.726 172.467 205.614 170.140 C 206.503 167.812 205.860 165.177 204.000 163.520 L 143.780 110.000 L 200.000 110.000 C 203.314 110.000 206.000 107.314 206.000 104.000 ZM 184.220 162.000 L 128.000 162.000 C 124.686 162.000 122.000 164.686 122.000 168.000 L 122.000 225.510 L 62.000 165.510 L 62.000 110.000 L 125.720 110.000 ZM 194.000 98.000 L 130.280 98.000 L 71.780 46.000 L 194.000 46.000 Z"),
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
        return _framerLogo!!
    }

private var _framerLogo: ImageVector? = null
