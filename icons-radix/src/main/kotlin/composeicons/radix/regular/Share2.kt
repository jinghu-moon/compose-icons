package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Share2: ImageVector
    get() {
        if (_share2 != null) return _share2!!
        _share2 = radixIcon(
            name = "Share2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2 5.5C2 4.672 2.672 4 3.5 4h1.25c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5h-1.25C3.224 5 3 5.224 3 5.5v6c0 .276 .224 .5 .5 .5h8c.276 0 .5-.224 .5-.5v-6c0-.276-.224-.5-.5-.5h-1.25c-.276 0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5h1.25c.828 0 1.5 .672 1.5 1.5v6c0 .828-.672 1.5-1.5 1.5h-8C2.672 13 2 12.328 2 11.5v-6ZM4.932 3.068C4.778 2.915 4.759 2.677 4.874 2.502l.058-.07L7.182 .182C7.266 .097 7.381 .05 7.5 .05c.119 0 .234 .047 .318 .132l2.25 2.25c.176 .176 .176 .461 0 .637-.176 .176-.461 .176-.637 0L8 1.637v6.863c-0 .276-.224 .5-.5 .5C7.224 9 7 8.776 7 8.5v-6.863L5.568 3.068l-.07 .058c-.175 .115-.413 .096-.566-.058Z"),
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
        return _share2!!
    }

private var _share2: ImageVector? = null
