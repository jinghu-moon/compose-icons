package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ArrowTurnForwardFill: ImageVector
    get() {
        if (_arrowTurnForwardFill != null) return _arrowTurnForwardFill!!
        _arrowTurnForwardFill = remixIcon(
            name = "ArrowTurnForwardFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 8.000 L 17.000 13.000 C 17.000 16.314 14.314 19.000 11.000 19.000 C 7.686 19.000 5.000 16.314 5.000 13.000 L 5.000 4.000 L 3.000 4.000 L 3.000 13.000 C 3.000 17.418 6.582 21.000 11.000 21.000 C 15.418 21.000 19.000 17.418 19.000 13.000 L 19.000 8.000 L 23.000 8.000 L 18.000 2.000 L 13.000 8.000 L 17.000 8.000 Z"),
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
        return _arrowTurnForwardFill!!
    }

private var _arrowTurnForwardFill: ImageVector? = null
