package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ChartFunnel: ImageVector
    get() {
        if (_chartFunnel != null) return _chartFunnel!!
        _chartFunnel = tablerFilledIcon(
            name = "ChartFunnel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.72 16l-1.315 3.948c-.408 1.226-1.555 2.052-2.847 2.052h-3.116C9.15 22 8.003 21.174 7.595 19.948L6.28 16ZM19.72 10l-1.333 4h-12.774L4.28 10ZM19.614 2c.643 0 1.246 .31 1.621 .831 .376 .521 .478 1.191 .275 1.801L20.387 8h-16.774L2.49 4.632C2.297 4.052 2.38 3.415 2.715 2.904c.335-.511 .886-.841 1.495-.896L4.387 2Z"),
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
        return _chartFunnel!!
    }

private var _chartFunnel: ImageVector? = null
