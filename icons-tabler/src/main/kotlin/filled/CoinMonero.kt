package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CoinMonero: ImageVector
    get() {
        if (_coinMonero != null) return _coinMonero!!
        _coinMonero = tablerFilledIcon(
            name = "CoinMonero",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.000 11.414 L 15.000 16.000 C 15.000 16.552 15.448 17.000 16.000 17.000 L 20.660 17.001 C 18.874 20.095 15.572 22.001 12.000 22.001 C 8.428 22.001 5.126 20.095 3.340 17.001 L 8.000 17.000 L 8.117 16.993 C 8.620 16.934 9.000 16.507 9.000 16.000 L 9.000 11.415 L 11.293 13.707 L 11.387 13.790 C 11.785 14.099 12.351 14.063 12.707 13.707 L 15.000 11.414 ZM 17.000 3.340 C 21.058 5.683 22.946 10.530 21.540 15.000 L 17.000 15.000 L 17.000 9.000 C 17.000 8.110 15.923 7.663 15.293 8.293 L 12.000 11.585 L 8.707 8.293 L 8.623 8.217 C 7.986 7.703 7.000 8.147 7.000 9.000 L 7.000 15.000 L 2.460 15.000 C 2.155 14.029 2.000 13.018 2.000 12.000 L 2.005 11.676 C 2.119 8.163 4.069 4.968 7.141 3.260 C 10.213 1.552 13.956 1.582 17.000 3.340 Z"),
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
        return _coinMonero!!
    }

private var _coinMonero: ImageVector? = null
