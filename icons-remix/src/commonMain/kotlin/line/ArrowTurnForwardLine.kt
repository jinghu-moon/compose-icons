package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ArrowTurnForwardLine: ImageVector
    get() {
        if (_arrowTurnForwardLine != null) return _arrowTurnForwardLine!!
        _arrowTurnForwardLine = remixIcon(
            name = "ArrowTurnForwardLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 5.828 L 17.000 13.000 C 17.000 16.314 14.314 19.000 11.000 19.000 C 7.687 19.000 5.000 16.314 5.000 13.000 L 5.000 4.000 L 3.000 4.000 L 3.000 13.000 C 3.000 17.418 6.582 21.000 11.000 21.000 C 15.419 21.000 19.000 17.418 19.000 13.000 L 19.000 5.828 L 21.536 8.364 L 22.950 6.950 L 18.000 2.000 L 13.051 6.950 L 14.465 8.364 L 17.000 5.828 Z"),
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
        return _arrowTurnForwardLine!!
    }

private var _arrowTurnForwardLine: ImageVector? = null
