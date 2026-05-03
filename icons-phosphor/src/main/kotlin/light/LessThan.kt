package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.LessThan: ImageVector
    get() {
        if (_lessThan != null) return _lessThan!!
        _lessThan = phosphorLightIcon(
            name = "LessThan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 205.420 202.570 C 204.738 204.010 203.512 205.119 202.011 205.654 C 200.510 206.188 198.859 206.104 197.420 205.420 L 45.420 133.420 C 43.327 132.426 41.994 130.317 41.994 128.000 C 41.994 125.683 43.327 123.574 45.420 122.580 L 197.420 50.580 C 200.397 49.251 203.891 50.542 205.288 53.488 C 206.685 56.434 205.473 59.956 202.560 61.420 L 62.000 128.000 L 202.550 194.580 C 203.991 195.258 205.103 196.481 205.641 197.980 C 206.179 199.479 206.100 201.130 205.420 202.570 Z"),
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
        return _lessThan!!
    }

private var _lessThan: ImageVector? = null
