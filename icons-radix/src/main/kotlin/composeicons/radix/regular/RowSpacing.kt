package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.RowSpacing: ImageVector
    get() {
        if (_rowSpacing != null) return _rowSpacing!!
        _rowSpacing = radixIcon(
            name = "RowSpacing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.5 9.05c.248 0 .45 .202 .45 .45v3.413L9.182 11.682c.176-.176 .461-.176 .637 0 .176 .176 .176 .461 0 .637l-2 2c-.084 .084-.199 .132-.318 .132-.09 0-.177-.027-.25-.076l-.068-.056-2-2-.058-.07c-.115-.175-.096-.413 .058-.566 .154-.154 .392-.173 .566-.058l.07 .058 1.231 1.231v-3.413c0-.248 .202-.45 .45-.45ZM13.601 7.01c.228 .047 .399 .249 .399 .49 0 .242-.171 .444-.399 .49l-.101 .01h-12c-.276 0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5h12l.101 .01ZM7.252 .624c.175-.116 .413-.096 .566 .058L9.818 2.682l.058 .07c.115 .175 .096 .413-.058 .566-.154 .154-.392 .173-.566 .058L9.182 3.319 7.95 2.087v3.413c-0 .248-.202 .45-.45 .45C7.252 5.95 7.05 5.749 7.05 5.5v-3.413L5.818 3.319c-.176 .176-.461 .176-.637 0-.176-.176-.176-.461 0-.637l2-2L7.252 .624Z"),
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
        return _rowSpacing!!
    }

private var _rowSpacing: ImageVector? = null
