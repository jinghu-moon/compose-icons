package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowBendRightUp: ImageVector
    get() {
        if (_arrowBendRightUp != null) return _arrowBendRightUp!!
        _arrowBendRightUp = phosphorBoldIcon(
            name = "ArrowBendRightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208.49 88.49c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529L164 61v67c-.066 59.619-48.381 107.934-108 108-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 46.371-.05 83.95-37.629 84-84v-67L112.49 88.49c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17L143.49 23.49c2.252-2.259 5.31-3.529 8.5-3.529 3.19 0 6.248 1.27 8.5 3.529l48 48c2.259 2.252 3.529 5.31 3.529 8.5 0 3.19-1.27 6.248-3.529 8.5Z"),
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
        return _arrowBendRightUp!!
    }

private var _arrowBendRightUp: ImageVector? = null
