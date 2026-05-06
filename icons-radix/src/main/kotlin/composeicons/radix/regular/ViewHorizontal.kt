package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ViewHorizontal: ImageVector
    get() {
        if (_viewHorizontal != null) return _viewHorizontal!!
        _viewHorizontal = radixIcon(
            name = "ViewHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.653 1.008C14.41 1.085 15 1.723 15 2.5v10l-.008 .153c-.072 .706-.633 1.267-1.339 1.339L13.5 14h-12l-.153-.008C.641 13.92 .079 13.359 .008 12.653L0 12.5v-10C0 1.723 .59 1.085 1.347 1.008L1.5 1h12l.153 .008ZM1 8v4.5c0 .276 .224 .5 .5 .5h12c.276 0 .5-.224 .5-.5v-4.5h-13ZM1.5 2C1.224 2 1 2.224 1 2.5v4.5h13v-4.5C14 2.224 13.776 2 13.5 2h-12Z"),
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
        return _viewHorizontal!!
    }

private var _viewHorizontal: ImageVector? = null
