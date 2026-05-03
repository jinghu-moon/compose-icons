package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Settings6Fill: ImageVector
    get() {
        if (_settings6Fill != null) return _settings6Fill!!
        _settings6Fill = remixIcon(
            name = "Settings6Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.500 2.474 L 23.000 12.000 L 17.500 21.526 L 6.500 21.526 L 1.000 12.000 L 6.500 2.474 L 17.500 2.474 ZM 8.634 8.170 L 13.634 16.830 L 15.366 15.830 L 10.366 7.170 L 8.634 8.170 Z"),
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
        return _settings6Fill!!
    }

private var _settings6Fill: ImageVector? = null
