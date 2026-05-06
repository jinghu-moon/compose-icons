package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowDownRight: ImageVector
    get() {
        if (_arrowDownRight != null) return _arrowDownRight!!
        _arrowDownRight = phosphorBoldIcon(
            name = "ArrowDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204 88v104c0 6.627-5.373 12-12 12h-104c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h75L55.51 72.48c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L180 163v-75c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12Z"),
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
        return _arrowDownRight!!
    }

private var _arrowDownRight: ImageVector? = null
