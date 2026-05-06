package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.CaretDown: ImageVector
    get() {
        if (_caretDown != null) return _caretDown!!
        _caretDown = radixIcon(
            name = "CaretDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.5 9.95c.119-0 .234-.047 .318-.132l3-3c.175-.176 .176-.461 0-.637-.176-.176-.461-.176-.637 0L7.5 8.863 4.819 6.181 4.748 6.124c-.175-.115-.413-.096-.566 .058-.154 .154-.173 .392-.058 .566l.058 .07 3 3c.084 .084 .199 .132 .318 .132Z"),
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
        return _caretDown!!
    }

private var _caretDown: ImageVector? = null
