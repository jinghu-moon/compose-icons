package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Server: ImageVector
    get() {
        if (_server != null) return _server!!
        _server = radixIcon(
            name = "Server",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.653 8.008C13.41 8.085 14 8.723 14 9.5v2l-.008 .153c-.072 .706-.633 1.267-1.339 1.339L12.5 13h-10l-.153-.008C1.641 12.92 1.079 12.359 1.008 11.653L1 11.5v-2C1 8.723 1.59 8.085 2.347 8.008L2.5 8h10l.153 .008ZM2.5 9C2.224 9 2 9.224 2 9.5v2c0 .276 .224 .5 .5 .5h10c.276 0 .5-.224 .5-.5v-2C13 9.224 12.776 9 12.5 9h-10ZM3.5 10c.276 0 .5 .224 .5 .5C4 10.776 3.776 11 3.5 11 3.224 11 3 10.776 3 10.5 3 10.224 3.224 10 3.5 10ZM12.653 2.008C13.41 2.085 14 2.723 14 3.5v2l-.008 .153c-.072 .706-.633 1.267-1.339 1.339L12.5 7h-10L2.347 6.992C1.641 6.921 1.079 6.359 1.008 5.653L1 5.5v-2C1 2.723 1.59 2.085 2.347 2.008L2.5 2h10l.153 .008ZM2.5 3C2.224 3 2 3.224 2 3.5v2C2 5.776 2.224 6 2.5 6h10C12.776 6 13 5.776 13 5.5v-2C13 3.224 12.776 3 12.5 3h-10ZM3.5 4C3.776 4 4 4.224 4 4.5 4 4.776 3.776 5 3.5 5 3.224 5 3 4.776 3 4.5 3 4.224 3.224 4 3.5 4Z"),
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
        return _server!!
    }

private var _server: ImageVector? = null
