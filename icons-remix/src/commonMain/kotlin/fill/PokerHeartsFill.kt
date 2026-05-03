package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PokerHeartsFill: ImageVector
    get() {
        if (_pokerHeartsFill != null) return _pokerHeartsFill!!
        _pokerHeartsFill = remixIcon(
            name = "PokerHeartsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 2.000 8.500 C 2.000 5.462 4.462 3.000 7.500 3.000 C 9.360 3.000 11.005 3.923 12.000 5.337 C 12.995 3.923 14.640 3.000 16.500 3.000 C 19.538 3.000 22.000 5.462 22.000 8.500 C 22.000 16.000 12.000 21.485 12.000 21.485 C 12.000 21.485 2.000 16.000 2.000 8.500 Z"),
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
        return _pokerHeartsFill!!
    }

private var _pokerHeartsFill: ImageVector? = null
