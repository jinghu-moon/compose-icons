package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowBendUpRight: ImageVector
    get() {
        if (_arrowBendUpRight != null) return _arrowBendUpRight!!
        _arrowBendUpRight = phosphorLightIcon(
            name = "ArrowBendUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.240 108.240 L 180.240 156.240 C 177.876 158.443 174.192 158.378 171.907 156.093 C 169.622 153.808 169.557 150.124 171.760 147.760 L 209.510 110.000 L 128.000 110.000 C 78.317 110.055 38.055 150.317 38.000 200.000 C 38.000 203.314 35.314 206.000 32.000 206.000 C 28.686 206.000 26.000 203.314 26.000 200.000 C 26.066 143.694 71.694 98.066 128.000 98.000 L 209.510 98.000 L 171.760 60.240 C 169.557 57.876 169.622 54.192 171.907 51.907 C 174.192 49.622 177.876 49.557 180.240 51.760 L 228.240 99.760 C 230.580 102.103 230.580 105.897 228.240 108.240 Z"),
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
        return _arrowBendUpRight!!
    }

private var _arrowBendUpRight: ImageVector? = null
