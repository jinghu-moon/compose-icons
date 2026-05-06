package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CoinBitcoin: ImageVector
    get() {
        if (_coinBitcoin != null) return _coinBitcoin!!
        _coinBitcoin = tablerFilledIcon(
            name = "CoinBitcoin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 3.34c4.203 2.426 6.057 7.52 4.397 12.081-1.66 4.56-6.354 7.271-11.134 6.428C5.484 21.006 2 16.853 2 12l.005-.324C2.119 8.163 4.069 4.968 7.141 3.26 10.213 1.552 13.956 1.582 17 3.34ZM13 6c-.552 0-1 .448-1 1h-1C11 6.448 10.552 6 10 6 9.448 6 9 6.448 9 7 8.448 7 8 7.448 8 8c0 .552 .448 1 1 1v6c-.552 0-1 .448-1 1 0 .552 .448 1 1 1 0 1.333 2 1.333 2 0h1c0 .552 .448 1 1 1 .552 0 1-.448 1-1v-.15c1.167-.394 2-1.527 2-2.85l-.005-.175c-.037-.673-.295-1.315-.734-1.827C15.721 11.466 16 10.765 16 10 16 8.677 15.167 7.544 14 7.15v-.15C14 6.448 13.552 6 13 6ZM13.09 13c.492 0 .91 .437 .91 1 0 .563-.418 1-.91 1h-2.09v-2h2.09ZM13.09 9c.492 0 .91 .437 .91 1 0 .522-.36 .937-.806 .993L13.09 11h-2.09v-2h2.09Z"),
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
        return _coinBitcoin!!
    }

private var _coinBitcoin: ImageVector? = null
