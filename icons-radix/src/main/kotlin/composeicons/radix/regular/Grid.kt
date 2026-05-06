package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Grid: ImageVector
    get() {
        if (_grid != null) return _grid!!
        _grid = radixIcon(
            name = "Grid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12.653 1.008C13.41 1.085 14 1.723 14 2.5v10l-.008 .153c-.072 .706-.633 1.267-1.339 1.339L12.5 14h-10l-.153-.008C1.641 13.92 1.079 13.359 1.008 12.653L1 12.5v-10C1 1.723 1.59 1.085 2.347 1.008L2.5 1h10l.153 .008ZM2 8v4.5c0 .276 .224 .5 .5 .5h4.5v-5h-5ZM8 8v5h4.5c.276 0 .5-.224 .5-.5v-4.5h-5ZM2.5 2C2.224 2 2 2.224 2 2.5v4.5h5v-5h-4.5ZM8 7h5v-4.5C13 2.224 12.776 2 12.5 2h-4.5v5Z"),
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
        return _grid!!
    }

private var _grid: ImageVector? = null
