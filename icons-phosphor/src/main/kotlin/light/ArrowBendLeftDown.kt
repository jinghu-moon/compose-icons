package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowBendLeftDown: ImageVector
    get() {
        if (_arrowBendLeftDown != null) return _arrowBendLeftDown!!
        _arrowBendLeftDown = phosphorLightIcon(
            name = "ArrowBendLeftDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 206.000 32.000 C 206.000 35.314 203.314 38.000 200.000 38.000 C 150.317 38.055 110.055 78.317 110.000 128.000 L 110.000 209.510 L 147.760 171.760 C 150.124 169.557 153.808 169.622 156.093 171.907 C 158.378 174.192 158.443 177.876 156.240 180.240 L 108.240 228.240 C 105.897 230.580 102.103 230.580 99.760 228.240 L 51.760 180.240 C 49.557 177.876 49.622 174.192 51.907 171.907 C 54.192 169.622 57.876 169.557 60.240 171.760 L 98.000 209.510 L 98.000 128.000 C 98.066 71.694 143.694 26.066 200.000 26.000 C 203.314 26.000 206.000 28.686 206.000 32.000 Z"),
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
        return _arrowBendLeftDown!!
    }

private var _arrowBendLeftDown: ImageVector? = null
