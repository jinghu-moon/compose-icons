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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 3.340 C 21.203 5.766 23.057 10.860 21.397 15.421 C 19.737 19.981 15.043 22.691 10.263 21.848 C 5.484 21.006 2.000 16.853 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340 ZM 13.000 6.000 C 11.343 6.000 10.000 7.343 10.000 9.000 L 10.000 11.000 L 9.000 11.000 C 8.493 11.000 8.066 11.380 8.007 11.883 L 8.000 12.000 C 8.000 12.552 8.448 13.000 9.000 13.000 L 10.000 13.000 L 10.000 14.000 C 10.000 14.464 9.682 14.867 9.230 14.974 L 9.117 14.994 L 9.000 15.000 C 7.713 15.000 7.668 16.864 8.867 16.993 L 9.000 17.000 L 15.000 17.000 C 15.552 17.000 16.000 16.552 16.000 16.000 L 15.993 15.883 C 15.934 15.380 15.507 15.000 15.000 15.000 L 11.829 15.000 L 11.877 14.852 C 11.959 14.575 12.000 14.288 12.000 14.000 L 12.000 13.000 L 13.000 13.000 C 13.507 13.000 13.934 12.620 13.993 12.117 L 14.000 12.000 C 14.000 11.448 13.552 11.000 13.000 11.000 L 12.000 11.000 L 12.000 9.000 C 12.000 8.493 12.380 8.066 12.883 8.007 L 13.000 8.000 C 13.507 8.000 13.934 8.380 13.993 8.883 L 14.000 9.000 C 14.000 9.552 14.448 10.000 15.000 10.000 C 15.552 10.000 16.000 9.552 16.000 9.000 C 16.000 7.343 14.657 6.000 13.000 6.000 Z"),
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
        return _coinPound!!
    }

private var _coinPound: ImageVector? = null
