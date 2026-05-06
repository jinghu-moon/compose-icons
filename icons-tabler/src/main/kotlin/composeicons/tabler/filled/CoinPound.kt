package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CoinPound: ImageVector
    get() {
        if (_coinPound != null) return _coinPound!!
        _coinPound = tablerFilledIcon(
            name = "CoinPound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3.34c4.203 2.426 6.057 7.52 4.397 12.081-1.66 4.56-6.354 7.271-11.134 6.428C5.484 21.006 2 16.853 2 12l.005-.324C2.119 8.163 4.069 4.968 7.141 3.26 10.213 1.552 13.956 1.582 17 3.34ZM13 6C11.343 6 10 7.343 10 9v2h-1c-.507 0-.934 .38-.993 .883L8 12c0 .552 .448 1 1 1h1v1c0 .464-.318 .867-.77 .974l-.113 .02L9 15c-1.287 0-1.332 1.864-.133 1.993L9 17h6c.552 0 1-.448 1-1l-.007-.117C15.934 15.38 15.507 15 15 15h-3.171l.048-.148c.082-.277 .123-.564 .123-.852v-1h1c.507-0 .934-.38 .993-.883L14 12c0-.552-.448-1-1-1h-1v-2c0-.507 .38-.934 .883-.993L13 8c.507 0 .934 .38 .993 .883L14 9c0 .552 .448 1 1 1 .552 0 1-.448 1-1C16 7.343 14.657 6 13 6Z"),
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
        return _coinPound!!
    }

private var _coinPound: ImageVector? = null
