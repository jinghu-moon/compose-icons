package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.SpaceBetweenHorizontally: ImageVector
    get() {
        if (_spaceBetweenHorizontally != null) return _spaceBetweenHorizontally!!
        _spaceBetweenHorizontally = radixIcon(
            name = "SpaceBetweenHorizontally",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6 8c0 .552-.448 1-1 1h-4L1 13.5c0 .276-.224 .5-.5 .5-.276 0-.5-.224-.5-.5L-0 1.5C0 1.224 .224 1 .5 1c.276 0 .5 .224 .5 .5v4.5h4c.552 0 1 .448 1 1v1ZM10 9c-.552 0-1-.448-1-1v-1c0-.552 .448-1 1-1h4v-4.5c0-.276 .224-.5 .5-.5 .276 0 .5 .224 .5 .5v12c0 .276-.224 .5-.5 .5-.276 0-.5-.224-.5-.5v-4.5h-4Z"),
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
        return _spaceBetweenHorizontally!!
    }

private var _spaceBetweenHorizontally: ImageVector? = null
