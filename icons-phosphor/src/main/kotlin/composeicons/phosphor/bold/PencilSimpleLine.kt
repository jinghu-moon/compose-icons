package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PencilSimpleLine: ImageVector
    get() {
        if (_pencilSimpleLine != null) return _pencilSimpleLine!!
        _pencilSimpleLine = phosphorBoldIcon(
            name = "PencilSimpleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M230.15 70.54 185.46 25.86c-7.81-7.808-20.47-7.808-28.28 0L33.86 149.17c-3.764 3.741-5.874 8.833-5.86 14.14v44.69c0 11.046 8.954 20 20 20h168c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-91L230.15 98.83c3.752-3.751 5.861-8.839 5.861-14.145 0-5.306-2.108-10.394-5.861-14.145ZM91 204h-39v-39L136 81l39 39ZM192 103 153 64 171.34 45.66l39 39Z"),
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
        return _pencilSimpleLine!!
    }

private var _pencilSimpleLine: ImageVector? = null
