package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowLineLeft: ImageVector
    get() {
        if (_arrowLineLeft != null) return _arrowLineLeft!!
        _arrowLineLeft = phosphorFillIcon(
            name = "ArrowLineLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M48 40v176c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-176c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM224 120h-72v-64c.003-3.238-1.947-6.158-4.938-7.397-2.991-1.239-6.434-.554-8.722 1.737l-72 72c-1.502 1.501-2.346 3.537-2.346 5.66 0 2.123 .844 4.159 2.346 5.66l72 72c2.288 2.291 5.731 2.976 8.722 1.737 2.991-1.239 4.94-4.159 4.938-7.397v-64h72c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
        return _arrowLineLeft!!
    }

private var _arrowLineLeft: ImageVector? = null
