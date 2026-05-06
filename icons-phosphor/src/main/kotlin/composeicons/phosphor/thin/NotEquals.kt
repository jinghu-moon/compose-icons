package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NotEquals: ImageVector
    get() {
        if (_notEquals != null) return _notEquals!!
        _notEquals = phosphorThinIcon(
            name = "NotEquals",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 160c0 2.209-1.791 4-4 4h-115.32L51 218.69c-1.486 1.657-4.033 1.796-5.69 .31-1.657-1.486-1.796-4.033-.31-5.69L89.87 164h-49.87c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h57.14l50.91-56h-108.05c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h115.32L205 37.31c1.486-1.657 4.033-1.796 5.69-.31 1.657 1.486 1.796 4.033 .31 5.69L166.13 92h49.87c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-57.14L108 156h108c2.209 0 4 1.791 4 4Z"),
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
        return _notEquals!!
    }

private var _notEquals: ImageVector? = null
