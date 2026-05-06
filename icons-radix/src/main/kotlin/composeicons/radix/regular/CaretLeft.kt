package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.CaretLeft: ImageVector
    get() {
        if (_caretLeft != null) return _caretLeft!!
        _caretLeft = radixIcon(
            name = "CaretLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M5.05 7.5c0 .119 .047 .234 .132 .318l3 3 .07 .058c.175 .115 .413 .096 .566-.058 .154-.154 .173-.392 .058-.566l-.058-.07L6.137 7.5 8.818 4.818c.176-.176 .176-.461 0-.637-.176-.176-.461-.176-.637 0l-3 3c-.084 .084-.132 .199-.132 .318Z"),
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
