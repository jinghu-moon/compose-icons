package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Height: ImageVector
    get() {
        if (_height != null) return _height!!
        _height = radixIcon(
            name = "Height",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.252 1.624c.175-.115 .413-.096 .566 .058l2.5 2.5 .058 .07c.115 .175 .096 .413-.058 .566-.154 .154-.392 .173-.566 .058L9.681 4.819 7.95 3.087v8.826L9.681 10.182c.176-.176 .461-.176 .637 0 .175 .176 .176 .461 0 .637L7.818 13.319c-.084 .084-.199 .132-.318 .132-.119 0-.234-.048-.318-.132L4.681 10.819l-.058-.07c-.116-.175-.096-.413 .058-.566 .154-.154 .392-.173 .566-.058l.07 .058 1.731 1.731v-8.826L5.318 4.819c-.176 .176-.461 .176-.637 0-.176-.176-.176-.461 0-.637L7.181 1.682l.07-.058Z"),
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
        return _height!!
    }

private var _height: ImageVector? = null
