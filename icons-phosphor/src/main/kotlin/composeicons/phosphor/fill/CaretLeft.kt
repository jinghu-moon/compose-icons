package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CaretLeft: ImageVector
    get() {
        if (_caretLeft != null) return _caretLeft!!
        _caretLeft = phosphorFillIcon(
            name = "CaretLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 48v160c.003 3.238-1.947 6.158-4.938 7.397-2.991 1.239-6.434 .554-8.722-1.737l-80-80C72.838 132.159 71.994 130.123 71.994 128c0-2.123 .844-4.159 2.346-5.66l80-80c2.288-2.291 5.731-2.976 8.722-1.737 2.991 1.239 4.94 4.159 4.938 7.397Z"),
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
        return _caretLeft!!
    }

private var _caretLeft: ImageVector? = null
