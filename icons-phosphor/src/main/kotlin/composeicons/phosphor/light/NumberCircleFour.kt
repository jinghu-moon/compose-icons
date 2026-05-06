package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberCircleFour: ImageVector
    get() {
        if (_numberCircleFour != null) return _numberCircleFour!!
        _numberCircleFour = phosphorLightIcon(
            name = "NumberCircleFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM128 218C78.294 218 38 177.706 38 128 38 78.294 78.294 38 128 38c49.706 0 90 40.294 90 90-.055 49.683-40.317 89.945-90 90ZM160 146h-10v-66c.001-2.565-1.629-4.846-4.055-5.677-2.426-.831-5.112-.029-6.685 1.997L83.26 148.32c-1.405 1.809-1.657 4.261-.65 6.319 1.008 2.058 3.099 3.362 5.39 3.361h50v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-18h10c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM138 146h-37.73L138 97.49Z"),
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
        return _numberCircleFour!!
    }

private var _numberCircleFour: ImageVector? = null
