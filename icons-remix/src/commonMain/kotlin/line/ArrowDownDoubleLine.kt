package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ArrowDownDoubleLine: ImageVector
    get() {
        if (_arrowDownDoubleLine != null) return _arrowDownDoubleLine!!
        _arrowDownDoubleLine = remixIcon(
            name = "ArrowDownDoubleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 19.164 L 18.207 12.957 L 16.793 11.543 L 12.000 16.336 L 7.207 11.543 L 5.793 12.957 L 12.000 19.164 ZM 12.000 13.514 L 18.207 7.307 L 16.793 5.893 L 12.000 10.686 L 7.207 5.893 L 5.793 7.307 L 12.000 13.514 Z"),
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
        return _arrowDownDoubleLine!!
    }

private var _arrowDownDoubleLine: ImageVector? = null
