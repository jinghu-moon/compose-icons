package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.DualScreen: ImageVector
    get() {
        if (_dualScreen != null) return _dualScreen!!
        _dualScreen = tablerFilledIcon(
            name = "DualScreen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 3.000 C 19.552 3.000 20.000 3.448 20.000 4.000 L 20.000 19.000 C 20.000 19.552 19.552 20.000 19.000 20.000 L 14.000 20.000 L 14.000 22.000 C 14.000 22.328 13.839 22.635 13.569 22.822 C 13.300 23.008 12.956 23.051 12.649 22.936 L 4.649 19.936 C 4.259 19.790 4.000 19.417 4.000 19.000 L 4.000 4.000 C 4.000 3.777 4.075 3.560 4.212 3.384 L 4.280 3.305 L 4.358 3.233 L 4.424 3.183 L 4.516 3.125 L 4.581 3.092 L 4.681 3.052 L 4.780 3.024 L 4.826 3.014 L 4.934 3.001 L 5.000 3.000 ZM 13.351 6.064 C 13.741 6.210 14.000 6.583 14.000 7.000 L 14.000 18.000 L 18.000 18.000 L 18.000 5.000 L 10.514 5.000 Z"),
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
        return _dualScreen!!
    }

private var _dualScreen: ImageVector? = null
