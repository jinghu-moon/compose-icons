package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.SpaceEvenlyHorizontally: ImageVector
    get() {
        if (_spaceEvenlyHorizontally != null) return _spaceEvenlyHorizontally!!
        _spaceEvenlyHorizontally = radixIcon(
            name = "SpaceEvenlyHorizontally",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M1 13.5c0 .276-.224 .5-.5 .5-.276 0-.5-.224-.5-.5L-0 1.5C0 1.224 .224 1 .5 1c.276 0 .5 .224 .5 .5L1 13.5ZM7 8c0 .552-.448 1-1 1h-3c-.552 0-1-.448-1-1v-1c0-.552 .448-1 1-1h3c.552 0 1 .448 1 1v1ZM13 8c0 .552-.448 1-1 1h-3C8.448 9 8 8.552 8 8v-1c0-.552 .448-1 1-1h3c.552 0 1 .448 1 1v1ZM15 13.5c0 .276-.224 .5-.5 .5-.276 0-.5-.224-.5-.5v-12c0-.276 .224-.5 .5-.5 .276 0 .5 .224 .5 .5v12Z"),
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
        return _spaceEvenlyHorizontally!!
    }

private var _spaceEvenlyHorizontally: ImageVector? = null
