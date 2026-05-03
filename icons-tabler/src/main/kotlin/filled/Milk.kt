package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Milk: ImageVector
    get() {
        if (_milk != null) return _milk!!
        _milk = tablerFilledIcon(
            name = "Milk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.799 7.000 L 17.943 7.230 C 18.634 8.340 19.000 9.622 19.000 10.930 L 19.000 19.000 C 19.000 20.657 17.657 22.000 16.000 22.000 L 8.000 22.000 C 6.343 22.000 5.000 20.657 5.000 19.000 L 5.000 10.929 C 5.000 9.622 5.366 8.341 6.057 7.231 L 6.199 7.000 ZM 12.000 13.000 C 10.411 13.000 9.098 14.238 9.005 15.824 L 9.000 16.000 C 9.000 17.657 10.343 19.000 12.000 19.000 C 13.657 19.000 15.000 17.657 15.000 16.000 C 15.000 14.343 13.657 13.000 12.000 13.000M 12.000 15.000 C 12.552 15.000 13.000 15.448 13.000 16.000 C 13.000 16.552 12.552 17.000 12.000 17.000 C 11.448 17.000 11.000 16.552 11.000 16.000 C 11.000 15.448 11.448 15.000 12.000 15.000M 14.000 9.000 L 10.000 9.000 C 9.448 9.000 9.000 9.448 9.000 10.000 C 9.000 10.552 9.448 11.000 10.000 11.000 L 14.000 11.000 C 14.552 11.000 15.000 10.552 15.000 10.000 C 15.000 9.448 14.552 9.000 14.000 9.000M 15.000 2.000 C 16.105 2.000 17.000 2.895 17.000 4.000 L 17.000 5.000 L 7.000 5.000 L 7.000 4.000 C 7.000 2.895 7.895 2.000 9.000 2.000 Z"),
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
        return _milk!!
    }

private var _milk: ImageVector? = null
