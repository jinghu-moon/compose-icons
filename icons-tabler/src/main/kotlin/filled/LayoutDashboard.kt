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
                pathData = parseSvgPathData("M 9.000 3.000 C 10.105 3.000 11.000 3.895 11.000 5.000 L 11.000 11.000 C 11.000 12.105 10.105 13.000 9.000 13.000 L 5.000 13.000 C 3.895 13.000 3.000 12.105 3.000 11.000 L 3.000 5.000 C 3.000 3.895 3.895 3.000 5.000 3.000 ZM 9.000 15.000 C 10.105 15.000 11.000 15.895 11.000 17.000 L 11.000 19.000 C 11.000 20.105 10.105 21.000 9.000 21.000 L 5.000 21.000 C 3.895 21.000 3.000 20.105 3.000 19.000 L 3.000 17.000 C 3.000 15.895 3.895 15.000 5.000 15.000 ZM 19.000 11.000 C 20.105 11.000 21.000 11.895 21.000 13.000 L 21.000 19.000 C 21.000 20.105 20.105 21.000 19.000 21.000 L 15.000 21.000 C 13.895 21.000 13.000 20.105 13.000 19.000 L 13.000 13.000 C 13.000 11.895 13.895 11.000 15.000 11.000 ZM 19.000 3.000 C 20.105 3.000 21.000 3.895 21.000 5.000 L 21.000 7.000 C 21.000 8.105 20.105 9.000 19.000 9.000 L 15.000 9.000 C 13.895 9.000 13.000 8.105 13.000 7.000 L 13.000 5.000 C 13.000 3.895 13.895 3.000 15.000 3.000 Z"),
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
