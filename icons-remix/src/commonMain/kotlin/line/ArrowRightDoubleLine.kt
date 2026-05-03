package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ArrowRightDoubleLine: ImageVector
    get() {
        if (_arrowRightDoubleLine != null) return _arrowRightDoubleLine!!
        _arrowRightDoubleLine = remixIcon(
            name = "ArrowRightDoubleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.164 12.000 L 12.957 5.793 L 11.543 7.207 L 16.336 12.000 L 11.543 16.793 L 12.957 18.207 L 19.164 12.000 ZM 13.514 12.000 L 7.307 5.793 L 5.893 7.207 L 10.686 12.000 L 5.893 16.793 L 7.307 18.207 L 13.514 12.000 Z"),
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
        return _arrowRightDoubleLine!!
    }

private var _arrowRightDoubleLine: ImageVector? = null
