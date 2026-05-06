package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.SpaceEvenlyVertically: ImageVector
    get() {
        if (_spaceEvenlyVertically != null) return _spaceEvenlyVertically!!
        _spaceEvenlyVertically = radixIcon(
            name = "SpaceEvenlyVertically",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.5 14c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5h-12c-.276 0-.5-.224-.5-.5 0-.276 .224-.5 .5-.5h12ZM8 8c.552 0 1 .448 1 1v3c0 .552-.448 1-1 1h-1c-.552-0-1-.448-1-1v-3c0-.552 .448-1 1-1h1ZM8 2c.552 0 1 .448 1 1v3c0 .552-.448 1-1 1h-1c-.552-0-1-.448-1-1v-3c0-.552 .448-1 1-1h1ZM13.5 0c.276 0 .5 .224 .5 .5 0 .276-.224 .5-.5 .5h-12C1.224 1 1 .776 1 .5c0-.276 .224-.5 .5-.5h12Z"),
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
        return _spaceEvenlyVertically!!
    }

private var _spaceEvenlyVertically: ImageVector? = null
