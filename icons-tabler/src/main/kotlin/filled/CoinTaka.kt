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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 3.340 C 21.203 5.766 23.057 10.860 21.397 15.421 C 19.737 19.981 15.043 22.691 10.263 21.848 C 5.484 21.006 2.000 16.853 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340 ZM 10.789 7.724 C 10.295 6.736 9.094 6.335 8.106 6.829 L 7.553 7.106 C 7.077 7.362 6.892 7.950 7.133 8.433 C 7.375 8.917 7.957 9.121 8.447 8.894 L 9.000 8.618 L 8.999 10.000 L 8.000 10.000 C 7.493 10.000 7.066 10.380 7.007 10.883 L 7.000 11.000 C 7.000 11.552 7.448 12.000 8.000 12.000 L 8.999 12.000 L 9.000 15.000 C 9.000 16.589 10.238 17.902 11.824 17.995 L 12.000 18.000 L 12.500 18.000 C 14.433 18.000 16.000 16.433 16.000 14.500 L 16.000 14.000 C 16.000 13.448 15.552 13.000 15.000 13.000 L 14.000 13.000 C 13.448 13.000 13.000 13.448 13.000 14.000 L 13.007 14.117 C 13.061 14.576 13.424 14.939 13.883 14.993 L 13.915 14.995 L 13.895 15.052 C 13.669 15.624 13.115 16.000 12.500 16.000 L 12.000 16.000 C 11.448 16.000 11.000 15.552 11.000 15.000 L 10.999 12.000 L 15.000 12.000 C 15.507 12.000 15.934 11.620 15.993 11.117 L 16.000 11.000 C 16.000 10.448 15.552 10.000 15.000 10.000 L 10.999 10.000 L 11.000 8.618 C 11.000 8.370 10.954 8.124 10.864 7.893 L 10.789 7.723 Z"),
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
        return _coinTaka!!
    }

private var _coinTaka: ImageVector? = null
