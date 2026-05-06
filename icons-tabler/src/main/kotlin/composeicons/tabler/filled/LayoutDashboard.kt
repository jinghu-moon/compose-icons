package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.LayoutDashboard: ImageVector
    get() {
        if (_layoutDashboard != null) return _layoutDashboard!!
        _layoutDashboard = tablerFilledIcon(
            name = "LayoutDashboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 3c1.105 0 2 .895 2 2v6c0 1.105-.895 2-2 2h-4C3.895 13 3 12.105 3 11v-6C3 3.895 3.895 3 5 3ZM9 15c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2h-4C3.895 21 3 20.105 3 19v-2c0-1.105 .895-2 2-2ZM19 11c1.105 0 2 .895 2 2v6c0 1.105-.895 2-2 2h-4c-1.105 0-2-.895-2-2v-6c0-1.105 .895-2 2-2ZM19 3c1.105 0 2 .895 2 2v2c0 1.105-.895 2-2 2h-4C13.895 9 13 8.105 13 7v-2c0-1.105 .895-2 2-2Z"),
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
        return _layoutDashboard!!
    }

private var _layoutDashboard: ImageVector? = null
