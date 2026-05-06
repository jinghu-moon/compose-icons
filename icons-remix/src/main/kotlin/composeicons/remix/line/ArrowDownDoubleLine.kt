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
                pathData = parseSvgPathData("M12 19.164l6.207-6.207L16.793 11.543 12 16.336 7.207 11.543 5.793 12.957 12 19.164ZM12 13.514 18.207 7.307 16.793 5.893 12 10.686 7.207 5.893 5.793 7.307 12 13.514Z"),
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
