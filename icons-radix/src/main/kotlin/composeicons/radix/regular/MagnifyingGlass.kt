package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.MagnifyingGlass: ImageVector
    get() {
        if (_magnifyingGlass != null) return _magnifyingGlass!!
        _magnifyingGlass = radixIcon(
            name = "MagnifyingGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.5 2C8.985 2 11 4.015 11 6.5c0 1.062-.37 2.038-.985 2.808l2.839 2.839 .064 .078c.128 .194 .106 .458-.064 .629-.171 .171-.435 .193-.629 .064l-.078-.064L9.308 10.015C8.538 10.63 7.562 11 6.5 11 4.015 11 2 8.985 2 6.5 2 4.015 4.015 2 6.5 2ZM6.5 3C4.567 3 3 4.567 3 6.5 3 8.433 4.567 10 6.5 10 8.433 10 10 8.433 10 6.5 10 4.567 8.433 3 6.5 3Z"),
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
        return _magnifyingGlass!!
    }

private var _magnifyingGlass: ImageVector? = null
