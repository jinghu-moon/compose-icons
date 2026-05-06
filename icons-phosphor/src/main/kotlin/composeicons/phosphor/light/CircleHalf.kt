package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CircleHalf: ImageVector
    get() {
        if (_circleHalf != null) return _circleHalf!!
        _circleHalf = phosphorLightIcon(
            name = "CircleHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM134 38.2c6.783 .45 13.492 1.667 20 3.63v172.34c-6.508 1.963-13.217 3.18-20 3.63ZM166 46.43c7.201 3.373 13.925 7.68 20 12.81v137.52c-6.075 5.13-12.799 9.437-20 12.81ZM38 128C38.059 80.647 74.756 41.416 122 38.2v179.6C74.756 214.584 38.059 175.353 38 128ZM198 184.5v-113c26.665 32.947 26.665 80.053 0 113Z"),
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
        return _circleHalf!!
    }

private var _circleHalf: ImageVector? = null
