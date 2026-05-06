package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ViewVertical: ImageVector
    get() {
        if (_viewVertical != null) return _viewVertical!!
        _viewVertical = radixIcon(
            name = "ViewVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.653 1.008C14.41 1.085 15 1.723 15 2.5v10l-.008 .153c-.072 .706-.633 1.267-1.339 1.339L13.5 14h-12l-.153-.008C.641 13.92 .079 13.359 .008 12.653L0 12.5v-10C0 1.723 .59 1.085 1.347 1.008L1.5 1h12l.153 .008ZM1.5 2C1.224 2 1 2.224 1 2.5v10c0 .276 .224 .5 .5 .5h5.5v-11h-5.5ZM8 13h5.5c.276 0 .5-.224 .5-.5v-10C14 2.224 13.776 2 13.5 2h-5.5v11Z"),
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
        return _viewVertical!!
    }

private var _viewVertical: ImageVector? = null
