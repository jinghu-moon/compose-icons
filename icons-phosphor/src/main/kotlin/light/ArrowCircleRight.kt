package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowCircleRight: ImageVector
    get() {
        if (_arrowCircleRight != null) return _arrowCircleRight!!
        _arrowCircleRight = phosphorLightIcon(
            name = "ArrowCircleRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 217.945 177.683 177.683 217.945 128.000 218.000 ZM 172.240 123.760 C 174.580 126.103 174.580 129.897 172.240 132.240 L 140.240 164.240 C 137.876 166.443 134.192 166.378 131.907 164.093 C 129.622 161.808 129.557 158.124 131.760 155.760 L 153.510 134.000 L 88.000 134.000 C 84.686 134.000 82.000 131.314 82.000 128.000 C 82.000 124.686 84.686 122.000 88.000 122.000 L 153.510 122.000 L 131.760 100.240 C 129.557 97.876 129.622 94.192 131.907 91.907 C 134.192 89.622 137.876 89.557 140.240 91.760 Z"),
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
        return _arrowCircleRight!!
    }

private var _arrowCircleRight: ImageVector? = null
