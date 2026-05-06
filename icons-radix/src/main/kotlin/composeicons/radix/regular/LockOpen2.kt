package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.LockOpen2: ImageVector
    get() {
        if (_lockOpen2 != null) return _lockOpen2!!
        _lockOpen2 = radixIcon(
            name = "LockOpen2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.501 0c1.173 0 2.138 .389 2.762 1.193l.091 .123c.438 .628 .646 1.425 .646 2.316h-1c-0-.691-.151-1.245-.41-1.658l-.117-.168c-.388-.501-1.025-.807-1.972-.807-.858 0-1.464 .265-1.859 .687C9.242 2.112 9 2.76 9 3.636v2.364h1c.552 0 1 .448 1 1v6c0 .552-.448 1-1 1h-9C.448 14 0 13.552 0 13v-6c0-.552 .448-1 1-1h7v-2.364C8 2.581 8.293 1.661 8.912 1.002 9.535 .338 10.429 0 11.501 0ZM1 13h9v-6h-9v6Z"),
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
        return _lockOpen2!!
    }

private var _lockOpen2: ImageVector? = null
