package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberNine: ImageVector
    get() {
        if (_numberNine != null) return _numberNine!!
        _numberNine = phosphorLightIcon(
            name = "NumberNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 42C106.245 41.986 86.607 55.028 78.181 75.085c-8.426 20.057-3.994 43.211 11.243 58.738 15.237 15.527 38.304 20.394 58.516 12.347l-33.17 58.88c-1.626 2.888-.603 6.549 2.285 8.175 2.888 1.626 6.549 .603 8.175-2.285l49.54-88c9.616-16.705 9.599-37.268-.044-53.957C165.082 52.294 147.275 42.011 128 42ZM128 138C104.804 138 86 119.196 86 96 86 72.804 104.804 54 128 54c23.196 0 42 18.804 42 42 0 23.196-18.804 42-42 42Z"),
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
        return _numberNine!!
    }

private var _numberNine: ImageVector? = null
