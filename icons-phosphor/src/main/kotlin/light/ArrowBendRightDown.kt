package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowBendRightDown: ImageVector
    get() {
        if (_arrowBendRightDown != null) return _arrowBendRightDown!!
        _arrowBendRightDown = phosphorLightIcon(
            name = "ArrowBendRightDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 204.240 180.240 L 156.240 228.240 C 153.897 230.580 150.103 230.580 147.760 228.240 L 99.760 180.240 C 97.557 177.876 97.622 174.192 99.907 171.907 C 102.192 169.622 105.876 169.557 108.240 171.760 L 146.000 209.510 L 146.000 128.000 C 145.945 78.317 105.683 38.055 56.000 38.000 C 52.686 38.000 50.000 35.314 50.000 32.000 C 50.000 28.686 52.686 26.000 56.000 26.000 C 112.306 26.066 157.934 71.694 158.000 128.000 L 158.000 209.510 L 195.760 171.760 C 198.124 169.557 201.808 169.622 204.093 171.907 C 206.378 174.192 206.443 177.876 204.240 180.240 Z"),
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
        return _arrowBendRightDown!!
    }

private var _arrowBendRightDown: ImageVector? = null
