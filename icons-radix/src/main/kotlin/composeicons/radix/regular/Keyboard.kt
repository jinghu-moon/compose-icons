package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Keyboard: ImageVector
    get() {
        if (_keyboard != null) return _keyboard!!
        _keyboard = radixIcon(
            name = "Keyboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.653 3.008C14.41 3.085 15 3.723 15 4.5v6l-.008 .153c-.072 .706-.633 1.267-1.339 1.339L13.5 12h-12l-.153-.008C.641 11.92 .079 11.359 .008 10.653L0 10.5v-6C0 3.723 .59 3.085 1.347 3.008L1.5 3h12l.153 .008ZM1.5 4C1.224 4 1 4.224 1 4.5v6c0 .276 .224 .5 .5 .5h12c.276 0 .5-.224 .5-.5v-6C14 4.224 13.776 4 13.5 4h-12ZM3 10h-1v-1h1v1ZM11 10h-7v-1h7v1ZM13 10h-1v-1h1v1ZM4 8h-1v-1h1v1ZM6 8h-1v-1h1v1ZM8 8h-1v-1h1v1ZM10 8h-1v-1h1v1ZM12 8h-1v-1h1v1ZM3 6h-1v-1h1v1ZM5 6h-1v-1h1v1ZM7 6h-1v-1h1v1ZM9 6h-1v-1h1v1ZM11 6h-1v-1h1v1ZM13 6h-1v-1h1v1Z"),
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
        return _keyboard!!
    }

private var _keyboard: ImageVector? = null
