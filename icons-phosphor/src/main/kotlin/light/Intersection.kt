package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Intersection: ImageVector
    get() {
        if (_intersection != null) return _intersection!!
        _intersection = phosphorLightIcon(
            name = "Intersection",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 206.000 120.000 L 206.000 200.000 C 206.000 203.314 203.314 206.000 200.000 206.000 C 196.686 206.000 194.000 203.314 194.000 200.000 L 194.000 120.000 C 194.000 83.549 164.451 54.000 128.000 54.000 C 91.549 54.000 62.000 83.549 62.000 120.000 L 62.000 200.000 C 62.000 203.314 59.314 206.000 56.000 206.000 C 52.686 206.000 50.000 203.314 50.000 200.000 L 50.000 120.000 C 50.000 76.922 84.922 42.000 128.000 42.000 C 171.078 42.000 206.000 76.922 206.000 120.000 Z"),
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
        return _intersection!!
    }

private var _intersection: ImageVector? = null
