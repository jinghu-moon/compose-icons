package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.GameFill: ImageVector
    get() {
        if (_gameFill != null) return _gameFill!!
        _gameFill = remixIcon(
            name = "GameFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 15.122 2.000 17.909 3.430 19.743 5.671 L 13.414 12.000 L 19.743 18.329 C 17.909 20.570 15.122 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 12.000 5.000 C 11.172 5.000 10.500 5.672 10.500 6.500 C 10.500 7.328 11.172 8.000 12.000 8.000 C 12.828 8.000 13.500 7.328 13.500 6.500 C 13.500 5.672 12.828 5.000 12.000 5.000 Z"),
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
        return _gameFill!!
    }

private var _gameFill: ImageVector? = null
