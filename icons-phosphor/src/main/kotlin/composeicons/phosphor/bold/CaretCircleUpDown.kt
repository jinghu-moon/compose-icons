package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CaretCircleUpDown: ImageVector
    get() {
        if (_caretCircleUpDown != null) return _caretCircleUpDown!!
        _caretCircleUpDown = phosphorBoldIcon(
            name = "CaretCircleUpDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM128 212C81.608 212 44 174.392 44 128 44 81.608 81.608 44 128 44c46.392 0 84 37.608 84 84-.05 46.371-37.629 83.95-84 84ZM168.49 95.51c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0L128 89l-23.51 23.52c-4.694 4.694-12.306 4.694-17 0-4.694-4.694-4.694-12.306 0-17l32-32c2.252-2.259 5.31-3.529 8.5-3.529 3.19 0 6.248 1.27 8.5 3.529ZM168.49 143.51c2.259 2.252 3.529 5.31 3.529 8.5 0 3.19-1.27 6.248-3.529 8.5l-32 32c-2.252 2.259-5.31 3.529-8.5 3.529-3.19 0-6.248-1.27-8.5-3.529l-32-32c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0L128 167l23.51-23.52c2.255-2.249 5.311-3.51 8.496-3.504 3.185 .006 6.237 1.277 8.484 3.534Z"),
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
        return _caretCircleUpDown!!
    }

private var _caretCircleUpDown: ImageVector? = null
