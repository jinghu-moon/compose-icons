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
                pathData = parseSvgPathData("M 17.000 3.340 C 21.203 5.766 23.057 10.860 21.397 15.421 C 19.737 19.981 15.043 22.691 10.263 21.848 C 5.484 21.006 2.000 16.853 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340 ZM 13.000 6.000 C 12.448 6.000 12.000 6.448 12.000 7.000 L 11.000 7.000 C 11.000 6.448 10.552 6.000 10.000 6.000 C 9.448 6.000 9.000 6.448 9.000 7.000 C 8.448 7.000 8.000 7.448 8.000 8.000 C 8.000 8.552 8.448 9.000 9.000 9.000 L 9.000 15.000 C 8.448 15.000 8.000 15.448 8.000 16.000 C 8.000 16.552 8.448 17.000 9.000 17.000 C 9.000 18.333 11.000 18.333 11.000 17.000 L 12.000 17.000 C 12.000 17.552 12.448 18.000 13.000 18.000 C 13.552 18.000 14.000 17.552 14.000 17.000 L 14.000 16.850 C 15.167 16.456 16.000 15.323 16.000 14.000 L 15.995 13.825 C 15.958 13.152 15.700 12.510 15.261 11.998 C 15.721 11.466 16.000 10.765 16.000 10.000 C 16.000 8.677 15.167 7.544 14.000 7.150 L 14.000 7.000 C 14.000 6.448 13.552 6.000 13.000 6.000 ZM 13.090 13.000 C 13.582 13.000 14.000 13.437 14.000 14.000 C 14.000 14.563 13.582 15.000 13.090 15.000 L 11.000 15.000 L 11.000 13.000 L 13.090 13.000 ZM 13.090 9.000 C 13.582 9.000 14.000 9.437 14.000 10.000 C 14.000 10.522 13.640 10.937 13.194 10.993 L 13.090 11.000 L 11.000 11.000 L 11.000 9.000 L 13.090 9.000 Z"),
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
