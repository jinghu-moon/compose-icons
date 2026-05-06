package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Width: ImageVector
    get() {
        if (_width != null) return _width!!
        _width = radixIcon(
            name = "Width",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M10.182 4.682c.154-.154 .392-.173 .566-.058l.07 .058 2.5 2.5 .058 .07c.099 .15 .099 .346 0 .496l-.058 .07-2.5 2.5c-.176 .176-.461 .175-.637 0-.176-.176-.176-.461 0-.637L11.913 7.95h-8.826L4.818 9.682l.058 .07c.115 .175 .096 .413-.058 .566-.154 .154-.392 .173-.566 .058l-.07-.058L1.682 7.818c-.176-.176-.176-.461 0-.637L4.182 4.682l.07-.058c.175-.115 .413-.096 .566 .058 .154 .154 .173 .392 .058 .566l-.058 .07L3.087 7.05h8.826L10.182 5.318l-.058-.07c-.115-.175-.096-.413 .058-.566Z"),
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
        return _width!!
    }

private var _width: ImageVector? = null
