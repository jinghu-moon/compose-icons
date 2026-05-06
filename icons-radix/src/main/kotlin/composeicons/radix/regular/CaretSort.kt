package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.CaretSort: ImageVector
    get() {
        if (_caretSort != null) return _caretSort!!
        _caretSort = radixIcon(
            name = "CaretSort",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.932 8.932c.176-.176 .461-.176 .637 0l1.932 1.932L9.432 8.932l.07-.058c.175-.115 .413-.096 .566 .058 .154 .154 .173 .392 .058 .566l-.058 .07L7.819 11.818l-.07 .058c-.175 .115-.413 .096-.566-.058L4.932 9.569c-.176-.176-.176-.461 0-.637ZM7.5 3.05c.119 0 .234 .047 .318 .132l2.25 2.25c.175 .176 .176 .461 0 .637-.176 .176-.461 .176-.637 0L7.5 4.137 5.569 6.069l-.07 .058c-.175 .115-.413 .096-.566-.058C4.778 5.915 4.759 5.677 4.874 5.502l.058-.07L7.182 3.182c.084-.084 .199-.132 .318-.132Z"),
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
        return _caretSort!!
    }

private var _caretSort: ImageVector? = null
