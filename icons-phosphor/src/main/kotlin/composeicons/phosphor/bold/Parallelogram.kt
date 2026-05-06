package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Parallelogram: ImageVector
    get() {
        if (_parallelogram != null) return _parallelogram!!
        _parallelogram = phosphorBoldIcon(
            name = "Parallelogram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M248.78 45.14C245.108 39.434 238.785 35.99 232 36h-143.19C80.94 35.999 73.801 40.614 70.57 47.79L5.77 191.79c-2.786 6.188-2.244 13.366 1.439 19.065 3.683 5.699 10.005 9.142 16.791 9.145h143.19c7.87 .001 15.009-4.614 18.24-11.79L250.23 64.21c2.803-6.188 2.256-13.377-1.45-19.07ZM164.6 196h-134.4L91.4 60h134.4Z"),
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
        return _parallelogram!!
    }

private var _parallelogram: ImageVector? = null
