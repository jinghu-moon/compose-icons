package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PlayCard9: ImageVector
    get() {
        if (_playCard9 != null) return _playCard9!!
        _playCard9 = tablerFilledIcon(
            name = "PlayCard9",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 2.000 C 18.657 2.000 20.000 3.343 20.000 5.000 L 20.000 19.000 C 20.000 20.657 18.657 22.000 17.000 22.000 L 7.000 22.000 C 5.343 22.000 4.000 20.657 4.000 19.000 L 4.000 5.000 C 4.000 3.343 5.343 2.000 7.000 2.000 ZM 17.010 18.000 L 17.000 18.000 C 16.448 18.000 16.000 18.448 16.000 19.000 C 16.000 19.552 16.448 20.000 17.000 20.000 L 17.010 20.000 C 17.562 20.000 18.010 19.552 18.010 19.000 C 18.010 18.448 17.562 18.000 17.010 18.000M 13.000 8.000 L 11.000 8.000 C 9.895 8.000 9.000 8.895 9.000 10.000 L 9.000 11.000 L 9.005 11.150 C 9.083 12.194 9.953 13.000 11.000 13.000 L 13.000 13.000 L 13.000 14.000 L 10.000 14.000 C 9.448 14.000 9.000 14.448 9.000 15.000 C 9.000 15.552 9.448 16.000 10.000 16.000 L 13.000 16.000 C 14.105 16.000 15.000 15.105 15.000 14.000 L 15.000 10.000 C 15.000 8.895 14.105 8.000 13.000 8.000M 13.000 10.000 L 13.000 11.000 L 11.000 11.000 L 11.000 10.000 ZM 7.010 4.000 L 7.000 4.000 C 6.448 4.000 6.000 4.448 6.000 5.000 C 6.000 5.552 6.448 6.000 7.000 6.000 L 7.010 6.000 C 7.562 6.000 8.010 5.552 8.010 5.000 C 8.010 4.448 7.562 4.000 7.010 4.000"),
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
        return _playCard9!!
    }

private var _playCard9: ImageVector? = null
