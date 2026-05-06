package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberSquareFour: ImageVector
    get() {
        if (_numberSquareFour != null) return _numberSquareFour!!
        _numberSquareFour = phosphorLightIcon(
            name = "NumberSquareFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 34h-160C40.268 34 34 40.268 34 48v160c0 7.732 6.268 14 14 14h160c7.732 0 14-6.268 14-14v-160c0-7.732-6.268-14-14-14ZM210 208c0 1.105-.895 2-2 2h-160c-1.105 0-2-.895-2-2v-160c0-1.105 .895-2 2-2h160c1.105 0 2 .895 2 2ZM160 146h-10v-66c.001-2.565-1.629-4.846-4.055-5.677-2.426-.831-5.112-.029-6.685 1.997L83.26 148.32c-1.405 1.809-1.657 4.261-.65 6.319 1.008 2.058 3.099 3.362 5.39 3.361h50v18c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-18h10c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM138 146h-37.73L138 97.49Z"),
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
        return _numberSquareFour!!
    }

private var _numberSquareFour: ImageVector? = null
