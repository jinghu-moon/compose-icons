package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowBendDownRight: ImageVector
    get() {
        if (_arrowBendDownRight != null) return _arrowBendDownRight!!
        _arrowBendDownRight = phosphorLightIcon(
            name = "ArrowBendDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.240 156.240 L 180.240 204.240 C 177.876 206.443 174.192 206.378 171.907 204.093 C 169.622 201.808 169.557 198.124 171.760 195.760 L 209.510 158.000 L 128.000 158.000 C 71.694 157.934 26.066 112.306 26.000 56.000 C 26.000 52.686 28.686 50.000 32.000 50.000 C 35.314 50.000 38.000 52.686 38.000 56.000 C 38.055 105.683 78.317 145.945 128.000 146.000 L 209.510 146.000 L 171.760 108.240 C 169.557 105.876 169.622 102.192 171.907 99.907 C 174.192 97.622 177.876 97.557 180.240 99.760 L 228.240 147.760 C 230.580 150.103 230.580 153.897 228.240 156.240 Z"),
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
        return _arrowBendDownRight!!
    }

private var _arrowBendDownRight: ImageVector? = null
