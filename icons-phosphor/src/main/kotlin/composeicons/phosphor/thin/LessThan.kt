package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LessThan: ImageVector
    get() {
        if (_lessThan != null) return _lessThan!!
        _lessThan = phosphorThinIcon(
            name = "LessThan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M203.61 201.71c-.66 1.396-2.065 2.288-3.61 2.29-.592 .003-1.178-.13-1.71-.39l-152-72c-1.397-.662-2.288-2.069-2.288-3.615 0-1.546 .891-2.953 2.288-3.615L198.29 52.38c1.986-.887 4.317-.024 5.247 1.942 .93 1.966 .119 4.315-1.827 5.288L57.34 128l144.37 68.38c.959 .455 1.698 1.272 2.054 2.271 .356 1 .301 2.1-.154 3.059Z"),
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
        return _lessThan!!
    }

private var _lessThan: ImageVector? = null
