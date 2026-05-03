package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HotelService: ImageVector
    get() {
        if (_hotelService != null) return _hotelService!!
        _hotelService = tablerOutlineIcon(
            name = "HotelService",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 8.500 10.000 C 7.672 10.000 7.000 9.328 7.000 8.500 C 7.000 5.462 9.462 3.000 12.500 3.000 C 15.538 3.000 18.000 5.462 18.000 8.500 L 18.000 19.000 C 18.000 20.105 17.105 21.000 16.000 21.000 L 9.000 21.000 C 7.895 21.000 7.000 20.105 7.000 19.000 L 7.000 17.000 C 7.000 15.620 7.710 14.556 8.880 13.825 L 13.304 11.060 C 14.359 10.400 15.000 9.744 15.000 8.500 C 15.000 7.119 13.881 6.000 12.500 6.000 C 11.119 6.000 10.000 7.119 10.000 8.500 C 10.000 9.328 9.328 10.000 8.500 10.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _hotelService!!
    }

private var _hotelService: ImageVector? = null
