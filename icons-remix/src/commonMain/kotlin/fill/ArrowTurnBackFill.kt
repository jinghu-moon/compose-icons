package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ArrowTurnBackFill: ImageVector
    get() {
        if (_arrowTurnBackFill != null) return _arrowTurnBackFill!!
        _arrowTurnBackFill = remixIcon(
            name = "ArrowTurnBackFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.000 16.000 L 13.000 16.000 L 18.000 22.000 L 23.000 16.000 L 19.000 16.000 L 19.000 11.000 C 19.000 6.582 15.418 3.000 11.000 3.000 C 6.582 3.000 3.000 6.582 3.000 11.000 L 3.000 20.000 L 5.000 20.000 L 5.000 11.000 C 5.000 7.686 7.686 5.000 11.000 5.000 C 14.314 5.000 17.000 7.686 17.000 11.000 L 17.000 16.000 Z"),
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
        return _arrowTurnBackFill!!
    }

private var _arrowTurnBackFill: ImageVector? = null
