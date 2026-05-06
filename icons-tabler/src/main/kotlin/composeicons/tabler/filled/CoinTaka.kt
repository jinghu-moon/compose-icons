package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CoinTaka: ImageVector
    get() {
        if (_coinTaka != null) return _coinTaka!!
        _coinTaka = tablerFilledIcon(
            name = "CoinTaka",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3.34c4.203 2.426 6.057 7.52 4.397 12.081-1.66 4.56-6.354 7.271-11.134 6.428C5.484 21.006 2 16.853 2 12l.005-.324C2.119 8.163 4.069 4.968 7.141 3.26 10.213 1.552 13.956 1.582 17 3.34ZM10.789 7.724C10.295 6.736 9.094 6.335 8.106 6.829l-.553 .277c-.476 .256-.661 .844-.42 1.327 .242 .483 .823 .687 1.314 .461L9 8.618 8.999 10h-.999c-.507 0-.934 .38-.993 .883L7 11c0 .552 .448 1 1 1h.999L9 15c-0 1.589 1.238 2.902 2.824 2.995L12 18h.5C14.433 18 16 16.433 16 14.5v-.5c0-.552-.448-1-1-1h-1c-.552 0-1 .448-1 1l.007 .117c.054 .459 .417 .822 .876 .876l.032 .002-.02 .057c-.226 .572-.78 .948-1.395 .948h-.5c-.552 0-1-.448-1-1l-.001-3h4.001c.507-0 .934-.38 .993-.883L16 11c0-.552-.448-1-1-1h-4.001L11 8.618c0-.248-.046-.494-.136-.725l-.075-.17Z"),
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
        return _coinTaka!!
    }

private var _coinTaka: ImageVector? = null
