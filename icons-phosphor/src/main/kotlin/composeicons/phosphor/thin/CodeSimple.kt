package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CodeSimple: ImageVector
    get() {
        if (_codeSimple != null) return _codeSimple!!
        _codeSimple = phosphorThinIcon(
            name = "CodeSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M90.66 67 22 128l68.64 61c1.657 1.469 1.809 4.003 .34 5.66-1.469 1.657-4.003 1.809-5.66 .34l-72-64c-.861-.759-1.354-1.852-1.354-3 0-1.148 .493-2.241 1.354-3l72-64c1.657-1.469 4.191-1.317 5.66 .34 1.469 1.657 1.317 4.191-.34 5.66ZM242.66 125l-72-64c-1.657-1.469-4.191-1.317-5.66 .34-1.469 1.657-1.317 4.191 .34 5.66L234 128l-68.64 61c-1.657 1.469-1.809 4.003-.34 5.66 1.469 1.657 4.003 1.809 5.66 .34l72-64c.861-.759 1.354-1.852 1.354-3 0-1.148-.493-2.241-1.354-3Z"),
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
        return _codeSimple!!
    }

private var _codeSimple: ImageVector? = null
