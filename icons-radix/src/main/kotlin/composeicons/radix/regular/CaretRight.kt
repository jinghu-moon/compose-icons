package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.CaretRight: ImageVector
    get() {
        if (_caretRight != null) return _caretRight!!
        _caretRight = radixIcon(
            name = "CaretRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.95 7.5c-0 .119-.047 .234-.132 .318l-3 3c-.176 .175-.461 .176-.637 0-.176-.176-.176-.461 0-.637L8.863 7.5 6.182 4.819 6.124 4.748c-.115-.175-.096-.413 .058-.566 .154-.154 .392-.173 .566-.058l.07 .058 3 3c.084 .084 .132 .199 .132 .318Z"),
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
        return _caretRight!!
    }

private var _caretRight: ImageVector? = null
