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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.164 12 12.957 5.793 11.543 7.207 16.336 12l-4.793 4.793 1.414 1.414L19.164 12ZM13.514 12 7.307 5.793 5.893 7.207 10.686 12 5.893 16.793l1.414 1.414L13.514 12Z"),
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
        return _arrowRightDoubleLine!!
    }

private var _arrowRightDoubleLine: ImageVector? = null
