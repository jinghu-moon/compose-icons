package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CoinYuan: ImageVector
    get() {
        if (_coinYuan != null) return _coinYuan!!
        _coinYuan = tablerFilledIcon(
            name = "CoinYuan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 3.340 C 21.203 5.766 23.057 10.860 21.397 15.421 C 19.737 19.981 15.043 22.691 10.263 21.848 C 5.484 21.006 2.000 16.853 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340 ZM 15.555 7.168 C 15.334 7.021 15.064 6.967 14.804 7.019 C 14.544 7.071 14.315 7.224 14.168 7.445 L 12.000 10.696 L 9.832 7.446 C 9.551 7.024 8.998 6.879 8.546 7.109 L 8.446 7.168 C 8.225 7.315 8.072 7.544 8.020 7.804 C 7.967 8.064 8.021 8.334 8.168 8.555 L 10.464 12.000 L 9.000 12.000 C 8.493 12.000 8.066 12.380 8.007 12.883 L 8.000 13.000 C 8.000 13.552 8.448 14.000 9.000 14.000 L 11.000 14.000 L 11.000 17.000 C 11.000 17.507 11.380 17.934 11.883 17.993 L 12.000 18.000 L 12.117 17.993 C 12.620 17.934 13.000 17.507 13.000 17.000 L 13.000 14.000 L 15.000 14.000 C 15.507 14.000 15.934 13.620 15.993 13.117 L 16.000 13.000 C 16.000 12.448 15.552 12.000 15.000 12.000 L 13.535 12.000 L 15.832 8.555 C 16.114 8.133 16.035 7.567 15.648 7.238 L 15.555 7.168 Z"),
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
        return _coinYuan!!
    }

private var _coinYuan: ImageVector? = null
