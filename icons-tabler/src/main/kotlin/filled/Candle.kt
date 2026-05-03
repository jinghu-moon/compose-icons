package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Candle: ImageVector
    get() {
        if (_candle != null) return _candle!!
        _candle = tablerFilledIcon(
            name = "Candle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 9.000 C 15.105 9.000 16.000 9.895 16.000 11.000 L 16.000 21.000 C 16.000 21.552 15.552 22.000 15.000 22.000 L 9.000 22.000 C 8.448 22.000 8.000 21.552 8.000 21.000 L 8.000 11.000 C 8.000 9.895 8.895 9.000 10.000 9.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 11.254 1.334 C 11.444 1.122 11.715 1.001 12.000 1.001 C 12.284 1.001 12.555 1.122 12.745 1.334 L 14.197 2.957 C 15.290 4.131 15.266 5.956 14.143 7.101 C 13.021 8.246 11.196 8.306 10.001 7.237 C 8.806 6.167 8.662 4.348 9.704 3.071 Z"),
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
        return _candle!!
    }

private var _candle: ImageVector? = null
