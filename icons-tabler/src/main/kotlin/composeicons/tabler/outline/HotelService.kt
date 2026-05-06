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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.5 10C7.672 10 7 9.328 7 8.5 7 5.462 9.462 3 12.5 3 15.538 3 18 5.462 18 8.5v10.5c0 1.105-.895 2-2 2h-7C7.895 21 7 20.105 7 19v-2c0-1.38 .71-2.444 1.88-3.175l4.424-2.765C14.359 10.4 15 9.744 15 8.5 15 7.119 13.881 6 12.5 6 11.119 6 10 7.119 10 8.5 10 9.328 9.328 10 8.5 10"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _hotelService!!
    }

private var _hotelService: ImageVector? = null
