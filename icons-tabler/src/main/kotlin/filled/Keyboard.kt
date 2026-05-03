package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Keyboard: ImageVector
    get() {
        if (_keyboard != null) return _keyboard!!
        _keyboard = tablerFilledIcon(
            name = "Keyboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.000 5.000 C 21.657 5.000 23.000 6.343 23.000 8.000 L 23.000 16.000 C 23.000 17.657 21.657 19.000 20.000 19.000 L 4.000 19.000 C 2.343 19.000 1.000 17.657 1.000 16.000 L 1.000 8.000 C 1.000 6.343 2.343 5.000 4.000 5.000 ZM 6.000 13.000 C 5.448 13.000 5.000 13.448 5.000 14.000 L 5.000 14.010 C 5.000 14.562 5.448 15.010 6.000 15.010 C 6.552 15.010 7.000 14.562 7.000 14.010 L 7.000 14.000 C 7.000 13.448 6.552 13.000 6.000 13.000M 18.000 13.000 C 17.448 13.000 17.000 13.448 17.000 14.000 L 17.000 14.010 C 17.000 14.562 17.448 15.010 18.000 15.010 C 18.552 15.010 19.000 14.562 19.000 14.010 L 19.000 14.000 C 19.000 13.448 18.552 13.000 18.000 13.000M 10.002 13.000 C 9.450 12.999 9.001 13.446 9.000 13.998 C 8.999 14.550 9.446 14.999 9.998 15.000 L 13.998 15.010 C 14.550 15.011 14.999 14.565 15.000 14.012 C 15.002 13.460 14.555 13.011 14.003 13.010 ZM 6.000 9.000 C 5.448 9.000 5.000 9.448 5.000 10.000 L 5.000 10.010 C 5.000 10.562 5.448 11.010 6.000 11.010 C 6.552 11.010 7.000 10.562 7.000 10.010 L 7.000 10.000 C 7.000 9.448 6.552 9.000 6.000 9.000M 10.000 9.000 C 9.448 9.000 9.000 9.448 9.000 10.000 L 9.000 10.010 C 9.000 10.562 9.448 11.010 10.000 11.010 C 10.552 11.010 11.000 10.562 11.000 10.010 L 11.000 10.000 C 11.000 9.448 10.552 9.000 10.000 9.000M 14.000 9.000 C 13.448 9.000 13.000 9.448 13.000 10.000 L 13.000 10.010 C 13.000 10.562 13.448 11.010 14.000 11.010 C 14.552 11.010 15.000 10.562 15.000 10.010 L 15.000 10.000 C 15.000 9.448 14.552 9.000 14.000 9.000M 18.000 9.000 C 17.448 9.000 17.000 9.448 17.000 10.000 L 17.000 10.010 C 17.000 10.562 17.448 11.010 18.000 11.010 C 18.552 11.010 19.000 10.562 19.000 10.010 L 19.000 10.000 C 19.000 9.448 18.552 9.000 18.000 9.000"),
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
        return _keyboard!!
    }

private var _keyboard: ImageVector? = null
