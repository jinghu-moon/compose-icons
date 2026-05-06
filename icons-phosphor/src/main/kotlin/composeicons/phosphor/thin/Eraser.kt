package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Eraser: ImageVector
    get() {
        if (_eraser != null) return _eraser!!
        _eraser = phosphorThinIcon(
            name = "Eraser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222.15 83.22 180.77 41.85c-7.81-7.808-20.47-7.808-28.28 0L33.85 160.48c-3.752 3.751-5.861 8.839-5.861 14.145 0 5.306 2.108 10.394 5.861 14.145l30.06 30.06c.751 .75 1.769 1.171 2.83 1.17h149.26c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-94.34L222.15 111.51c3.752-3.751 5.861-8.839 5.861-14.145 0-5.306-2.108-10.394-5.861-14.145ZM110.34 212h-41.94L39.51 183.11c-2.259-2.252-3.529-5.31-3.529-8.5 0-3.19 1.27-6.248 3.529-8.5L96 109.65 154.35 168ZM216.49 105.85 160 162.34 101.65 104 158.14 47.52c2.252-2.259 5.31-3.529 8.5-3.529 3.19 0 6.248 1.27 8.5 3.529l41.37 41.37c4.674 4.691 4.665 12.28-.02 16.96Z"),
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
        return _eraser!!
    }

private var _eraser: ImageVector? = null
