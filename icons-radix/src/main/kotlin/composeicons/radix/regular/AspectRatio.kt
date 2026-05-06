package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.AspectRatio: ImageVector
    get() {
        if (_aspectRatio != null) return _aspectRatio!!
        _aspectRatio = radixIcon(
            name = "AspectRatio",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.653 1.008C13.41 1.085 14 1.723 14 2.5v10l-.008 .153c-.072 .706-.633 1.267-1.339 1.339L12.5 14h-10l-.153-.008C1.641 13.92 1.079 13.359 1.008 12.653L1 12.5v-10C1 1.723 1.59 1.085 2.347 1.008L2.5 1h10l.153 .008ZM2.5 2C2.224 2 2 2.224 2 2.5v10c0 .276 .224 .5 .5 .5h10c.276 0 .5-.224 .5-.5v-10C13 2.224 12.776 2 12.5 2h-10ZM7.5 7C7.776 7 8 7.224 8 7.5 8 7.776 7.776 8 7.5 8 7.224 8 7 7.776 7 7.5 7 7.224 7.224 7 7.5 7ZM9.5 7c.276 0 .5 .224 .5 .5C10 7.776 9.776 8 9.5 8 9.224 8 9 7.776 9 7.5 9 7.224 9.224 7 9.5 7ZM11.5 7c.276 0 .5 .224 .5 .5C12 7.776 11.776 8 11.5 8 11.224 8 11 7.776 11 7.5 11 7.224 11.224 7 11.5 7ZM7.5 5C7.776 5 8 5.224 8 5.5 8 5.776 7.776 6 7.5 6 7.224 6 7 5.776 7 5.5 7 5.224 7.224 5 7.5 5ZM7.5 3C7.776 3 8 3.224 8 3.5 8 3.776 7.776 4 7.5 4 7.224 4 7 3.776 7 3.5 7 3.224 7.224 3 7.5 3Z"),
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
        return _aspectRatio!!
    }

private var _aspectRatio: ImageVector? = null
