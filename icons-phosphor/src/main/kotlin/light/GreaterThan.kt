package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GreaterThan: ImageVector
    get() {
        if (_greaterThan != null) return _greaterThan!!
        _greaterThan = phosphorLightIcon(
            name = "GreaterThan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 222.000 128.000 C 221.999 130.317 220.664 132.427 218.570 133.420 L 66.570 205.420 C 64.625 206.397 62.304 206.244 60.504 205.021 C 58.704 203.798 57.708 201.696 57.900 199.529 C 58.092 197.361 59.443 195.467 61.430 194.580 L 202.000 128.000 L 61.430 61.420 C 59.443 60.533 58.092 58.639 57.900 56.471 C 57.708 54.304 58.704 52.202 60.504 50.979 C 62.304 49.756 64.625 49.603 66.570 50.580 L 218.570 122.580 C 220.664 123.573 221.999 125.683 222.000 128.000 Z"),
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
        return _greaterThan!!
    }

private var _greaterThan: ImageVector? = null
