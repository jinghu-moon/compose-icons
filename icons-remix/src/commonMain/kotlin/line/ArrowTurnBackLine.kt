package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ArrowTurnBackLine: ImageVector
    get() {
        if (_arrowTurnBackLine != null) return _arrowTurnBackLine!!
        _arrowTurnBackLine = remixIcon(
            name = "ArrowTurnBackLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 18.172 L 14.465 15.636 L 13.051 17.050 L 18.000 22.000 L 22.950 17.050 L 21.536 15.636 L 19.000 18.172 L 19.000 11.000 C 19.000 6.582 15.419 3.000 11.000 3.000 C 6.582 3.000 3.000 6.582 3.000 11.000 L 3.000 20.000 L 5.000 20.000 L 5.000 11.000 C 5.000 7.686 7.687 5.000 11.000 5.000 C 14.314 5.000 17.000 7.686 17.000 11.000 L 17.000 18.172 Z"),
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
        return _arrowTurnBackLine!!
    }

private var _arrowTurnBackLine: ImageVector? = null
