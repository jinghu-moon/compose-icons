package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Gift: ImageVector
    get() {
        if (_gift != null) return _gift!!
        _gift = tablerFilledIcon(
            name = "Gift",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.000 14.000 L 11.000 22.000 L 7.000 22.000 C 5.343 22.000 4.000 20.657 4.000 19.000 L 4.000 15.000 C 4.000 14.448 4.448 14.000 5.000 14.000 L 11.000 14.000 ZM 19.000 14.000 C 19.552 14.000 20.000 14.448 20.000 15.000 L 20.000 19.000 C 20.000 20.657 18.657 22.000 17.000 22.000 L 13.000 22.000 L 13.000 14.000 L 19.000 14.000 ZM 16.500 2.000 C 17.700 2.000 18.817 2.615 19.459 3.629 C 20.100 4.643 20.177 5.916 19.663 7.000 L 20.000 7.000 C 21.105 7.000 22.000 7.895 22.000 9.000 L 22.000 10.000 C 22.000 11.105 21.105 12.000 20.000 12.000 L 13.000 12.000 L 13.000 7.000 L 11.000 7.000 L 11.000 12.000 L 4.000 12.000 C 2.895 12.000 2.000 11.105 2.000 10.000 L 2.000 9.000 C 2.000 7.895 2.895 7.000 4.000 7.000 L 4.337 7.000 C 4.114 6.531 3.999 6.019 4.000 5.500 C 4.000 3.567 5.567 2.000 7.483 2.000 C 9.238 1.970 10.795 3.092 11.864 4.934 L 12.000 5.177 C 13.033 3.263 14.560 2.063 16.291 2.002 L 16.500 2.000 ZM 7.500 4.000 C 6.672 4.000 6.000 4.672 6.000 5.500 C 6.000 6.328 6.672 7.000 7.500 7.000 L 10.643 7.000 C 9.902 5.095 8.694 3.980 7.500 4.000 ZM 16.483 4.000 C 15.303 3.980 14.098 5.096 13.357 7.000 L 16.500 7.000 C 17.328 6.995 17.996 6.320 17.992 5.491 C 17.987 4.663 17.311 3.995 16.483 4.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _gift!!
    }

private var _gift: ImageVector? = null
