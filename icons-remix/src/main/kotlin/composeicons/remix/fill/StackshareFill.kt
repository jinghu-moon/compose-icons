package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.StackshareFill: ImageVector
    get() {
        if (_stackshareFill != null) return _stackshareFill!!
        _stackshareFill = remixIcon(
            name = "StackshareFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21.001 3c.552 0 1 .448 1 1v16c0 .552-.448 1-1 1h-18c-.552 0-1-.448-1-1v-16c0-.552 .448-1 1-1h18ZM16.793 5.621c-1.011 0-1.864 .676-2.133 1.6h-1.998l-2.46 4.184h-1.438C8.495 10.481 7.643 9.805 6.631 9.805c-1.227 0-2.221 .995-2.221 2.222 0 1.227 .995 2.221 2.221 2.221 1.011 0 1.864-.676 2.133-1.6h1.471l2.417 4.133h2.017c.269 .924 1.122 1.6 2.133 1.6 1.227 0 2.222-.995 2.222-2.221 0-1.227-.995-2.222-2.222-2.222-1.011 0-1.864 .676-2.133 1.601h-1.317L11.297 12.002 13.349 8.464h1.311c.269 .925 1.122 1.6 2.133 1.6 1.227 0 2.222-.995 2.222-2.222 0-1.227-.995-2.222-2.222-2.222ZM16.804 15.048c.644 0 1.167 .524 1.167 1.167 0 .644-.524 1.167-1.167 1.167-.566 0-1.039-.405-1.145-.94 0 0-.031-.226 0-.453 .106-.536 .579-.941 1.145-.941ZM6.652 10.839c.644 0 1.167 .523 1.167 1.167 0 .644-.524 1.167-1.167 1.167-.644 0-1.167-.524-1.167-1.167 0-.644 .524-1.167 1.167-1.167ZM16.802 6.629c.644 0 1.167 .523 1.167 1.167 0 .643-.524 1.167-1.167 1.167-.566 0-1.039-.405-1.144-.941-.026-.206 0-.446 0-.446 .106-.543 .579-.948 1.144-.948Z"),
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
        return _stackshareFill!!
    }

private var _stackshareFill: ImageVector? = null
